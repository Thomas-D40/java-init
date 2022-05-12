package fr.m2i;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public final List<String> handledOperators = new ArrayList<String>() {{
        add("+");
        add("-");
        add("*");
        add("/");
    }};

    public void start() throws Exception, ArithmeticException {
        Scanner scan = new Scanner(System.in);
        String choice = null;
        Integer firstNumber = null;
        Integer secondNumber = null;
        Integer continuer = null;
        Double result = retrieveRequestedOperation();



        if (result == null) {
            System.out.println("Une erreur est survenue ou vous avez essayé de diviser par zéro !");;
        } else {
            System.out.println((String.format("Résultat : %f", result)));
        }


        scan.close();
    }

    public Double retrieveRequestedOperation() {


        Scanner scan = new Scanner(System.in);


        String choice = null;
        Integer firstNumber = null;
        Integer secondNumber = null;





            while (choice == null) {
                try {
                    System.out.println("Quelle opération voulez-vous faire?" + System.lineSeparator() + "+ : addition" +
                            System.lineSeparator() + "- : soustraction" + System.lineSeparator() + "* : multiplication"
                            + System.lineSeparator() + "/ : division");

                    choice = scan.next();
                    if (!handledOperators.contains(choice)) {
                        choice = null;
                        System.out.println("Vous n'avez pas sélection via les options proposées");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Vous n'avez pas sélection via les options proposées");
                    scan.nextLine();
                } catch (Exception e) {
                    return null;
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
                } catch (Exception e) {
                    System.out.println("Une erreur est survenue !");
                }
            }
        try {
            return calculation(firstNumber, secondNumber, choice);
        } catch (ArithmeticException e) {
            System.out.println("Division par zéro impossible");
            return null;
        }


    }



    public Double calculation(int x, int y, String z) throws ArithmeticException
    {
        switch (z) {
            case "+" :
                return (double) x + y;

            case "-" :
                return (double) x - y;

            case "*" :
                return (double) x * y;
            case "/" :
                if (y == 0) {
                    throw new ArithmeticException("Division par zéro impossible");
                } else {
                    return (double) x / y;
                }
            default: return null;
        }
    }

    



}


