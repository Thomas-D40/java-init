package fr.m2i;

public class Calculator {

    private int x;
    private int y;
    String z;

    public Calculator(int a, int b, String c) {
        this.x = a;
        this.y = b;
        this.z = c;
    }


    public static float Calculation(int x, int y, String z)
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


