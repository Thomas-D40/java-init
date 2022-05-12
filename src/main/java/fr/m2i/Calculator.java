package fr.m2i;

public class Calculator {

    public float Calculation(int x, int y, String z) throws ArithmeticException
    {
        switch (z) {
            case "+" :
                return x + y;

            case "-" :
                return x - y;

            case "*" :
                return x * y;
            case "/" :
                if (y == 0) {
                    throw new ArithmeticException("Division par zéro impossible");
                } else {
                    return (float) x / y;
                }
            default: return 0;
        }
    }

    



}


