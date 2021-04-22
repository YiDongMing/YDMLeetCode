package com.code.贪心算法.任务调度器;

import java.util.*;

public class Rwduq {
    //贪心算法
    public static int leastInterval(char[] tasks,int n){
        int [] map = new int[26];
        for(char c : tasks){
            map[c - 'A']++;
        }
        Arrays.sort(map);
        int time = 0;
        while (map[25] > 0){
            int i = 0;
            while (i <= n){
                if(map[25] == 0)
                    break;
                if(i < 26 && map[25-i] > 0){
                    map[25-i]--;
                }
                time++;
                i++;
            }
            Arrays.sort(map);
        }
        return time;
    }

    public static void main(String[] args) {
        for(int i = 0;i<255;i++){
            char a = (char) i;
            System.out.println(a+"........."+i);
        }
        char [] tasks = {'A','A','A','B','B','B','D','C'};
        int n = 2;
        int time = leastInterval(tasks, 2);
        System.out.println(time);
    }

    public static int leastInterval2(char[] tasks, int n) {
        int[] map = new int[26];
        for (char c: tasks)
            map[c - 'A']++;
        PriorityQueue < Integer > queue = new PriorityQueue< >(26, Collections.reverseOrder());
        for (int f: map) {
            if (f > 0)
                queue.add(f);
        }
        int time = 0;
        while (!queue.isEmpty()) {
            int i = 0;
            List< Integer > temp = new ArrayList< >();
            while (i <= n) {
                if (!queue.isEmpty()) {
                    if (queue.peek() > 1)
                        temp.add(queue.poll() - 1);
                    else
                        queue.poll();
                }
                time++;
                if (queue.isEmpty() && temp.size() == 0)
                    break;
                i++;
            }
            for (int l: temp)
                queue.add(l);
        }
        return time;
    }
}
