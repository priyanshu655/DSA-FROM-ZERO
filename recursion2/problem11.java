package recursion2;
public class problem11 {
    public static int TilesWays(int n){
        if(n==0||n==1){
            return 1;
        }
        int totalways=TilesWays(n-1)+TilesWays(n-2);
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(TilesWays(8));
    }
}
