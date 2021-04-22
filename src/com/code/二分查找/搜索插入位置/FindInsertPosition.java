package com.code.二分查找.搜索插入位置;

public class FindInsertPosition {

    public static int searchInsert(int[] nums,int target){
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int ans = n;
        while (left <= right){
            int mid = ((right - left) >> 1) + left;
            if(target <= nums[mid]){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int [] nums = {1,3,5,6};
        int target = 5;
        int i = searchInsert(nums, target);
        System.out.println(i);
    }
}
