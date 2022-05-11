package fr.m2i;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer firstNumber = null;

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> resTab = new ArrayList<>();


        while (firstNumber == null) {
            try {
                System.out.print("Ecrivez un premier nombre entier : ");
                firstNumber = scanner.nextInt();
                break;

            } catch (InputMismatchException e) {
                System.out.println("Essayez à nouveau");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Mince une erreur s'est produite :(");
                return;
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



