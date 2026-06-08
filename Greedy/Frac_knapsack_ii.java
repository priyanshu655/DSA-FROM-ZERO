//in case when the given array is not sorted 

package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Frac_knapsack_ii{
    public static int knapsack(int val[],int weight[],int capacity){
        double ratio[][]=new double[val.length][2];
        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/weight[i];
        }

        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));
        int finalVal=0;
        int w=capacity;
        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if(w>=weight[idx]){
                finalVal+=val[idx];
                w-=weight[idx];
            }else{
                finalVal+=(ratio[i][1]*w);
                break;
            }
        }
        return finalVal;
    }
    public static void main(String[] args) {
         int val[]={60,100,120};
        int weight[]={10,20,30};
        System.out.println(knapsack(val, weight, 50));
    }
}