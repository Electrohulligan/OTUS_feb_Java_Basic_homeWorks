package ru.otus.java.basic.homeworks;

import ru.otus.java.basic.homeworks.homework_1_lesson3.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        do {
            System.out.println("Введите число от 1 до 5 включительно: ");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();

            if(a == 1) {
                task_1.greetings();
            }
            else if(a == 2) {
                task_2.checksign(1, 2, 3);
            }
            else if(a == 3) {
                task_3.selectColor(21);
            }
            else if(a == 4) {
                task_4.compareNumbers();
            }
            else if(a == 5) {
                task_5.addOrSubtractAndPrint(10, 20, false);
            } else {
                System.out.println("Вы ввели неправильное число");
            }
        } while (a >= 1 && a <= 5);
    }
}
