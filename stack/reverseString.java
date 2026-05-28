package stack;

import java.util.Stack;

public class reverseString {
    public static void reversestring(String str){
        Stack<Character>s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            char curr=str.charAt(idx);
            s.push(curr);
            idx++;
        }

        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty()){
            char curr=s.pop();
            sb.append(curr);
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String s="aba";
        reversestring(s);
    }
}
