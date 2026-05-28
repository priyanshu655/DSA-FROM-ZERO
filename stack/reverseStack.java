package stack;
import java.util.Stack;
public class reverseStack {
    public static void reversestack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int val=s.pop();
        reversestack(s);
        pushBtm(s, val);
    }
     public static void pushBtm(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int val=s.pop();
        pushBtm(s, data);
        s.push(val);
    }
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reversestack(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
