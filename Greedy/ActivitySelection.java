package Greedy;
import java.util.*;

public class ActivitySelection{
    public static void activiy_selection(int a1[],int a2[]){
        int activities[][]=new int[a1.length][3];
        for(int i=0;i<a1.length;i++){
            activities[i][0]=i;
            activities[i][1]=a1[i];
            activities[i][2]=a2[i];
        }

        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));
        int count=1;
        ArrayList<Integer> ans=new ArrayList<>();
        int et=activities[0][1];
        ans.add(activities[0][0]);
        for(int i=1;i<a1.length;i++){  
           if(activities[i][1]>=et){
            ans.add(activities[i][0]);
            count++;
            et=activities[i][2];
           }
        }
        System.out.println("Max number of actitivty that can be performed is : "+count);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        int a1[]={1,3,0,5,8,5};
        int a2[]={2,4,6,7,9,9};
        activiy_selection(a1, a2);
    }
}