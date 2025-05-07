package ru.otus.java.basic.homeworks.homework_14_lesson_21;

public class ArrayInThread {

    public static void main(String[] args) throws InterruptedException {
        double[] array1 = new double[100_000_000];
        double[] array2 = new double[100_000_000];

        Measure.stamp();
        System.out.println();
        System.out.println("Time to create an array with by four threads");
        Thread myThread1 = new Thread(() -> {
            createPartArray(array1, 0, array1.length / 4);
        });

        Thread myThread2 = new Thread(() -> {
            createPartArray(array1, array1.length / 4, array1.length / 2);
        });

        Thread myThread3 = new Thread(() -> {
            createPartArray(array1, array1.length / 2, array1.length - array1.length / 4);
        });

        Thread myThread4 = new Thread(() -> {
            createPartArray(array1, array1.length - array1.length / 4, array1.length);
        });

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread1.join();
        myThread2.join();
        myThread3.join();
        myThread4.join();
        Measure.print();

        Measure.stamp();
        System.out.println();
        System.out.println("Time to create an array with a single thread");
        createFullArray(array2);
        Measure.print();
    }

    public static void createFullArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i) * Math.cos(i / 1.2);
        }
    }

    public static void createPartArray(double[] array, int leftIndex, int rightIndex) {
        for (int i = leftIndex; i < rightIndex; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i) * Math.cos(i / 1.2);
        }
    }

}