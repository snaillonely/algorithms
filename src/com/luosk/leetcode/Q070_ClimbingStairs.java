package com.luosk.leetcode;

public class Q070_ClimbingStairs {
    public int climbStairs(int n) {
        return climbStairs_01(n);
    }

    private int climbStairs_01(int n) {
        int front = 1, back = 0;
        while (n-- > 0) {
            int temp = front + back;
            back = front;
            front = temp;
        }

        return front;
    }
}
