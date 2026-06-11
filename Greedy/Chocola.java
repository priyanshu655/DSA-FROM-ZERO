package Greedy;
import java.util.*;
public class Chocola{
    public static void main(String[] args) {
        Integer costHor[]={2,1,3,1,4};
        Integer costVer[]={4,1,2};
        Arrays.sort(costHor,Collections.reverseOrder());
        Arrays.sort(costVer,Collections.reverseOrder());

        int v=0,h=0;
        int vp=1,hp=1;
        int cost=0;
        while(v<costVer.length&&h<costHor.length){
            if(costVer[v]<=costHor[h]){
                cost+=(costHor[h]*vp);
                hp++;
                h++;
            }else{
                cost+=(costVer[v]*hp);
                vp++;
                v++;
            }
        }

        while(v<costVer.length){
              cost+=(costVer[v]*hp);
                vp++;
                v++;
        }
        while(h<costHor.length){
              cost+=(costHor[h]*vp);
                hp++;
                h++;
        }

        System.out.println("Minimum cost required to cut the chocolate into pieces are : "+cost);
    }
}