package Backtracking;
import java.util.List;      // Imports the List interface
import java.util.ArrayList; // Imports the most common List implementation

public class combinationSum1{
    public static void cs(int arr[],int idx,int target,List<Integer>current,List<List<Integer>>ans){
        if(idx==arr.length){
            return;
        }
        if(target<0){
            return;
        }

        if(target==0){
            ans.add(new ArrayList<>(current));
            return;
        }

        current.add(arr[idx]);
        cs(arr,idx,target-arr[idx],current,ans);
        current.remove(current.size()-1);
        cs(arr,idx+1,target,current,ans);
    }
    public static void main(String args[]){
        int arr[]={2,3,6,7};
        List<List<Integer>> ans=new ArrayList<>();
        cs(arr,0,11,new ArrayList<>(),ans);
        System.out.println(ans);
    }
}