package ru.otus.java.basic.homeworks.homework_5_lesson_11;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 15, 0, 30, 0, 1);
        Dog dog = new Dog("Жучка", 30, 5, 200, 2, 1);
        Horse horse = new Horse("Есаул", 50, 5, 150,4,1);

        System.out.println(cat.run(450) + " секунд");
        System.out.println(dog.run(6000) + " секунд");
        System.out.println(horse.run(7500) + " секунд");

        System.out.println(cat.swim(450) + " секунд");
        System.out.println(dog.swim(250) + " секунд");
        System.out.println(horse.swim(300) + " секунд");

    }
}