import java.util.Scanner;
public class Matrix {

    public static void displayMatrix(int matrix[][])
    {
        for(int row[] : matrix)
        {
            for(int ele : row)
                System.out.print(ele+ " ");
            System.out.println();
        }
    }

    public static void addMatrices(int a[][], int b[][], int r1, int c1, int r2, int c2)
    {
        if (!(r1 == r2 && c1 == c2))
        {
            System.out.println("Matrices should have the same dimension");
            System.exit(0);
        }

        int c[][] = new int[r1][c1];
        for(int i = 0; i < r1; i++)
        {
            for(int j = 0; j < c1; j++)
                c[i][j] += a[i][j] + b[i][j];
        }

        displayMatrix(c);
    }

    public static void subtractMatrices(int a[][], int b[][], int r1, int c1, int r2, int c2)
    {
        if (!(r1 == r2 && c1 == c2))
        {
            System.out.println("Matrices should have the same dimension");
            System.exit(0);
        }

        int c[][] = new int[r1][c1];
        for(int i = 0; i < r1; i++)
        {
            for(int j = 0; j < c1; j++)
                c[i][j] += a[i][j] - b[i][j];
        }

        displayMatrix(c);
    }

    public static void multiplyMatrices(int a[][], int b[][], int r1,int c1, int r2, int c2)
    {
        if (c1 != r2)
        {
            System.out.println("Multiplication is not possible");
            System.exit(0);
        }

        int c[][] = new int[r1][c2];
        for(int i = 0; i < r1; i++)
        {
            for(int j = 0; j < c2; j++)
            {
                for(int k = 0; k < r2; k++)
                    c[i][j] += a[i][k] * b[k][j];
            }
        }

        displayMatrix(c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to add two matrices");
        System.out.println("Enter 2 to subtract two matrices");
        System.out.println("Enter 3 to multiply two matrices");
        int ch = sc.nextInt();
        int a[][], b[][];
        int r1,c1,r2,c2 = 0;
        sc.close();
        switch (ch) {
            case 1:
                System.out.print("Enter the number of rows of matrix 1 : ");
                r1 = sc.nextInt();
                System.out.print("Enter the number of columns of matrix 1 : ");
                c1 = sc.nextInt();
                a = new int[r1][c1];
                System.out.println("Enter the elements of matrix 1 row-wise : ");
                for(int i = 0; i < r1; i++)
                {
                    for(int j = 0; j < c1; j++)
                        a[i][j] = sc.nextInt();
                }
                System.out.println();
                System.out.print("Enter the number of rows of matrix 2 : ");
                r2 = sc.nextInt();
                System.out.print("Enter the number of columns of matrix 2 : ");
                c2 = sc.nextInt();
                System.out.println("Enter the elements of matrix 2 row-wise : ");
                b = new int[r2][c2];
                for(int i = 0; i < r2; i++)
                {
                    for(int j = 0; j < c2; j++)
                        b[i][j] = sc.nextInt();
                }
                System.out.println("Result :- \n");
                addMatrices(a, b, r1, c1, r2, c2);
                break;
            case 2:
                System.out.print("Enter the number of rows of matrix 1 : ");
                r1 = sc.nextInt();
                System.out.print("Enter the number of columns of matrix 1 : ");
                c1 = sc.nextInt();
                a = new int[r1][c1];
                System.out.println("Enter the elements of matrix 1 row-wise : ");
                for(int i = 0; i < r1; i++)
                {
                    for(int j = 0; j < c1; j++)
                        a[i][j] = sc.nextInt();
                }
                System.out.println();
                System.out.print("Enter the number of rows of matrix 2 : ");
                r2 = sc.nextInt();
                System.out.print("Enter the number of columns of matrix 2 : ");
                c2 = sc.nextInt();
                System.out.println("Enter the elements of matrix 2 row-wise : ");
                b = new int[r2][c2];
                for(int i = 0; i < r2; i++)
                {
                    for(int j = 0; j < c2; j++)
                        b[i][j] = sc.nextInt();
                }
                System.out.println("Result :- \n");
                subtractMatrices(a, b, r1, c1, r2, c2);
                break;
            case 3:
                System.out.print("Enter the number of rows of matrix 1 : ");
                r1 = sc.nextInt();
                System.out.print("Enter the number of columns of matrix 1 : ");
                c1 = sc.nextInt();
                a = new int[r1][c1];
                System.out.println("Enter the elements of matrix 1 row-wise : ");
                for(int i = 0; i < r1; i++)
                {
                    for(int j = 0; j < c1; j++)
                        a[i][j] = sc.nextInt();
                }
                System.out.println();
                System.out.print("Enter the number of rows of matrix 2 : ");
                r2 = sc.nextInt();
                System.out.print("Enter the number of columns of matrix 2 : ");
                c2 = sc.nextInt();
                System.out.println("Enter the elements of matrix 2 row-wise : ");
                b = new int[r2][c2];
                for(int i = 0; i < r2; i++)
                {
                    for(int j = 0; j < c2; j++)
                        b[i][j] = sc.nextInt();
                }
                System.out.println("Result :- \n");
                multiplyMatrices(a,b,r1,c1,r2,c2);
                break;
            default:
            System.out.println("Invalid Input");
                break;
        }
    }
}
