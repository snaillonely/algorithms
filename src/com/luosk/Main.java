package com.luosk;

import com.luosk.leetcode.Q155_MinStack;

public class Main {

    public static void main(String[] args) {

        Q155_MinStack minStack = new Q155_MinStack();

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}
