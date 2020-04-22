package com.example.algorithm.demoalgorithm.leetcode.栈;

import java.util.Stack;

/**
 * Description:
 * User: zhangll
 * Date: 2020-04-20
 * Time: 22:29
 */
public class _150_逆波兰表达式求值 {

    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"2","1","+","3","*"}));
    }


    /**
     * 根据逆波兰表示法，求表达式的值。
     *
     * 有效的运算符包括 +, -, *, / 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。
     *
     * 说明：
     *
     * 整数除法只保留整数部分。
     * 给定逆波兰表达式总是有效的。换句话说，表达式总会得出有效数值且不存在除数为 0 的情况。
     *
     * 输入: ["2", "1", "+", "3", "*"]
     * 输出: 9
     * 解释: ((2 + 1) * 3) = 9
     */
    public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (int i = 0 ;i<tokens.length;i++){
            String s = tokens[i];
            if (s.equals("*") || s.equals("-") || s.equals("+") || s.equals("/")){
                Integer one = Integer.valueOf(stack.pop());
                Integer two = Integer.valueOf(stack.pop());
                if (s.equals("*")){
                    stack.push(String.valueOf(one * two));
                }else if (s.equals("/")){
                    stack.push(String.valueOf(two / one));
                }else if (s.equals("+")){
                    stack.push(String.valueOf(two + one));
                }else if (s.equals("-")){
                    stack.push(String.valueOf(two - one));
                }
            }else {
                stack.push(s);
            }

        }
        return Integer.valueOf(stack.pop());
    }
}
