package ru.otus.java.basic.homeworks.homework_5_lesson_11;

public class Cat extends Animal {

    public Cat(String name, int speedRun, int speedSwim, int endurance, int enduranceForSwim, int enduranceForRun) {
        super(name, speedRun, speedSwim, endurance, enduranceForSwim, enduranceForRun);
    }

    @Override
    public int run(int distance) {
        return super.run(distance);
    }

    @Override
    public int swim(int distance) {
        System.out.print("Кот " + name + " не умеет плавать ");
        return - 1;
    }
}