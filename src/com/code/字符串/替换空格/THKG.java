package com.code.字符串.替换空格;

public class THKG {

    public static String replaceSpace (String s) {
        // write code here
        String[] split = s.split("");
        StringBuffer sb = new StringBuffer();
        for(String ss : split){
            if(" ".equals(ss)){
                sb.append("%20");
            }else{
                sb.append(ss);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "We Are Happy";
        String s1 = replaceSpace(s);
        System.out.println(s1);
    }
}
