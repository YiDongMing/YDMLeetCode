package com.code.字符串atoi;

public class Myatoi {

    public static int myAtoi(String str) {
        String trim = str.trim();
        if(trim.length() < 1){
            return 0;
        }
        char[] chars = trim.toCharArray();
        int n = chars.length;
        int idx = 0;
        boolean flag = false;
        if(chars[idx] == '-'){
            flag = true;
            idx++;
        }else if(chars[idx] == '+'){
            idx++;
        }else if(!Character.isDigit(chars[idx])){
            return 0;
        }
        int ans = 0;
        while (idx < n && Character.isDigit(chars[idx])){
            int digit = chars[idx] -'0';
            if(ans > (Integer.MAX_VALUE -digit) / 10){
                return flag ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            ans = ans * 10 + digit;
            idx++;
        }
        return flag ? -ans : ans;
    }

    public static void main(String[] args) {
        String str = "32j32";
        int i = myAtoi(str);
        System.out.println(i);
        Integer integer = Integer.valueOf(str);
        System.out.println(integer);
    }

}
