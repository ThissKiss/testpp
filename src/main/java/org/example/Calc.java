package org.example;

public class Calc {
    public int summ(int a, int b) {
        int result;
        result = a + b;
        System.out.printf("Сумма %d и %d равна %d\n", a, b, result);
        //System.out.println("Сумма " + a + " и " + b + " равна " + result);
        return result;
    }
    public int sub(int a, int b) {
        return a - b;
    }
}
