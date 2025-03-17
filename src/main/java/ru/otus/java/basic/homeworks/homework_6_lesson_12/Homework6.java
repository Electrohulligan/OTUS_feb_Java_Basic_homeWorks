package ru.otus.java.basic.homeworks.homework_6_lesson_12;

public class Homework6 {
    public static void main(String[] args) {
        Cat[] packOfCats1 = new Cat[5];
        packOfCats1[0] = new Cat("Конфуций", 7, false);
        packOfCats1[1] = new Cat("Бонифаций", 4, false);
        packOfCats1[2] = new Cat("Грамши", 3, false);
        packOfCats1[3] = new Cat("Платон", 4, false);
        packOfCats1[4] = new Cat("Гамлет", 5, false);

        Plate plate1 = new Plate(20,20, 20);

        plate1.feedCats(plate1, packOfCats1);
        System.out.println("-----------------------------------------------------");
        plate1.addFullPlateFood(plate1, 30);
        System.out.println("-----------------------------------------------------");
        plate1.addFullPlateFood(plate1, 15);
        System.out.println("-----------------------------------------------------");
        plate1.feedCats(plate1, packOfCats1);
    }
}
