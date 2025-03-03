package ru.otus.java.basic.homeworks.homework_3_lesson_7;

public class homework_3 {
    public static void main(String[] args) {
        sumOfPositiveElements(new int[][] {{1,2,3,-4,1,-9}, {1,2,3,-4,1,-9}});
        getPrintCharArray2D(5);
        diagonalToZero(new int[][] {{1,2,3,-4,1}, {2,3,-4,1,-9}, {2,3,-4,1,-9}, {2,3,-4,1,-9}, {2,3,-4,1,-9}});
        findMaxElementInArray(new int[][] {{1,2,3,-4,1,-9}, {1,2,3,-4,1,-9}});
        findSecondSumLineArray(2, new int[][] {{1,5,5,-4,1,-9}, {1,2,8,-4,100,-9}, {1,2,3,-4,1,-9}});
    }

    public static int findSecondSumLineArray(int numberSumLine, int[][] ints) {
        int sumLine = 0;
        if (ints.length < 1) {
            System.out.println("Массив не имеет второй строки");
            return -1;
        }
        else {
            for(int i = 0; i < ints[numberSumLine-1].length; i++) {
                   sumLine = sumLine + ints[numberSumLine - 1][i];
            }
            System.out.println(ints.length);
            System.out.println("Сумма эллементов " + numberSumLine + "-ой строки массива равна " + sumLine);
            return sumLine;
        }
    }

    public static int findMaxElementInArray(int[][] ints) {
        int max = ints[0][0];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                if (ints[i][j] > max) {
                    max = ints[i][j];
                }
            }
        }
        System.out.println("Максимальный эллемент массива составляет " + max);
        return max;
    }

    public static void diagonalToZero(int[][] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                if ((i == j) || (i == ints.length - 1 - j)) ints[i][j] = 0;
                System.out.print(ints[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void getPrintCharArray2D(int size) {
        char [][] arrayChar = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arrayChar[i][j] = '*';
                System.out.print(arrayChar[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sumOfPositiveElements(int[][] ints) {
        int sum = 0;
        for(int i = 0; i < ints.length; i++ ) {
            for(int j = 0; j < ints[i].length; j++ ) {
                if(ints[i][j] > 0) {
                    sum += ints[i][j];
                }
            }
            System.out.print("Сумма положительных эллементов массива равна " + sum);
        }
    }
}