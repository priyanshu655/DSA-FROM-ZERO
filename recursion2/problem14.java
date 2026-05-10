package recursion2;
public class problem14{
    public static void binaryStrings(int n,int lastIndex,String s){
        if(n==0){
            System.out.println(s);
            return;
        }
        binaryStrings(n-1, 0, s+"0");
        if(lastIndex==0){
            binaryStrings(n-1, 1, s+"1");
        }
    }
    public static void main(String[] args) {
        String s="";
        binaryStrings(5, 0, s);
    }
}