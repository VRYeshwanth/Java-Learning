import java.util.Scanner;
public class Matrix_Generator
{
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];
        matrix = generate(rows,cols);
        System.out.println("\nYour Matrix");
        
        for(int r[] : matrix)
        {
            for(int ele : r)
                System.out.print(ele+ " ");
            System.out.println();
        }
    }

    public static int[][] generate(int r, int c)
    {
        int mat[][] = new int[r][c];
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                int num = (int)(Math.random()*10);
                mat[i][j] = num;
            }
        }
        return mat;
    }
}