package fr.m2i;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Ecrivez un premier nombre entier : ");
                firstNumber = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Essayez à nouveau");
                scanner.nextLine();
            }
        }

        while (true) {
            try {
                System.out.print("Ecrivez un second nombre entier : ");
                secondNumber = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Essayez à nouveau");
                scanner.nextLine();
            }
        }

        System.out.println("Résultat : " + firstNumber + " * " + secondNumber + " = "   + (firstNumber * secondNumber));


    }
}

