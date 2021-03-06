package com.example.algorithm.demoalgorithm.complexity;

import com.example.algorithm.demoalgorithm.util.LogUtils;

/**
 * Description: 斐波那契数
 * User: zhangll
 * Date: 2020-04-18
 * Time: 09:56
 */
public class FibonacciNumber {

    public static void main(String[] args) {
        LogUtils.putLog("简易实现", new LogUtils.Task() {
            @Override
            public void execute() {
                System.out.println(fib1(33));
            }
        });
        LogUtils.putLog("改进实现", new LogUtils.Task() {
            @Override
            public void execute() {
                System.out.println(fib2(33));
            }
        });
    }

    /**
     * 简易实现
     * 时间复杂度：2^0+2^1+2^2... = 2^n-1 = 1/2 * 2^n -1  O(2^n)  --fib1执行了多少次？
     * @param n
     * @return
     */
    private static int fib1(int n) {
        if (n <= 1){
            return n;
        }else {
            return fib1(n - 1) + fib1(n - 2 );
        }
    }

    /**
     * 改进
     * 时间复杂度：O(n)
     * @param n
     * @return
     */
    private static int fib2(int n) {
        if (n <= 1){
            return n;
        }
        int first = 0;
        int second = 1;
        for (int i = 0 ; i < n-1 ; i++){
            int sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }

    /**
     * 改进
     * 时间复杂度：O(n)
     * @param n
     * @return
     */
    private static int fib3(int n) {
        if (n <= 1){
            return n;
        }
        int first = 0;
        int second = 1;
        for (int i = 0 ; i < n-1 ; i++){
            second += first;
            first = second - first;
        }
        return second;
    }



}
