package codefroces;
import java.util.*;
public class Bigram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
       boolean fourOrMore=false;
        int twoOrMore=0;
        while(k-- >0){
            int j=sc.nextInt();
            for(int i=0;i<j;i++){
                int x=sc.nextInt();

                if(x>=4){
                    fourOrMore=true;
                }
                if(x>=2){
                    twoOrMore++;
                }
            }
            if(fourOrMore||twoOrMore>=2){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}
