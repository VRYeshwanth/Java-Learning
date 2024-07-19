import java.util.Scanner;
public class Divisibility
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        long num = sc.nextLong();
        sc.close();
        System.out.println();
        System.out.println(num+ " / 2 = " +check_2(num));
        System.out.println(num+ " / 3 = " +check_3(num));
        System.out.println(num+ " / 4 = " +check_4(num));
        System.out.println(num+ " / 5 = " +check_5(num));
        System.out.println(num+ " / 6 = " +check_6(num));
        System.out.println(num+ " / 8 = " +check_8(num));
        System.out.println(num+ " / 9 = " +check_9(num));
    }

    public static int count_digits(long n)
    {
        int count = 0;
        while(n != 0)
        {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static boolean check_2(long num)
    {
        int unit_digit = (int)(num % 10);
        int valid_nums[] = {0,2,4,6,8};
        boolean isDiv2 = false;
        for(int n: valid_nums)
        {
            if (n == unit_digit)
            {
                isDiv2 = true;
                break;
            }
        }
        return isDiv2;
    }

    public static boolean check_3(long num)
    {
        int num_len = count_digits(num);
        int digits[] = new int[num_len];
        for(int i = 0; i < num_len; i++)
        {
            int r = (int)(num % 10);
            digits[i] = r;
            num /= 10;
        }
        int sum = 0;
        for(int n: digits)
            sum += n;
        boolean isDiv3;
        if (sum % 3 == 0)
            isDiv3 = true;
        else
            isDiv3 = false;
        
        return isDiv3;
    }

    public static boolean check_4(long num)
    {
        int tens_digits = (int)(num % 100);
        boolean isDiv4 = (tens_digits % 4 == 0) ? true:false;
        return isDiv4;
    }

    public static boolean check_5(long num)
    {
        int unit_digit = (int)(num % 10);
        boolean isDiv5 = (unit_digit == 0 || unit_digit == 5) ? true: false;
        return isDiv5;
    }

    public static boolean check_6(long num)
    {
        boolean isDiv6 = (check_2(num) == true && check_3(num) == true) ? true: false;
        return isDiv6;
    }

    public static boolean check_8(long num)
    {
        int hund_digits = (int)(num % 1000);
        boolean isDiv8 = (hund_digits % 8 == 0) ? true:false;
        return isDiv8;
    }

    public static boolean check_9(long num)
    {
        int num_len = count_digits(num);
        int digits[] = new int[num_len];
        for(int i = 0; i < num_len; i++)
        {
            int r = (int)(num % 10);
            digits[i] = r;
            num /= 10;
        }
        int sum = 0;
        for(int n: digits)
            sum += n;
        boolean isDiv9;
        if (sum % 9 == 0)
            isDiv9 = true;
        else
            isDiv9 = false;
        
        return isDiv9;
    }
}