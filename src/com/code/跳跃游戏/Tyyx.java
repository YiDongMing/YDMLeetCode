package com.code.跳跃游戏;

public class Tyyx {
    //贪心算法
    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int go = 0;
        for(int i=0;i<=go && go<n-1;i++){
            go = Math.max(i+nums[i],go);
        }
        return go >= n-1;
    }
    //反向思路，我喜欢
    public static boolean canJump2(int [] nums){
        int n = nums.length,last = n-1;
        for(int i= n-2;i>=0;--i){
            if(i+nums[i]>=last){
                last = i;
            }
        }
        return last == 0;
    }

    public static void main(String[] args) {
        int[]a = {2,3,1,1,3};
        int[] b = {3,2,1,0,4};
        int[] bb = {0};
        int[] cc = {2,0,0};
        int[] ccc = {2,5,0,0};
        int[]bbb = {1,2};
        int[] d = {1,1,1,0};
        boolean c = canJump2(bb);
        System.out.println(c);
    }
}
