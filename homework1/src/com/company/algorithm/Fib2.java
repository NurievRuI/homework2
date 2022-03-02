package com.company.algorithm;

import java.util.HashMap;
import java.util.Map;

public class Fib2 {
    static Map<Integer, Integer> memo = new HashMap<>(Map.of(0, 0, 1,1));

    private static  int fib2(int n) {
        if (!memo.containsKey(n)){
            memo.put(n,fib2(n-1) + fib2(n-2));
        }
        return memo.get(n);
    }

    public static void main(String[] args) {
        System.out.println(fib2(10));
        System.out.println(fib2(20));
    }
}
