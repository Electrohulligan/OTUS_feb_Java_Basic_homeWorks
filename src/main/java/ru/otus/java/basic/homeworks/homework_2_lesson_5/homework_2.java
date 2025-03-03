package ru.otus.java.basic.homeworks.homework_2_lesson_5;

import java.util.Arrays;

public class homework_2 {
    public static void main(String[] args) {
        printLineNumber(5, "HelloWorld!!!");
        printSumArray(1,2,3,4,-10,6,78,98,12);
        printFillArrayNumber(5, 1,2,3,4,-10,6,78,98,12);
        printIncreaseArrayNumber(6, 1,1,1,1,1,1,1,1,1);
        printBiggerHalfArray(1,1,1,1,1,1,1,1,1,1);
//        printSumSeveralArrays({1,1,1},{1,1,1},{1,1,1});
        searchHalfArray(1,2,3,6,1,4,17);
        checkIncreaseArray(1,2,3,4,5);
        checkDecreaseArray(5,4,3,2,1);
        revearseArray(1,2,3,4,5);
    }

    public static void printLineNumber(int number, String str) {
        for (int i = 0; i < number; i++) {
            System.out.println(str);
        }
    }

    public static void printSumArray(int... array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                sum += array[i];
            }
        }
        System.out.println("Сумма эллементов массива больших 5 равна " + sum);
    }

    public static void printFillArrayNumber(int number, int... array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = number;
        }
        System.out.println("Изменённый массив " + Arrays.toString(array));
    }

    public static void printIncreaseArrayNumber(int number, int... array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += number;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void printBiggerHalfArray(int... array) {
        int sumHalf1 = 0;
        int sumHalf2 = 0;
        for (int i = 0; i < array.length/2; i++) {
            sumHalf1 = sumHalf1 + array[i];
        }
        for (int i = array.length/2; i < array.length; i++) {
            sumHalf2 = sumHalf2 + array[i];
        }

        if(sumHalf1 > sumHalf2) {
            System.out.println("Правая половина массива больше левой");
        } else if (sumHalf1 < sumHalf2) {
            System.out.println("Левая половина массива больше правой");
        } else {
            System.out.println("Обще половины массива одинаковы");
        }
    }
        // printSumSeveralArrays в процессе решения
    public static void printSumSeveralArrays(int[] array1, int[] array2, int[] array3) {
        int[] sumArray = new int[Math.max(array1.length, Math.max(array2.length, array3.length))];
        for (int i = 0; i < Math.min(array1.length, Math.min(array2.length, array3.length)); i++) {
            sumArray[i] = array1[i] + array2[i] + array3[i];
        }
        for (int i = Math.min(array1.length, Math.min(array2.length, array3.length));
            i < Math.min(array1.length, Math.min(array2.length, array3.length)); i++) {
        }
    }

    public static void searchHalfArray(int...array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        int sumHalf = 0;
        int leftIndex;
        int rightIndex;
        for (int i = 0; i < array.length; i++) {
            sumHalf = sumHalf + array[i];
            if (sumHalf == sum/2) {
                leftIndex = i;
                rightIndex = i+1;
                System.out.println("Сумма элементов массива в левой части с эллементом индексом " + leftIndex +
                        " равна сумме эллементов массива в правой части с эллементом индексом " + rightIndex);
            }
        }
    }

    public static void checkIncreaseArray(int... array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i+1]) {
                if(i == array.length - 2) {
                    System.out.println("Массив является возрастающим");
                }
            } else {
                System.out.println("Массив не является возрастающим");
                break;
            }
        }
    }

    public static void checkDecreaseArray(int... array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]) {
                if(i == array.length - 2) {
                    System.out.println("Массив является убывающим");
                }
            } else {
                System.out.println("Массив не является убывающим");
                break;
            }
        }
    }

    public static void revearseArray(int... array) {
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[array.length - 1 - i];
        }
        System.out.print(Arrays.toString(array) + " -> ");
        System.out.println(Arrays.toString(array2));
    }
}