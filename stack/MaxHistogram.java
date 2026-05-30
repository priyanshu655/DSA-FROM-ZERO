package stack;

import java.util.Stack;

public class MaxHistogram {
    public static void max_Histogran(int arr[]){
        int max_area=0;
        Stack<Integer>s=new Stack<>();
        int nsr[]=new int[arr.length];
        int nsl[]=new int[arr.length];

        //finding next smaller right
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }


        //finding next smaller left
        s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }

        //current area:width=j-i-1=nsr[i]-nsl[i]-1
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=height*width;
            max_area=Math.max(currArea,max_area);
        }

        System.out.println("Maximum area of the histogram is : "+max_area);
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        max_Histogran(arr);
    }
}
