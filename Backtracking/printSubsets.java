package Backtracking;

public class printSubsets {
    public static void Subset(String s,String ans,int i){
        if(i==s.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        Subset(s,ans+s.charAt(i),i+1);
        Subset(s,ans,i+1);
    }
    public static void main(String[] args) {
        String ans="";
        Subset("abc", ans, 0);
    }
}
