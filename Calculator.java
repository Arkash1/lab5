package com.company;
import java.util.Scanner;

public class Calculator {

    public double calculate1(int x) {
        return 3 * x + 5;
    }
    public double calculate2(double a, double b) {
        if(a == b) {
            throw new IllegalArgumentException("Ошибка: a и b не должны быть равны (деление на ноль)");
        }
        return (a + b) / (a - b);
    }

    public long calculate3(int a1, int x1, int b1) {
        if(b1 == 0) {
            throw new IllegalArgumentException("Ошибка: b не может быть нулём");
        }
        int value = (a1 * x1) / b1;
        if(value < 0) {
            throw new IllegalArgumentException("Ошибка: результат должен быть неотрицательным");
        }
        long factorial = 1;
        for (int i = 2; i <= value; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число x: ");
        int x = sc.nextInt();
        Calculator calc1 = new Calculator();

        System.out.println("Введите число a: ");
        double a = sc.nextDouble();
        System.out.println("Введите число b: ");
        double b = sc.nextDouble();
        Calculator calc2 = new Calculator();

        System.out.println("Введите число a1: ");
        int a1 = sc.nextInt();
        System.out.println("Введите число x1: ");
        int x1 = sc.nextInt();
        System.out.println("Введите число b1: ");
        int b1 = sc.nextInt();
        Calculator calc3 = new Calculator();

        System.out.printf("\n 3x+5 = " + calc1.calculate1(x));
        System.out.printf("\n (a+b)/(a-b) = " + calc2.calculate2(a, b));
        System.out.printf("\n (ax/b)! = " + calc3.calculate3(a1, x1, b1));
    }

}
