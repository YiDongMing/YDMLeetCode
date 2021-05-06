package com.code.数组.二维数组中查找;

public class EWSZ {

    //我们仔细看看题目，是从二维数组上找到是否有这个数字存在于数组中。还有一个特点就是每一行都按照从左到右递增的顺序排序，那我们是不是
    // 可以在暴力解法上优化一下。假如数组的数字大于目标数字，那就可以调到下一行数组了

    public static boolean Find(int target, int [][] array){
        for(int i = 0;i < array.length;i++){
            for(int j = 0;j < array[i].length;j++){
                if(array[i][j] == target){
                    return true;
                }
                if(array[i][j] > target){
                    break;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [][] array = new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        boolean find = Find(5, array);
        System.out.println(find);
    }
}
