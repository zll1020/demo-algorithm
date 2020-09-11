package com.example.algorithm.demoalgorithm.leetcode.堆;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Description: 构建一个K最小堆
 * User: zhangll
 * Date: 2020-08-17
 * Time: 21:12
 */
public class _703_数据流中的第K大元素 {
    public static void main(String[] args) {
        int k = 1;
        int[] arr = {4,5,8,2};
        KthLargest kthLargest = new KthLargest(3, arr);
        System.out.println( kthLargest.add(3));// returns 4
        System.out.println(kthLargest.add(5));// returns 5
        System.out.println(kthLargest.add(10));// returns 5
        kthLargest.add(9);// returns 8
        kthLargest.add(4);// returns 8

    }


}
class KthLargest {

    static int [] elements ;
    static int size = 0;
    static int k = 0;
    public KthLargest(int k, int[] nums) {
        elements = new int[k];
        k = k;
        for (int i =0 ;i<k && i < nums.length;i++){
            elements[i] = nums[i];
            size++;
        }
        // 构建初始堆
        int index = (size >> 1) - 1;
        while (index > 0 && size > 0){
            int temp = elements[index];
            elements[index] = elements[0];
            elements[0] = temp;
            index--;
        }
        for (int j = k ;j < nums.length;j++){
            if (nums[j] > elements[0]){
                elements[0] = nums[j];
                siftDown(0);
            }
        }

    }

    //从下向上的下溢
    static void siftDown(int index){
        while ((index << 1) + 1 < size ){
            int left = (index << 1) + 1;
            int leftData = elements[left];
            if ((index << 1) + 2 < size && leftData > elements[(index << 1) + 2]){
                left = (index << 1) +2;
            }
            if (elements[index] > elements[left]){
                int temp = elements[index];
                elements[index] = elements[left];
                elements[left] = temp;
            }
            index = left;
        }
    }

    public int add(int val) {
        if (size < k){
            elements[size++] = elements[0];
            elements[0] = val;
            siftDown(0);
        }else if (val > elements[0]){
            elements[0] = val;
            siftDown(0);
        }
        return elements[0];

    }
}

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char chr : s.toCharArray()) {
            map.put(chr, map.getOrDefault(chr, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
                (e1, e2) -> e2.getValue() - e1.getValue());

        maxHeap.addAll(map.entrySet());

        StringBuilder sortedString = new StringBuilder(s.length());
        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            for (int i = 0; i < entry.getValue(); i++){
                sortedString.append(entry.getKey());
            }
        }
        return sortedString.toString();
    }
}


/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */