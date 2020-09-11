package com.example.algorithm.demoalgorithm.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Description:
 * User: zhangll
 * Date: 2020-08-21
 * Time: 20:30
 */
public class _146_LRU缓存机制 extends LinkedHashMap<Integer, Integer> {
    private int capacity;

    public _146_LRU缓存机制(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }

}
