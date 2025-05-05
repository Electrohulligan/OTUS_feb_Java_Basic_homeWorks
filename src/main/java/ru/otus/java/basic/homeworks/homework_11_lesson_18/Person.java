package ru.otus.java.basic.homeworks.homework_11_lesson_18;

public class Person {
    private String name;
    private Position position;
    private Long id;


    public Person(String name, Position position, Long id) {
        this.name = name;
        this.id = id;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person {" +
                "name = '" + name + '\'' +
                ", position = " + position +
                ", id = " + id +
                '}';
    }
}