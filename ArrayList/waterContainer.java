//find container with most water level

package ArrayList;
import java.util.*;
public class waterContainer {
    public static int maxWater(ArrayList<Integer> height){
        int left=0;
        int right=height.size()-1;
        int max=Integer.MIN_VALUE;
        while(left<=right){
            int h=Math.min(height.get(left), height.get(right));
            int width=right-left;
            int waterArea=h*width;
            if(waterArea>max){
                max=waterArea;
            }

            if(height.get(left)>height.get(right)){
                right--;
            }else{
                left++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer>height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
    int ans=maxWater(height);
    System.out.println(ans);
    }
}
