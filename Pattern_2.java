import java.util.Scanner;
public class Pattern_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter a number from 1 to 10 display a random number pattern : ");
            int n = sc.nextInt();
            sc.close();
            switch (n) {
                case 1:
                    for(int i = 1; i <= 5; i++)
                    {
                        for(int j = i; j >= 1; j--)
                            System.out.print(j+" ");
                        System.out.println();
                    }
                break;
    
                case 2:
                for(int i = 5; i >= 1; i--)
                {
                    for(int j = 1; j <= i; j++)
                        System.out.print(j+" ");
                    System.out.println();
                }
                break;
    
                case 3:
                    for(int i = 1; i <= 5; i++)
                    {
                        for(int j = 5; j >= i; j--)
                            System.out.print(j+" ");
                        System.out.println();
                    }
                break;
    
                case 4:
                for(int i = 5; i >= 1; i--)
                {
                    for(int j = 1; j <= (2*i); j+=2)
                        System.out.print(j+" ");
                    System.out.println();
                }
                break;
    
                case 5:
                    for(int i = 5; i >= 1; i--)
                    {
                        for(int j = 5; j >= i; j--)
                            System.out.print(j+" ");
                        System.out.println();
                    }
                break;
    
                case 6:
                for(int i = 1; i <= 5; i++)
                {
                    for(int j = i; j <= 5; j++)
                        System.out.print(j+" ");
                    System.out.println();
                }
                break;
    
                case 7:
                for(int i = 9; i >= 1; i-=2)
                {
                    for(int j = 1; j <= 5; j++)
                        System.out.print(i+" ");
                    System.out.println();
                }
                break;
                
                case 8:
                    for(int i = 9; i >= 1; i-=2)
                    {
                        for(int j = i; j <= 9; j+=2)
                            System.out.print(j+" ");
                        System.out.println();
                    }
                break;
                
                case 9:
                for(int i = 9; i >= 1; i-=2)
                {
                    for(int j = 9; j >= i; j-=2)
                        System.out.print(j+" ");
                    System.out.println();
                }
                break;

                case 10: //Floyd's Triangle
                int counter = 1;
                for(int i = 1; i <= 5; i++)
                {
                    for(int j = 1; j <= i; j++)
                    {
                        System.out.print(counter+" ");
                        counter++;
                    }
                    System.out.println();
                }
                break;
    
                default:
                    System.out.println("Invalid choice");
                    System.exit(0);
            }
        }
    }
}
