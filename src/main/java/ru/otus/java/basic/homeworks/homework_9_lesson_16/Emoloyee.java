package ru.otus.java.basic.homeworks.homework_9_lesson_16;

public class Emoloyee {
    private String name;
    private int age;

    public Emoloyee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Emoloyee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
