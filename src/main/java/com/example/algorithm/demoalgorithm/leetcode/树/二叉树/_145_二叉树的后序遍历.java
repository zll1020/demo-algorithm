package com.example.algorithm.demoalgorithm.leetcode.树.二叉树;

import java.util.*;

/**
 * Description:
 * User: zhangll
 * Date: 2020-08-12
 * Time: 17:31
 */
public class _145_二叉树的后序遍历 {

    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        List<Integer> list = new ArrayList<>();
        while(true) {
            while(root!=null) {
                st.push(root);
                st.push(root);
                root = root.left;
            }
            if(st.isEmpty()) break;
            root = st.pop();
            if(!st.isEmpty() && st.peek()==root) {
                root = root.right;
            }else{
                list.add(root.val);
                root = null;
            }
        }
        return list;
    }

    public List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        TreeNode cur=root;
        Stack<TreeNode> stack=new Stack<>();
        HashSet<TreeNode> set=new HashSet<>();//存放访问过的节点
        while(true){
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            //栈顶节点
            TreeNode temp = stack.peek();
            //没有右节点
            if (temp.right == null) {
                res.add(temp.val);
                set.add(temp);
                stack.pop();
            }
            //有的话就去遍历右节点
            else {
                //右节点没被访问过
                if(!set.contains(temp.right))
                    cur = temp.right;
                else {
                    res.add(temp.val);
                    set.add(temp);
                    stack.pop();
                }
            }
            if(stack.empty()) break;
        }
        return res;

    }

}
