import java.util.Scanner;

public class Factorial
{
    public static long findFactorial(int num)
    {
        if (num == 1 || num == 0)
            return 1;
        return num * findFactorial(num-1);
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