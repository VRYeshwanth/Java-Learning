import java.util.Scanner;

public class Pattern_3
{
    public static void DiamondPattern(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n-i+1; j++)
                System.out.print(" ");
            for(int j = 1; j <= (2*i)-1; j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i = 1; i <= (2*n)+1; i++)
            System.out.print("*");
        System.out.println();
        for(int i = n; i >= 1; i--)
        {
            for(int j = 1; j <= n-i+1; j++)
                System.out.print(" ");
            for(int j = 1; j <= (2*i)-1; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void ButterflyPattern(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
                System.out.print("*");
            for(int j = 1; j <= 2*(n-i); j++)
                System.out.print(" ");
            for(int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i = n; i >= 1; i--)
        {
            for(int j = 1; j <= i; j++)
                System.out.print("*");
            for(int j = 1; j <= 2*(n-i); j++)
                System.out.print(" ");
            for(int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        DiamondPattern(n);
        ButterflyPattern(n);
        sc.close();
    }
}