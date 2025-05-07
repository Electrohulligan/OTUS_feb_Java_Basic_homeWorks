package ru.otus.java.basic.homeworks.homework_5_lesson_11;

public abstract class Animal {
    String name;
    int speedRun;
    int speedSwim;

    int endurance;
    int enduranceForSwim;
    int enduranceForRun;

    public Animal(String name, int speedRun, int speedSwim, int endurance, int enduranceForSwim, int enduranceForRun) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.endurance = endurance;
        this.enduranceForSwim = enduranceForSwim;
        this.enduranceForRun = enduranceForRun;
    }


    public int run(int distance) {
        int distanceForEndurance =  speedRun * endurance / enduranceForRun;
        if (distanceForEndurance >= distance) {
            System.out.print("Животное " + name + " преодолевает дистанцию " + distance + " бегом за ");
            return distance / speedRun;
        } else {
            System.out.println("У животного " + name + " не хватает выносливости и оно не может преодолеть данную дистанцию");
            return - 1;
        }
    }

    public abstract int swim(int distance);
}
