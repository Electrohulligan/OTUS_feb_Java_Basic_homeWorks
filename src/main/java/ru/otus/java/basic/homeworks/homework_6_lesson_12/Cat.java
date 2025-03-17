package ru.otus.java.basic.homeworks.homework_6_lesson_12;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEnoughFood(Cat cat, Plate plate) {
        if(cat.appetite <= plate.getCurrentAmountOfFood()) {
            return true;
        } else {
            return false;
        }
    }

    public void eat(Cat cat, Plate plate) {
        plate.setCurrentAmountOfFood(plate.getCurrentAmountOfFood() - cat.appetite);
        cat.satiety = true;

    }
}