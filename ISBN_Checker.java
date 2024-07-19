/*
 * This program checks for valid ISBN numbers
 */
import java.util.Scanner;
public class ISBN_Checker
{
    public static void check10(String num)
    {
        long isbn = Long.parseLong(num);
        int loc[] = new int[10];
        for(int i = 9; i >= 0; i--)
        {
            int lastDigit = (int)(isbn % 10);
            loc[i] = lastDigit;
            isbn /= 10;
        }
        int counter = 10;
        int sum = 0;
        for(int n : loc)
        {
            sum += n * counter;
            counter--;
        }
        if (sum % 11 == 0)
            System.out.println(num+ " is a valid ISBN");
        else
            System.out.println(num+ " is not a valid ISBN");
    }

    public static void check13(String num)
    {
        long isbn = Long.parseLong(num);
        int loc[] = new int[13];
        for(int i = 12; i >= 0; i--)
        {
            int lastDigit = (int)(isbn % 10);
            loc[i] = lastDigit;
            isbn /= 10;
        }
        int sum = 0;
        for(int i = 1; i <= 13; i++)
        {
            if (i % 2 != 0)
                sum += loc[i-1];
            else
                sum += loc[i-1] * 3;
        }
        if (sum % 10 == 0)
            System.out.println(num+ " is a valid ISBN");
        else
            System.out.println(num+ " is not a valid ISBN");
    }

    public static void checkValidISBN(String num)
    {
        int l = num.length();

        for(int i = 0; i < l; i++)
        {
            char ch = num.charAt(i);
            if (ch < '0' || ch > '9')
            {
                System.out.println("Invalid ISBN number");
                System.exit(0);
            }
        }
        if (!(l == 10 || l == 13))
        {
            System.out.println("Invalid ISBN length");
            System.exit(0);
        }

        if (l == 10)
            check10(num);
        else
            check13(num);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an ISBN number : ");
        String ISBN = sc.nextLine();
        checkValidISBN(ISBN);
        sc.close();
    }
}