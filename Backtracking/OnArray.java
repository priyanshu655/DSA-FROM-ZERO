//we are applying backtracking on array we are having array of example 5 then we keep storing at each index i, i+1 value suppose at index a[0]=1,a[1]=2,a[2]=3 like this and when we reach at base case we have this array [1,2,3,4,5] and now when we return and backtrack reduce value at each index by 2 end reult will [-1,0,1,2,3]

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
