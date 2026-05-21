package ArrayList;
import java.util.*;
public class pairSum1{
    public static void pairsum(ArrayList<Integer> list,int target){
        int left=0;
        int right=list.size()-1;
        while(left!=right){
            int val=list.get(left)+list.get(right);
            
            if(val==target){
                System.out.println("["+list.get(left)+","+list.get(right)+"]");
                return;
            }else if(val>target){
                right--;
            }else{
                left++;
            }
        }
        System.out.println("no pairs found");
    }
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        pairsum(l1, 7);
    }
}