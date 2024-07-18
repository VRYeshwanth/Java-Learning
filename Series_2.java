import java.util.Scanner;
public class Series_2 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number from 1 - 3 to display a random series : ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println("Series: 1 + (1/2!) + (1/3!) + ..... + (1/n!)");
                System.out.print("Enter the value of n : ");
                int n1 = sc.nextInt();
                double sum1 = 0;
                for(int i = 1; i <= n1; i++)
                {
                    double fact = 1;
                    for(int j = 1; j <= i; j++)
                        fact *= j;
                    sum1 += (1 / fact);
                }
                System.out.println("Sum = "+sum1);
                break;
            
            case 2:
                System.out.println("Series : 1 + (1+2) + (1+2+3) + ..... + (1+2+3+.....+n)");
                System.out.print("Enter the value of n : ");
                int n2 = sc.nextInt();
                long sum2 = 0;
                for(int i = 1; i <= n2; i++)
                {
                    long t2 = 0;
                    for(int j = 1; j <= i; j++)
                        t2 += j;
                    sum2 += t2;
                }
                System.out.println("Sum = "+sum2);
            break;

            case 3:
            System.out.println("Series : 1 + (1*2) + (1*2*3) + ..... + (1*2*3*.....*n)");
            System.out.print("Enter the value of n : ");
            int n3 = sc.nextInt();
            long sum3 = 0;
            for(int i = 1; i <= n3; i++)
            {
                long t2 = 1;
                for(int j = 1; j <= i; j++)
                    t2 *= j;
                sum3 += t2;
            }
            System.out.println("Sum = "+sum3);
        break;
        
            default:
            System.out.println("Invalid Choice");
            System.exit(0);
        }
    }
}
