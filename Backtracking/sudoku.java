package Backtracking;

public class sudoku {
    public static boolean sudoku(int board[][],int row,int col){
        if(row==9){
            return true;
        }
        int nextRow=row;
        int nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }
        if(board[row][col]!=0){
           return sudoku(board, nextRow, nextCol);
        }


        for(int digit=1;digit<=9;digit++){
            if(isSafe(board,row,col,digit)){
                board[row][col]=digit;
                if(sudoku(board, nextRow, nextCol)){
                    return true;
                }
                board[row][col]=0;
            }
        }
        return false;
    }

    public static boolean isSafe(int arr[][],int row,int col,int digit){
        for(int j=0;j<9;j++){
            if(arr[row][j]==digit){
                return false;
            }
        }

        for(int j=0;j<9;j++){
            if(arr[j][col]==digit){
                return false;
            }
        }

        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(arr[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }

      public static void printBoard(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" |");
            }
           System.out.println();
        }
      }
    public static void main(String[] args) {
        int board[][] = {
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3}
        };

        if(sudoku(board, 0, 0)) {
            printBoard(board);
        } else {
            System.out.println("No Solution Exists");
        }
    }
}
