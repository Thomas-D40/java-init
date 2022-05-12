package fr.m2i;

public class Calculator {

    public float Calculation(int x, int y, String z)
    {
        switch (z) {
            case "+" :
                return x + y;

            case "-" :
                return x - y;

            case "*" :
                return x * y;
            case "/" :
                return (float) x / y;
            default: return 0;
        }
    }

    



}


