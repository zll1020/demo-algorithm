package com.example.algorithm.demoalgorithm.leetcode.栈;

import java.util.Stack;

/**
 * Description:
 * User: zhangll
 * Date: 2020-04-20
 * Time: 21:20
 */
public class _20_有效的括号 {

    public static void main(String[] args) {
        boolean result = isValid2("(]");
        result = isValid("()");
        System.out.println(result);
    }

    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
     *
     * 有效字符串需满足：
     *
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     * 注意空字符串可被认为是有效字符串。
     *
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for (int i = 0;i< s.length() ; i++){
            Character c = s.charAt(i);
            if (c == '{' || c == '('  ||c == '[' ){
                stack.push(c);
            }else {
                if (stack.size() == 0){
                    return false;
                }
                Character peek = stack.pop();
                // 判断是否一对
                if (c == '}' && peek != '{') {
                    return false;
                }
                if (c == ')' && peek != '('){
                    return false;
                }
                if (c == ']' && peek != '['){
                    return false;
                }
            }
        }
        return stack.empty();
    }


    /**
     * 效率低
     * @param s
     * @return
     */
    public static boolean isValid2(String s) {
        while (s.contains("{}") || s.contains("[]") || s.contains("()")){
            s.replace("{}","");
            s.replace("[]","");
            s.replace("()","");
        }
        return s.isEmpty();
    }
}
