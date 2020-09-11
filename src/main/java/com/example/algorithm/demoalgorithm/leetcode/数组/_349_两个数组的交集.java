package com.example.algorithm.demoalgorithm.leetcode.数组;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Description:
 * User: zhangll
 * Date: 2020-09-08
 * Time: 20:19
 */
public class _349_两个数组的交集 {

    private class Solution {
        public int[] set_intersection(HashSet<Integer> set1, HashSet<Integer> set2) {
            int [] output = new int[set1.size()];
            int idx = 0;
            for (Integer s : set1)
                if (set2.contains(s)) output[idx++] = s;

            return Arrays.copyOf(output, idx);
        }

        public int[] intersection(int[] nums1, int[] nums2) {
            HashSet<Integer> set1 = new HashSet<Integer>();
            for (Integer n : nums1) set1.add(n);
            HashSet<Integer> set2 = new HashSet<Integer>();
            for (Integer n : nums2) set2.add(n);

            if (set1.size() < set2.size()) return set_intersection(set1, set2);
            else return set_intersection(set2, set1);
        }
    }

}


