import java.util.Scanner;

public class N_Rooks
{
    public static long count = 1;
    public static void initailizeArray(char[][] board)
    {
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board.length; j++)
                board[i][j] = 'X';
        }
    }

    public static void printBoard(char[][] board)
    {
        System.out.println("Solution "+(count)+ " :- ");
        for(char[] row : board)
        {
            for(char item : row)
                System.out.print(item+ " ");
            System.out.println();
        }
        count++;
    }

    public static boolean isSquareSafe(char[][] board, int r, int c)
    {
        for(int i = 0; i < board.length; i++)
        {
            if(board[r][i] == 'R')
                return false;
        }

        for(int i = 0; i < board.length; i++)
        {
            if(board[i][c] == 'R')
                return false;
        }

        return true;
    }

    public static void solve_NRooks(char[][] board, int cols)
    {
        if(cols == board.length)
        {
            printBoard(board);
            System.out.println();
            return;
        }

        for(int r = 0; r < board.length; r++)
        {
            if(isSquareSafe(board, r, cols))
            {
                board[r][cols] = 'R';
                solve_NRooks(board, cols+1);
                board[r][cols] = 'X';
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        char board[][] = new char[n][n];
        sc.close();

        initailizeArray(board);
        solve_NRooks(board, 0);

        System.out.println("Total Solutions = "+(--count));
    }
}