package ru.otus.java.basic.homeworks.homework_11_lesson_18;

import java.util.Arrays;

public class SortBubble {

    public static void BubbleSort(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    min = array[i];
                    array[i] = array[j];
                    array[j] = min;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {

        int[] arr = {1, 7, 2, 87, 34, 1, 29, 56, 58, 43, 41, 45, 23, 29, 21, 16};
        System.out.println(Arrays.toString(arr));
        BubbleSort(arr);
    }
}

