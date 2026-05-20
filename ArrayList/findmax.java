package ArrayList;
import java.util.ArrayList;
public class findmax {
    public static int returnMax(ArrayList<Integer> a){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.size();i++){
            if(a.get(i)>max){
                max=a.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer>a=new ArrayList<>();
        a.add(3);
        a.add(1);
        a.add(7);
        a.add(4);
        a.add(10);
        int max=returnMax(a);
        System.out.println(max);
    }
}
