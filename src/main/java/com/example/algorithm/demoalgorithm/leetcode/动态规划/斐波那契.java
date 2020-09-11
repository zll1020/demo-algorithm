package com.example.algorithm.demoalgorithm.leetcode.动态规划;

/**
 * Description:
 * User: zhangll
 * Date: 2020-08-19
 * Time: 20:43
 */
public class 斐波那契 {

    public static int fib(int n) {
        int a = 0, b = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;

    }

    public static void main(String[] args) {
        System.out.println(fib(3));
    }
}
