import java.util.Scanner;
public class Series_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program prints the pattern (1+2/1*2) + (1+2+3/1*2*3) + ..... + (1+2+3+.....+n/1*2*3*.....*n)");
        System.out.print("Enter the value of n : ");

        int n = sc.nextInt();
        double total_sum = 0;

        for(int i = 1; i <= n+1; i++)
        {
            double p = 1;
            double s = 0;
            for(int j = 1; j <= i; j++)
            {
                s += j;
                p *= j;
            }
            total_sum += s/p;
        }
        System.out.println("Sum = "+(total_sum-1));
        sc.close();
    }
}