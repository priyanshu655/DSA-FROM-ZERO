package recursion2;

public class problem13 {
    public static int friendsPair(int n){
        if(n==1||n==2){
            return n;
        }
        int totalWays=(friendsPair(n-1)+((n-1)*friendsPair(n-2)));
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(friendsPair(3));
    }
}
