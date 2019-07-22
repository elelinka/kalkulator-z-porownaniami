package com.example.calc;

import java.util.Scanner;

public class Calculator {

    public String calcNumbers(int[] tab) {
        if (tab[0] > tab[1]) {
            return "Suma liczb " + tab[0] + " oraz " + tab[1] + " jest rowna: " + sum(tab[0], tab[1]);
        } else if (tab[0] < tab[1]) {
            return "Iloczyn liczb: " + tab[0] + " oraz " + tab[1] + " jest rowny: " + multiply(tab[0], tab[1]);
        } else if (tab[0] == tab[1]) {
            return "Wprowadzone liczby: " + tab[0] + " oraz " + tab[1] + " sa rowne: " + power(tab[0]);
        } else {
            return "Probuj dalej";
        }
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
