package dsaClass01;

import java.util.*;
public class carsFleet{
     static void cars_fleet(int pos[],int speed[],int target){
        double cars[][]=new double[pos.length][2];
        for(int i=0;i<pos.length;i++){
            double time=(double)(target-pos[i])/speed[i];
            cars[i][0]=pos[i];
            cars[i][1]=time;
        }
        Arrays.sort(cars, (a, b) -> Double.compare(a[0], b[0]));
        int fleet=0;
        double curr_time=0;
        for(int i=cars.length-1;i>=0;i--){
            double time=cars[i][1];
            if(time>curr_time){
                fleet++;
                curr_time=time;
            }
        }
        System.out.println(fleet);
    }
    public static void main(String args[]){
        int pos[]={10,8,0,5,3};
        int speed[]={2,4,1,1,3};
        
        cars_fleet(pos,speed,12);
    }
}
