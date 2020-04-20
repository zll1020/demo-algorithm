package com.example.algorithm.demoalgorithm.leetcode.栈;

/**
 * Description:
 * User: zhangll
 * Date: 2020-04-20
 * Time: 22:23
 */
public class _856_括号的分数 {

    /**
     * 给定一个平衡括号字符串 S，按下述规则计算该字符串的分数：
     *
     * () 得 1 分。
     * AB 得 A + B 分，其中 A 和 B 是平衡括号字符串。
     * (A) 得 2 * A 分，其中 A 是平衡括号字符串。
     *
     * @param s
     * @return
     */
    int scoreOfParentheses(String s) {
        int res = 0, l = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '('){
                //左括号“入栈”）当前处理的括号深度+1
                l++;
            } else {
                l--;
            }
            if (s.charAt(i) == ')' && s.charAt(i-1) == '('){
                // 左括号有多少层 乘 n, 否则，相加
                res += 1 << l;
            }
        }
        return res;
    }
}
