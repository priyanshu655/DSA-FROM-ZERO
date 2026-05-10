//finding fib series

public class problem5 {
    public static int fib(int n){
        // if(n==1){
        //     return 1;
        // }else if(n==0){
        //     return 0;
        // }

        if(n==0||n==1){
            return n;
        }

        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}
