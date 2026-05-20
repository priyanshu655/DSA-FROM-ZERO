package ArrayList;
import java.util.*;

public class ListofList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer>l1=new ArrayList<>();
        ArrayList<Integer>l2=new ArrayList<>();
        ArrayList<Integer>l3=new ArrayList<>();
        l1.add(1);
        l2.add(2);
        l3.add(3);
        l1.add(4);
        l2.add(5);
        l3.add(6);
        l1.add(7);
        l2.add(8);
        l3.add(9);
        mainList.add(l1);
        mainList.add(l2);
        mainList.add(l3);

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currList=mainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
        }
    }
}
