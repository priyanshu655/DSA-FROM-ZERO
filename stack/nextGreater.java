package stack;
import java.util.Stack;
public class nextGreater{
    public static void nextgreater(int a[],int arr[]){
        Stack<Integer>s=new Stack<>();
        for(int idx=a.length-1;idx>=0;idx--){
            while(!s.isEmpty()&&s.peek()<=a[idx]){
                s.pop();
            }

            if(s.isEmpty()){
                arr[idx]=-1;
            }else{
                arr[idx]=s.peek();
            }
            s.push(a[idx]);
        }
    }
    public static void main(String[] args) {
        int a[]={6,8,0,1,3};
        int arr[]=new int[a.length];
        nextgreater(a, arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}