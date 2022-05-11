package fr.m2i;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int firstNumber;

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> resTab = new ArrayList<>();

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
        scanner.close();

        String phrase = "%d X %d = %d";
        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format(phrase, firstNumber, i, firstNumber*i));
            resTab.add(firstNumber*i);
        }
        System.out.println(resTab);


    }


}



