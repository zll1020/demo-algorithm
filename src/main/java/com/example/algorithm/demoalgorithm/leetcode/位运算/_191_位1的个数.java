package com.example.algorithm.demoalgorithm.leetcode.位运算;

/**
 * Description:
 * 编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。
 * 输入：00000000000000000000000000001011
 * 输出：3
 * 解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/number-of-1-bits
 *
 * 1 从后向前取值 &1==1
 *
 * 2 x& (x-1) 消除最后一位的1
 * User: zhangll
 * Date: 2020-08-19
 * Time: 19:44
 */
public class _191_位1的个数 {
    public int hammingWeight(int num) {
        int count = 0;
        while (num!=0){
            num = num&(num-1);
            count++;
        }
        return count;
    }

    public int hammingWeight1(int num) {
        int count = 0;
        for (int i = 0 ; i < 32 ; i++){
            if ((num & 1) == 1){
                count++;
            }
            num = num >> 1;
        }
        return count;
    }
}
