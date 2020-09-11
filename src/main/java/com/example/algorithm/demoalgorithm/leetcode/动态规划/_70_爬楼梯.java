package com.example.algorithm.demoalgorithm.leetcode.动态规划;

/**
 * Description:
 * User: zhangll
 * Date: 2020-08-19
 * Time: 21:09
 */
public class _70_爬楼梯 {
    // f(n) = f(n-1) + f(n-2)
    public int climbStairs(int n) {
        if(n == 0){
            return 0;
        }
        int p = 0,q = 0,r = 1;
        for(int i = 1; i<=n; i++){
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}
