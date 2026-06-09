package Greedy;

import java.util.*;

public class IndianCoins {
    public static void num_coins_used(Integer coins[], int amount) {
        ArrayList<Integer> total_coins=new ArrayList<>();
        int count = 0;
        Arrays.sort(coins, Comparator.reverseOrder());
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    total_coins.add(coins[i]);
                    count++;
                    amount -= coins[i];
                }
            }
        }
        System.out.println("Total number of minimum coins used are : "+count);
        System.out.println(total_coins);
    }

    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,200,500,2000};
        num_coins_used(coins, 15924);
    }
}