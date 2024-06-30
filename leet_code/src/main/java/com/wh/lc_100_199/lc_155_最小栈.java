package com.wh.lc_100_199;

import java.util.Stack;

/**
 * Description:
 * https://leetcode.cn/problems/min-stack/description/
 * @Author WangHao
 * @Create 2024/6/23 23:22
 */
public class lc_155_最小栈 {
    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;

    public lc_155_最小栈() {
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        if (dataStack == null) {
            dataStack = new Stack<>();
        }
        if (minStack == null) {
            minStack = new Stack<>();
        }
        dataStack.push(val);
        if (minStack.size() == 0) {
            minStack.push(val);
        } else {
            Integer peekValue = minStack.peek();
            if (peekValue > val) {
                minStack.push(val);
            } else {
                minStack.push(peekValue);
            }
        }
    }

    public void pop() {
        dataStack.pop();
        minStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            throw new RuntimeException("stack is empty.");
        }
        return minStack.peek();
    }
}
