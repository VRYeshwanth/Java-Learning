import java.util.Scanner;

public class N_Queens
{
    public static int count = 1;
    public static void printBoard(char[][] board)
    {
        System.out.println("Solution "+count+ " :- ");
        for(char[] row : board)
        {
            for(char item: row)
                System.out.print(item+ " ");
            System.out.println();
        }
        count++;
    }

    public static boolean isSquareSafe(char[][] board, int row, int col)
    {
        //Check horizontal safety
        for(int i = 0; i < board.length; i++)
        {
            if(board[row][i] == 'Q')
                return false;
        }

        //Check vertical safety
        for(int i = 0; i < board.length; i++)
        {
            if(board[i][col] == 'Q')
                return false;
        }

        //Check top-left safety
        for(int r = row, c = col; r >= 0 && c >= 0; r--, c--)
        {
            if(board[r][c] == 'Q')
                return false;
        }

        //Check top-right safety
        for(int r = row, c = col; r >= 0 && c < board.length; r--, c++)
        {
            if(board[r][c] == 'Q')
                return false;
        }

        //Check bottom-left safety
        for(int r = row, c = col; r < board.length && c >= 0; r++, c--)
        {
            if(board[r][c] == 'Q')
                return false;
        }

        //Check bottom-right safety
        for(int r = row, c = col; r < board.length && c < board.length; r++, c++)
        {
            if(board[r][c] == 'Q')
                return false;
        }
        return true;
    }

    public static void solve_NQueens(char[][] board, int cols)
    {
        //This represents that a solution has been found and thus prints it
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
                board[r][cols] = 'Q';
                solve_NQueens(board, cols+1);
                board[r][cols] = 'X'; //Backtracks (if necessary)
            }
        }
    }

    //Initializes the board with X marks so that we need need not place them later
    public static void initializeBoard(char[][] board)
    {
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board.length; j++)
                board[i][j] = 'X';
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        sc.close();

        char[][] board = new char[n][n];
        
        initializeBoard(board);
        solve_NQueens(board, 0);

        System.out.println("Total Solutions = "+(count-1));
    }
}