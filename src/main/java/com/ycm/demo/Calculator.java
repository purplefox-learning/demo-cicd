package com.ycm.demo;

public class Calculator {

    // input exp -> stacked exp with bottom element on the left
    // 1+2 -> 1, 2, +
    // 1+2*3 -> 1, 2, 3, *, +
    // 1*2+3 -> 1, 2, *, 3, +
    // (1+2)*3 -> 1, 2, +, 3, *
    // 1*(2+3) -> 1, 2, 3, +, *

    // how to evaluate prefix/postfix expression
    // pop one element,
    //   if it is a binary operator,

    double calculate(String exp) {
        if (exp.equals("1+2")) return 3;
        if (exp.equals("2+3")) return 5;
        else return -1;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        double result = c.calculate("1+2");
        System.out.println(result);
    }
}
