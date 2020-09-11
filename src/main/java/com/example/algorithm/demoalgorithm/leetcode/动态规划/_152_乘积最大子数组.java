package com.example.algorithm.demoalgorithm.leetcode.动态规划;

/**
 * Description:
 * 给你一个整数数组 nums ，请你找出数组中乘积最大的连续子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。
 * 输入: [2,3,-2,4]
 * 输出: 6
 * 解释: 子数组 [2,3] 有最大乘积 6。
 *
 * dp[i] = max(dp[j]+1)
 * j  = 0 > i-1 && arr[j] < arr[i]
 * 双层循环
 *
 * User: zhangll
 * Date: 2020-08-19
 * Time: 21:23
 */
public class _152_乘积最大子数组 {

    public int maxProduct(int[] nums) {

        return 0;

    }

}
