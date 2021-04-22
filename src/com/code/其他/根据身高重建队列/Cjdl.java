package com.code.其他.根据身高重建队列;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Cjdl {

    public int [][] reconstructQueue(int [][] people){
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0];
            }
        });
        List<int[]>   output = new LinkedList<>();
        for(int [] p : people){
            output.add(p[1],p);
        }
        int n = people.length;
        return output.toArray(new int[n][2]);
    }

    public static void main(String[] args) {
    }
}
