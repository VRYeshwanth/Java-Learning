import java.util.Scanner;
public class GridPaths
{
    public static int countPaths(int n, int m)
    {
        if(n == 1 || m == 1)
            return 1;
        
        return countPaths(n-1, m) + countPaths(n, m-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of your 2D grid : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Dimensions = "+n+" x "+m);
        System.out.println("Number of Paths = "+countPaths(n, m));
        System.out.println("Direction = Top-Left to Bottom-Right");
        sc.close();
    }
}