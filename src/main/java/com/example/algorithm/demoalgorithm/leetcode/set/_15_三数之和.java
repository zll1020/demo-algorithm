package com.example.algorithm.demoalgorithm.leetcode.set;

import java.util.List;

/**
 * Description: 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum
 *
 * 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 *
 * 满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 *
 * 1 暴力 双层循环，加一个set 枚举A，B，去一个set 中查找 -a+b）
 * 2排序
 * 查询一次 枚举 -4 -1 -1 -0 1 2
 * 在剩余的部分中，两面向中间查找 a+b+c > 0右边往左，a+b+c小于0，左边向右
 * User: zhangll
 * Date: 2020-08-18
 * Time: 19:26
 */
public class _15_三数之和 {
    public List<List<Integer>> threeSum(int[] nums) {

        return null;

    }
}
