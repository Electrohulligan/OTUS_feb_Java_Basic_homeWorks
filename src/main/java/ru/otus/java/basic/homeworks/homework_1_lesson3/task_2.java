package ru.otus.java.basic.homeworks.homework_1_lesson3;

public class task_2 {
    public static void main(String[] args) {
        task_2.checksign(1, 2, 3);
    }

    public static void checksign(int val1, int val2, int val3) {
        int sum = val1 + val2 + val3;
        if(sum >= 0)
            System.out.println("Сумма положительная");
        else {
            System.out.println("Сумма отрицательная");
        }
    }
}
