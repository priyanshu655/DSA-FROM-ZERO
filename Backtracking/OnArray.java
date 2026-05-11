package Backtracking;

public class OnArray {
    public static void printArr(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void backTrackArray(int a[],int i){
        if(i==a.length){
            return;
        }
        a[i]=i+1;
        backTrackArray(a, i+1);
        a[i]=a[i]-2;
    }
    public static void main(String[] args) {
        int a[]=new int[5];
        backTrackArray(a, 0);
        printArr(a);
    }
}
