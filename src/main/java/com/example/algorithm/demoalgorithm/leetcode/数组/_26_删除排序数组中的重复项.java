package com.example.algorithm.demoalgorithm.leetcode.数组;

/**
 * Description:
 * User: zhangll
 * Date: 2020-08-12
 * Time: 16:40
 */
public class _26_删除排序数组中的重复项 {

    public int removeDuplicates(int[] nums) {

        if (nums.length == 0){
            return 0;
        }
        int count = 0;
        for (int i = 1 ;i<nums.length;i++){
            // 不相等
            if (nums[count] != nums[i]){
                nums[++count] = nums[i];
            }
        }
        return count+1;
    }
}
