package com.example.algorithm.demoalgorithm.leetcode.位运算;

/**
 * Description:
 * 给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。
 * 输入: 2
 * 输出: [0,1,1]
 *
 * User: zhangll
 * Date: 2020-08-19
 * Time: 20:02
 */
public class _338_比特位计数 {

    public int[] countBits(int num) {
        int [] arr = new int[num+1];
        for (int i = 0 ; i<=num; i++){
            arr[i] = 0;
            int n = i;
            while (n != 0){
                arr[i]++;
                n = n&(n-1);
            }
        }
        return arr;
    }
}
