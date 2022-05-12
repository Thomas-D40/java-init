package fr.m2i;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Calculator calcul = new Calculator();

        try {
            calcul.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}



