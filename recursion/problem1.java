//printing numbers  in decreasing order from n to 1

public class problem1{
    public static void PrintInDec(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        PrintInDec(n-1);
    }
    public static void main(String args[]){
        PrintInDec(10);
    }
}