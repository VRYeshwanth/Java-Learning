import java.util.Scanner;

public class GCD
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int rem = 2;
        int dividend = Math.max(n1, n2);
        int divisor = Math.min(n1, n2);
        while(rem != 0)
        {
            rem = dividend % divisor;
            dividend = divisor;
            if (rem != 0)
                divisor = rem;
        }
        System.out.println("The GCD of " + n1 + " and " + n2 + " is: " + dividend);
        sc.close();
    }
}
