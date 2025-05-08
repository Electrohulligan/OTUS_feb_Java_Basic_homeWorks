package ru.otus.java.basic.homeworks.homework_11_lesson_18;

import java.util.Arrays;

public class SortQuick {
    public static void main(String[] args) {
        int[] array = {5, -78, 67, 12, 68, 788, -54, 98, -873, 2, -54, 8, -3, 1198, -123, 7, 56, 528};
        System.out.println("Unsorted Array: " + Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println(" Sorted Array: " + Arrays.toString(array));
    }

    public static void quickSort(int[] arr, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int border = dividedArray(arr, leftIndex, rightIndex);

            quickSort(arr, leftIndex, border - 1);
            quickSort(arr, border + 1, rightIndex);
        }
    }

    private static int dividedArray(int[] arr, int leftIndex, int rightIndex) {
        int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;
        int border = arr[middleIndex];

        int temporary = arr[middleIndex];
        arr[middleIndex] = arr[rightIndex];
        arr[rightIndex] = temporary;

        int i = (leftIndex - 1);
        for (int j = leftIndex; j < rightIndex; j++) {
            if (arr[j] < border) {
                i++;

                temporary = arr[i];
                arr[i] = arr[j];
                arr[j] = temporary;
            }
        }

        temporary = arr[i + 1];
        arr[i + 1] = arr[rightIndex];
        arr[rightIndex] = temporary;

        return i + 1;
    }
}
