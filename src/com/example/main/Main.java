package com.example.main;

import com.example.calc.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int[] tab = calc.getNumber();
        System.out.println(calc.isEqual(tab));
        System.out.println(calc.isGreater(tab));
        System.out.println(calc.isLeast(tab));
    }
}
