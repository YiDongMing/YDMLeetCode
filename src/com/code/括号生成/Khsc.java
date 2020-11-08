package com.code.括号生成;

import java.util.ArrayList;
import java.util.List;

public class Khsc {

    public List<String> generateParenthesis(int n){
        List<String> res = new ArrayList<>();
        if(n == 0){
            return res;
        }
        dfs("",n,n,res);
        return res;
    }

    private static void dfs(String curStr, int left, int right, List<String> res){
        if(left == 0 && right == 0){
            res.add(curStr);
            return;
        }
        if(left > right){
            return;
        }
        if(left > 0){
            dfs(curStr + "(",left-1,right,res);
        }
        if(right > 0){
            dfs(curStr + ")",left,right-1,res);
        }
    }
}
