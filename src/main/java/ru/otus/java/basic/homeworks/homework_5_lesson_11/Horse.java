package ru.otus.java.basic.homeworks.homework_5_lesson_11;

public class Horse extends Animal {


    public Horse(String name, int speedRun, int speedSwim, int endurance, int enduranceForSwim, int enduranceForRun) {
        super(name, speedRun, speedSwim, endurance, enduranceForSwim, enduranceForRun);
    }

    @Override
    public int run(int distance) {
        return super.run(distance);
    }

    @Override
    public int swim(int distance) {
        int distanceForEndurance =  speedSwim * endurance/enduranceForSwim;
        if (distanceForEndurance >= distance) {
            System.out.print("Животное " + name + " преодолевает дистанцию " + distance + " вплавь за ");
            return distance / speedSwim;
        } else {
            System.out.print("У животного " + name + " не хватает выносливости и оно не может преодолеть данную дистанцию вплавь ");
            return - 1;
        }
    }
}