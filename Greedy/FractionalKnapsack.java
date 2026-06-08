package Greedy;

public class FractionalKnapsack {
    public static double Knapsack(int value[],int weight[],int w){
        double profit=0;
        for(int i=0;i<value.length;i++){
             if(w>=weight[i]){
             profit+=value[i];
            w-=weight[i];
            }else{
                profit+=((value[i]/weight[i])*w);
                break;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int val[]={60,100,120};
        int weight[]={10,20,30};
        System.out.println(Knapsack(val, weight, 50));
    }
}
