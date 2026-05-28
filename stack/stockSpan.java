package stack;
import java.util.Stack;
public class stockSpan {
    public static void stock_span(int span[],int price[]){
        Stack<Integer>s=new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=1;i<price.length;i++){
            while(!s.isEmpty()&&price[s.peek()]<=price[i]){
                s.pop();
            }
          if(s.isEmpty()){
            span[i]=i+1;
          }else{
            span[i]=i-s.peek();
          }
          s.push(i);
        }
    }
    public static void main(String[] args) {
        int price[]={100,80,60,70,60,85,100};
        int span[]=new int[price.length];
        stock_span(span,price);
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
    }
}
