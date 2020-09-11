package com.example.algorithm.demoalgorithm.leetcode;

/**
 * Description: 二分搜索
 * User: zhangll
 * Date: 2020-08-18
 * Time: 21:46
 */
public class _69_平方根 {

    public int mySqrt(int x) {
        return binaryHandle(0,x);
    }

    /**
     * 牛顿迭代法
     * @param a
     * @return
     */
    public int mySqrt2(int a) {
        long x = a;
        while (x * x > a) {
            x = (x + a / x) / 2;
        }
        return (int) x;
    }

    private int binaryHandle(int start, int end) {
       int mid = end/2;
       int sum = mid * mid;
       if ( sum == end){
           return mid;
       }
       if (sum < end){
           start = mid;
       }
       if (sum > end){
           end = mid;
       }
       return binaryHandle(start,end);
    }

    public int mySqrt1(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long)mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return ans;
    }

}
