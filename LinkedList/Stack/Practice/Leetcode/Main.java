package LinkedList.Stack.Practice.Leetcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 2, 2, 4, 4 };
        System.out.println(count(arr));
    }

    public static int count(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int a : arr) {
            if (a % 2 == 0) {
                map.put(a, map.getOrDefault(a, 0) + 1);
            }
        }


        int max = -1;
        for (Integer k : map.keySet()) {
            Integer v = map.get(k);
            if (v > max) {
                max = v;
            }
        }
        
        int maxElem = Integer.MAX_VALUE;
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            int k = entry.getKey();
            int v = entry.getValue();
            if (v == max) {
                if (k < maxElem)
                    maxElem = k;
            }
        }
        if(maxElem == Integer.MAX_VALUE) maxElem = -1;
        return maxElem;
    }
}
