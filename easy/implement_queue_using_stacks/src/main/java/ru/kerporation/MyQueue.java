package ru.kerporation;

import java.util.Stack;

class MyQueue {

    private final Stack<Integer> s1;
    private final Stack<Integer> helper;
    private int front;

    public MyQueue() {
        this.s1 = new Stack<>();
        this.helper = new Stack<>();
    }

    public void push(final int x) {
        if (s1.empty()) {
            front = x;
        }
        while (!s1.isEmpty()) {
            helper.push(s1.pop());
        }
        helper.push(x);

        while (!helper.isEmpty()) {
            s1.push(helper.pop());
        }
    }

    public int pop() {
        int res = s1.pop();
        if (!s1.empty()) {
            front = s1.peek();
        }
        return res;
    }

    public int peek() {
        return front;
    }

    public boolean empty() {
        return s1.isEmpty();
    }
}