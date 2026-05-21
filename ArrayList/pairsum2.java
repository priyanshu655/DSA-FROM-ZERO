package ArrayList;
import java.util.*;

public class pairsum2 {
    public static void pairsum(ArrayList<Integer>list,int target){
        int lp=0,rp=0,n=list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                lp=i+1;
                rp=i;
                break;
            }
        }
        while(lp!=rp){
            int val=list.get(lp)+list.get(rp);
            if(val==target){
                System.out.println("["+list.get(lp)+","+list.get(rp)+"]");
                return;
            }else if(val>target){
                rp=(n+rp-1)%n;
            }else{
                lp=(lp+1)%n;
            }
        }

        System.out.println("no pairs found");
    }
    public static void main(String[] args) {
        ArrayList<Integer>l1=new ArrayList<>();
        l1.add(11);
        l1.add(15);
        l1.add(6);
        l1.add(8);
        l1.add(9);
        l1.add(10);
        pairsum(l1, 16);
    }
}
