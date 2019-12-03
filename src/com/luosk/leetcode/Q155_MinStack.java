package com.luosk.leetcode;

import java.util.Stack;

public class Q155_MinStack {

    Stack<Integer> stack;
    Stack<Integer> min;

    public Q155_MinStack() {
        stack = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (min.isEmpty()) {
            min.push(x);
        } else {
            min.push(Math.min(x, min.peek()));
        }
    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
