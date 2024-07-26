public class Sudoku_Solver
{
    public static final int GRID_SIZE = 9;

    public static void printBoard(int[][] board)
    {
        for(int[] row : board)
        {
            for(int val : row)
                System.out.print(val+ " ");
            System.out.println();
        }
    }

    public static boolean isValidPlace(int[][] board, int row, int col, int num)
    {
        //Row Check
        for(int i = 0; i < GRID_SIZE; i++)
        {
            if(board[row][i] == num)
                return false;
        }

        //Column Check
        for(int i = 0; i < GRID_SIZE; i++)
        {
            if(board[i][col] == num)
                return false;
        }

        //Box Check
        int startRow = row - (row % 3);
        int startCol = col - (col % 3);
        for(int i = startRow; i < startRow + 3; i++)
        {
            for(int j = startCol; j < startCol + 3; j++)
            {
                if(board[i][j] == num)
                    return false;
            }
        }

        return true;
    }

    public static boolean solve(int[][] board)
    {
        for(int r = 0; r < GRID_SIZE; r++)
        {
            for(int c = 0; c < GRID_SIZE; c++)
            {
                if(board[r][c] == 0)
                {
                    for(int num = 1; num <= 9; num++)
                    {
                        if(isValidPlace(board, r, c, num))
                        {
                            board[r][c] = num;
                            
                            if(solve(board)) //Recursive Call
                                return true;
                            
                            board[r][c] = 0; // Backtracking
                        }
                    }
                    return false; //If code reaches here, it means that no number could be placed in the box which then backtracks.
                }
            }
        }
        return true; //If code reaches here , it means that the board is solved
    }

    public static void main(String args[])
    {
        int[][] board = {
            {0,0,4,0,0,0,2,0,8},
            {3,7,0,0,9,0,0,0,0},
            {2,0,0,7,0,0,0,1,0},
            {0,6,0,5,0,0,9,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,5,0,0,2,0,6,0},
            {0,4,0,0,0,8,0,0,3},
            {0,0,0,0,4,0,0,5,2},
            {1,0,3,0,0,0,4,0,0}
        };
        solve(board);
        printBoard(board);
    }
}