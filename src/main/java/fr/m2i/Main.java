package fr.m2i;

import java.sql.SQLOutput;
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
            } catch (Exception e) {
                System.out.println("Essayez à nouveau");
                scanner.nextLine();
            }
        }
        scanner.close();

        try {
            division(10, 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }




        String finalSentence = String.format("Résultat : %d * %d = %d", firstNumber, secondNumber, firstNumber*secondNumber);
        String finalSentenceV2 = String.format("Résultat : %d * %d = %d", firstNumber, secondNumber, Math.multiplyExact(firstNumber,secondNumber));

        System.out.println("Résultat : " + firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));

        System.out.println(finalSentence);
        System.out.println(finalSentenceV2);




    }

    public static int division(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Tu ne peux pas diviser par zéro");
        }
        int result = a / b;
        return result;
    }


}



