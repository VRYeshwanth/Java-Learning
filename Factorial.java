import java.util.Scanner;

public class Factorial
{
    public static long findFactorial(int num)
    {
        int prod = 1;
        for(int i = 1; i <= num; i++)
            prod *= i;
        return prod;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(findFactorial(n));
    }
}