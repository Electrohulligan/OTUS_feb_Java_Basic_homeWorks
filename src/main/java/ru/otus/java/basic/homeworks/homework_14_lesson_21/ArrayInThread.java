package ru.otus.java.basic.homeworks.homework_14_lesson_21;

public class ArrayInThread {
    static double[] array1 = new double[100_000_000];
    static double[] array2 = new double[100_000_000];

    public static void main(String[] args) throws InterruptedException {
        Measure.stamp();
        System.out.println();
        System.out.println("Time to create an array with by four threads");
        Thread myThread1 = new Thread(new MyThread1());
        Thread myThread2 = new Thread(new MyThread2());
        Thread myThread3 = new Thread(new MyThread3());
        Thread myThread4 = new Thread(new MyThread4());
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
        createFullArray();
        Measure.print();
    }

    public static void createFullArray() {
        for (int i = 0; i < array1.length; i++) {
            array1[i] = 1.14 * Math.cos(i) * Math.sin(i) * Math.cos(i / 1.2);
        }
    }

    public static void createPartArray(int leftIndex, int rightIndex) {
        for (int i = leftIndex; i < rightIndex; i++) {
            array2[i] = 1.14 * Math.cos(i) * Math.sin(i) * Math.cos(i / 1.2);
        }
    }

}