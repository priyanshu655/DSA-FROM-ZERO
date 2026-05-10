//better approach for finding x^n in o(n) time 

public class problem9 {
    public static int power(int base,int n){
        if(n==0){
            return 1;
        }
        int xnm1=power(base,n-1);
        int xn=base*xnm1;
        return xn;
    }
    public static void main(String[] args) {
        System.out.println(power(2,10));
    }
}
