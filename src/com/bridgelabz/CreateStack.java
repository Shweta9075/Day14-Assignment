package com.bridgelabz;

import java.util.Stack;

public class CreateStack {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        // pushing elements into Stack
        stk.push(70);
        stk.push(30);
        stk.push(56);
        System.out.println("Stack: " + stk);
    }
}
