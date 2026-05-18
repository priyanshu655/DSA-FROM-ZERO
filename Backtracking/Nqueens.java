package Backtracking;
public class Nqueens {

    public static boolean isSafe(char board[][],int row,int col){
        //check vertically
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //check in left diagonal
        for(int i=row-1,j=col-1;i>=0&&j>=0;j--,i--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //check for right diagonal
        for(int i=row-1,j=col+1;i>=0&&j<board.length;j++,i--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void Nqueen(char board[][],int row){
        if(row==board.length){
            printArray(board);
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board, row, j)){
            board[row][j]='Q';
            Nqueen(board,row+1);
            board[row][j]='.';
            }
        }
    }

    public static void printArray(char a[][]){
        System.out.println("________chessboard_______");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print( a[i][j]+" ");
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        int n=5;
        char board[][]=new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='.';
            }
            
        }
        Nqueen(board,0);
    }
}
