public class problem10 {
    public static int optimizedpower(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpow=optimizedpower(x, n/2)*optimizedpower(x, n/2);

        //if power is odd
        if(n%2!=0){
            halfpow=x*halfpow;
        }

        return halfpow;
    }
    public static void main(String[] args) {
        System.out.println(optimizedpower(2, 5));

    }
}
