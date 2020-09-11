package com.example.algorithm.demoalgorithm.leetcode.位运算;

/**
 * Description:
 * 1 模运算
 * User: zhangll
 * Date: 2020-08-19
 * Time: 19:56
 */
public class _231_2的幂 {
    public boolean isPowerOfTwo(int n) {

        if(n==0){
            return false;
        }
        long x = (long) n;
        return (x & (x-1)) == 0;
    }
}
