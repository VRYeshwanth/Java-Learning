import java.util.Scanner;

public class Krishnamurthy_Number extends Factorial
{
    public static void checkKrishnamurthyNumber(int num)
    {
        int sum = 0;
        int temp = num;

        while(num > 0)
        {
            int r = num % 10;
            sum += findFactorial(r);
            num /= 10;
        }
        
        System.out.println((temp == sum) ? temp+" is a Krishnamurthy number" : temp+" is not a Krishnamurthy number");
    }
    public static void main(String args[])
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        checkKrishnamurthyNumber(n);
    }
}