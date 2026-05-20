package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class inbuiltSorting {
    public static void main(String[] args) {
        ArrayList<Integer>a=new ArrayList<>();
        a.add(3);
        a.add(1);
        a.add(7);
        a.add(4);
        a.add(10);
        System.out.println(a);
        Collections.sort(a);//print and sort in ascending order
        System.out.println(a);

        //to sort in desceding order
        Collections.sort(a,Collections.reverseOrder());
        System.out.println(a);
    }
}
