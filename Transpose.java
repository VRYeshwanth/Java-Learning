import java.util.Scanner;

public class Transpose extends Matrix
{
    public static void transposeMatrix(int a[][], int r, int c)
    {
        int transposed[][] = new int[c][r];

        for(int i = 0; i < c; i++)
        {
            for(int j = 0; j < r; j++)
                transposed[i][j] = a[j][i];
        }

        displayMatrix(transposed);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[][];
        int r,c = 0;

        System.out.print("Enter the number of rows : ");
        r = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        c = sc.nextInt();
        System.out.println("Enter the elements of the matrix row-wise :- ");
        arr = new int[r][c];
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();
        }
        System.out.println("Result :- \n");
        transposeMatrix(arr, r, c);
        sc.close();
    }
}