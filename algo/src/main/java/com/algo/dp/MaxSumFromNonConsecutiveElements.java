package com.algo.dp;

public class MaxSumFromNonConsecutiveElements {

    static int findMaxSum(int index, int array[]){
        if(index>=array.length) return 0;
        return max(array[index]+findMaxSum(index+2,array),findMaxSum(index+1,array));
    }
    static int max(int n1, int n2){
        return (n1>=n2)?n1:n2;
    }
    public static void main(String[] args) {
        int array[] = {5,3,30,7,-1,8};
        System.out.println(findMaxSum(0,array));
    }
}
