package fr.m2i;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Integer choice = null;
        Integer continuer = null;
        Integer firstNumber = null;
        Integer secondNumber = null;

        while (continuer == null || continuer == 1) {
            while (choice == null) {
                try {
                    System.out.println("Quelle opération voulez-vous faire?" + System.lineSeparator() + "1 - addition" +
                            System.lineSeparator() + "2 - soustraction" + System.lineSeparator() + "3 - multiplication"
                            + System.lineSeparator() + "4 - division");

                    choice = scan.nextInt();
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

            switch (choice) {
                case 1:
                    System.out.println("Le résultat est de :" + Calculator.addition(firstNumber, secondNumber));
                    break;
                case 2:
                    System.out.println("Le résultat est de :" + Calculator.soustraction(firstNumber, secondNumber));
                    break;
                case 3:
                    System.out.println("Le résultat est de :" + Calculator.multiplication(firstNumber, secondNumber));
                    break;
                case 4:
                    if (secondNumber == 0) {
                       System.out.println("Impossible de diviser par zéro");
                       break;
                       }
                    System.out.println("Le résultat est de :" + Calculator.division(firstNumber, secondNumber));
                    break;
                default:
                    System.out.println("Ce n'est pas un choix disponible");
            }

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



