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
        Float result = retrieveRequestedOperation();



        if (result == null) {
            throw new Exception ("Une erreur est survenue !");
        }
        System.out.println((String.format("Résultat %f: ", result)));


        scan.close();
    }

    public Float retrieveRequestedOperation() {


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
        return calculation(firstNumber, secondNumber, choice);


    }



    public Float calculation(int x, int y, String z) throws ArithmeticException
    {
        switch (z) {
            case "+" :
                return (float) x + y;

            case "-" :
                return (float) x - y;

            case "*" :
                return (float) x * y;
            case "/" :
                if (y == 0) {
                    throw new ArithmeticException("Division par zéro impossible");
                } else {
                    return (float) x / y;
                }
            default: return null;
        }
    }

    



}


