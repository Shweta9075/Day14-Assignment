package com.bridgelabz;

import java.util.Stack;

public class CreateStack {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        System.out.println("Empty stack: " + stk.isEmpty());
        // pushing elements into Stack
        stk.push(70);
        stk.push(30);
        stk.push(56);
        System.out.println("Stack: " + stk);
        System.out.println("Empty stack: " + stk.isEmpty());
        System.out.println("Stack pop: " + stk.pop());
        System.out.println("Stack peek: " + stk.peek());
        System.out.println("Empty stack: " + stk.isEmpty());

    }
}
