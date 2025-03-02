package ru.otus.java.basic.homeworks.homework03;

public class HomeWork_03 {
    public static void main(String[] args) {
        printIfNegative( -10);
    }

    private static void printIfNegative(int n) {
        if(n < 0) {
            System.out.println(n + "отрицательное число");
        }
    }
}
