package com.company;
import java.util.Scanner;

public class Main {

    public double calculate1(int x) {
        return 3 * x + 5;
    }
    public double calculate2(double a, double b) {
        if(a == b) {
            System.out.println("Ошибка: a и b не должны быть равны (деление на ноль)");
        }
        return  (a + b) / (a - b);

    }

    public long calculate3(int a1, int x1, int b1) {
        if(b1 == 0) {
            System.out.println("Ошибка: b не может быть нулём");
        }
        int value = (a1 * x1) / b1;
        if(value < 0) {
            System.out.println("Ошибка: результат должен быть неотрицательным");
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
        Main calc1 = new Main();

        System.out.println("Введите число a: ");
        double a = sc.nextDouble();
        System.out.println("Введите число b: ");
        double b = sc.nextDouble();
        Main calc2 = new Main();

        System.out.println("Введите число a1: ");
        int a1 = sc.nextInt();
        System.out.println("Введите число x1: ");
        int x1 = sc.nextInt();
        System.out.println("Введите число b1: ");
        int b1 = sc.nextInt();
        Main calc3 = new Main();

        System.out.println("\n 3x+5 = " + calc1.calculate1(x));
        System.out.println("\n (a+b)/(a-b) = " + calc2.calculate2(a, b));
        System.out.println("\n (ax/b)! = " + calc3.calculate3(a1, x1, b1));
    }

}
