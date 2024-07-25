import java.util.Scanner;

public class GCD
{
    public static void GCD_Recursion(int max, int min)
    {
        int rem;
        rem = max % min;
        if(rem == 0)
        {
            System.out.println(min);
            return;
        }
        GCD_Recursion(min, rem);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int dividend = (n1 > n2) ? n1 : n2;
        int divisor = (n1 < n2) ? n1 : n2;
        GCD_Recursion(dividend, divisor);
        sc.close();
    }
}
