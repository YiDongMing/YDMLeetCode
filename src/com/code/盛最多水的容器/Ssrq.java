package com.code.盛最多水的容器;

public class Ssrq {
    public static int maxArea(int[] height){
        int l =0, r = height.length - 1;// r 为右指针位置 l 为左指针位置
        int ans = 0;
        while (l < r){
            int area = Math.min(height[l],height[r]) * (r - l);
            ans = Math.max(ans,area);
            if(height[l] <= height[r]){
                l++;
            }else{
                r--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] height = {1,8,6,2,5,4,8,3,7};
        int area = maxArea(height);
        System.out.println(area);
    }
}
