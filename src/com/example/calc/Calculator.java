package com.example.calc;

import java.util.Scanner;

public class Calculator {

    public String isGreater(int[] tab) {
        int sum = sum(tab[0], tab[1]);
        return tab[0] > tab[1] ? "Pierwsza liczba jest wieksza. Suma liczb: " + tab[0] + " oraz " + tab[1] + " jest rowna: " + sum : "Pierwsza liczba nie jest wieksza od drugiej";
    }

    public String isLeast(int[] tab) {
        int multiply = multiply(tab[0], tab[1]);
        return tab[0] < tab[1] ? "Pierwsza liczba jest mniejsza. Iloczyn liczb: " + tab[0] + " oraz " + tab[1] + " jest rowny: " + multiply : "Pierwsza liczba nie jest mniejsza od drugiej";
    }

    public String isEqual(int[] tab) {
        int power = power(tab[0]);
        return tab[0] == tab[1] ? "Wprowadzone liczby: " + tab[0] + " oraz " + tab[1] + " sa rowne: " + power : "Liczby sa rozne";
    }

    public int[] getNumber() {
        Scanner userInput = new Scanner(System.in);
        int[] numbersFromUser = new int[2];

        System.out.println("Podaj pierwsza liczbe");
        numbersFromUser[0] = userInput.nextInt();
        userInput.nextLine();

        System.out.println("Podaj druga liczbe");
        numbersFromUser[1] = userInput.nextInt();
        userInput.nextLine();

        userInput.close();
        return numbersFromUser;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int power(int a) {
        return (int) Math.pow(a, 2);
    }
}
