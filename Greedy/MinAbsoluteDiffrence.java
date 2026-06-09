package Greedy;
import java.util.*;
public class MinAbsoluteDiffrence{
    public static int Min_abs(int a[],int b[]){
        int minDiff=0;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++){
            minDiff+=Math.abs(a[i]-b[i]);
        }
        return minDiff;
    }
    public static void main(String[] args) {
        int a[]={4,1,8,7};
        int b[]={2,3,6,5};
        System.out.println(Min_abs(a, b));
    }
}