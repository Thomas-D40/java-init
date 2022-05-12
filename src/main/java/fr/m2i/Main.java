package fr.m2i;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String choice = null;
        Integer continuer = null;
        Integer firstNumber = null;
        Integer secondNumber = null;

        while (continuer == null || continuer == 1) {
            while (choice == null) {
                try {
                    System.out.println("Quelle opération voulez-vous faire?" + System.lineSeparator() + "+ : addition" +
                            System.lineSeparator() + "- : soustraction" + System.lineSeparator() + "* : multiplication"
                            + System.lineSeparator() + "/ : division");

                    choice = scan.next();
                    if (choice.equals("+") || choice.equals("-") || choice.equals("*") || choice.equals("/")) {
                        continue;
                    } else {
                        choice = null;
                        System.out.println("Vous n'avez pas sélection via les options proposées");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Vous n'avez pas sélection via les options proposées");
                    scan.nextLine();
                }
            }

            while (firstNumber == null) {
                try {
                    System.out.println("Quel est le premier  entier?");
                    firstNumber = scan.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Vous n'avez pas sélection via les options proposées");
                    scan.nextLine();
                }
            }

            while (secondNumber == null) {
                try {
                    System.out.println("Quel est le second?");
                    secondNumber = scan.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Vous n'avez pas sélection via les options proposées");
                    scan.nextLine();
                }
            }

            Calculator calcul = new Calculator(firstNumber, secondNumber, choice);

            System.out.println(Calculator.Calculation(firstNumber, secondNumber, choice));


            System.out.println("Voulez-vous continuer?" + System.lineSeparator() + "1 - Oui" + System.lineSeparator() +
            "2 - Non");
            continuer = scan.nextInt();
            choice = null;
            firstNumber = null;
            secondNumber = null;
        }
        scan.close();


    }
}



