package fr.m2i;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ecrivez un premier nombre");
        firstNumber = scanner.nextInt();

        System.out.println("Ecrivez un second nombre");
        secondNumber = scanner.nextInt();

        System.out.println("La somme de vos deux nombres est :" + (firstNumber + secondNumber));


    }
}

