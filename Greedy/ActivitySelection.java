package Greedy;

import java.util.ArrayList;

public class ActivitySelection{
    public static void activiy_selection(int a1[],int a2[]){
        int count=1;
        ArrayList<Integer> ans=new ArrayList<>();
        int et=a2[0];
        ans.add(0);
        for(int i=1;i<a1.length;i++){  
           if(a1[i]>=et){
            ans.add(i);
            count++;
            et=a2[i];
           }
        }
        System.out.println("Max number of actitivty that can be performed is : "+count);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        int a1[]={1,3,0,2,8,1};
        int a2[]={2,4,6,7,9,9};
        activiy_selection(a1, a2);
    }
}