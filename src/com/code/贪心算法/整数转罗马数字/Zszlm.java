package com.code.贪心算法.整数转罗马数字;

public class Zszlm {
    static int  [] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    static String [] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    public static String intToRoman(int num){
        StringBuffer sb = new StringBuffer();
        for (int i = 0;i < values.length && num >= 0;i++){
            while (values[i] <= num){
                num-=values[i];//比较如果找出 包含的最大数字
                sb.append(symbols[i]);
            }
        }
        return sb.toString();
    }
}
