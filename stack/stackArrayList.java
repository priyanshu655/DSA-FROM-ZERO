package stack;
import java.util.ArrayList;

public class stackArrayList {
    static class stack{
       static ArrayList<Integer> list=new ArrayList<>();
      public static boolean isEmpty(){
        return list.size()==0;
      }
      public static void push(int data){
        list.add(data);
      }
      public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int val=list.get(list.size()-1);
        list.remove(list.size()-1);
        return val;
      }
      public static int peek(){
        return list.get(list.size()-1);
      }
    }
    public static void main(String[] args) {
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        // System.out.println(s.peek());
        // s.pop();
        // System.out.println(s.peek());

        while(!s.isEmpty()){
            System.out.println("|"+s.peek()+"|");
            System.out.println("__");
            s.pop();
        }
    }
    
}
