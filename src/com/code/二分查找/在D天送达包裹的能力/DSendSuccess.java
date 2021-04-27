package com.code.二分查找.在D天送达包裹的能力;

public class DSendSuccess {

    private static Integer shipWithinDays(int[] weights,int D){
        int min = weights[0];
        int max = 0;
        //找出船运载能力的最小值和最大值
        for(int i = 0;i < weights.length;i++){
            if(min < weights[i]){
                min = weights[i];
            }
            max = max + weights[i];
        }
        while (min < max ){
            int mid = (min + max) >> 1;
            int sum = 0;
            int dayCount = 1;
            for(int a : weights){
                sum = sum + a;
                if(sum > mid){
                    dayCount++;
                    sum = a;
                }
            }
            if(dayCount > D){
                min = mid + 1;
            }else{
                max = mid;
            }

        }
        return min;
    }

    public static void main(String[] args) {
        //int[] weights = {1,2,3,4,5,6,7,8,9,10};
        //int D = 5;
        int[] weights = {1,2,3,1,1};
        int D = 4;
        Integer integer = shipWithinDays(weights, D);
        System.out.println(integer);
    }
}
