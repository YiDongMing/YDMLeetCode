package com.code.数组.判断是否单调数组;

public class DDSZ {

    public static boolean isMonotonic(int[] nums) {
        if(nums.length <= 2){
            return true;
        }
        boolean flag = true;
        for(int i = 0;i < nums.length-1; i++){
            if(nums[i+1] > nums[i]){
                flag = false;
                break;
            }
        }
        //判断是否单调递减
        if(flag){
            for(int i = 0;i < nums.length-1; i++){
                if(nums[i+1] > nums[i]){
                    return false;
                }
            }
        }else{
            for(int i = 0;i < nums.length-1; i++){
                if(nums[i+1] < nums[i]){
                    return false;
                }
            }
        }
        return true;
    }

}
