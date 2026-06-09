package Greedy;

import java.util.*;

public class MaxLengthOfChainPairs {
    public static int max_chain_pairs(int pairs[][]){
        int count=0;
        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));
        count=1;
        int end_pair=pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>=end_pair){
                count++;
                end_pair=pairs[i][1];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        System.out.println(max_chain_pairs(pairs));
    }
}
