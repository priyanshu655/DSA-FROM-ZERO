package Greedy;

public class ActivitySelection{
    public static int activiy_selection(int a1[],int a2[]){
        int count=1;
        int st=a1[0];
        int et=a2[0];
        for(int i=1;i<a1.length;i++){  
           if(a1[i]>=et){
            count++;
            st=a1[i];
            et=a2[i];
           }
        }
        return count;
    }
    public static void main(String[] args) {
        int a1[]={1,3,0,5,8,5};
        int a2[]={2,4,6,7,9,9};
        System.out.println(activiy_selection(a1, a2));
    }
}