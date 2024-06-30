package com.wh.lc_200_299;

import java.util.Stack;

/**
 * Description:
 * https://leetcode.cn/problems/implement-queue-using-stacks/description/
 *
 * @Author WangHao
 * @Create 2024/6/23 23:34
 */
public class lc_232_用栈实现队列 {
    public Stack<Integer> pushStack;
    public Stack<Integer> popStack;

    public lc_232_用栈实现队列() {
        this.pushStack = new Stack<>();
        this.popStack = new Stack<>();
    }

    public void push(int x) {
        pushStack.push(x);
        pushToPop();
    }

    public int pop() {
        pushToPop();
        return popStack.pop();
    }

    public int peek() {
        pushToPop();
        return popStack.peek();
    }

    public boolean empty() {
        pushToPop();
        return popStack.isEmpty();
    }

    private void pushToPop() {
        if (popStack.isEmpty()) {
            while (!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
        }
    }
}
