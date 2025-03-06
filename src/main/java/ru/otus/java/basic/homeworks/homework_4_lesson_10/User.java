package ru.otus.java.basic.homeworks.homework_4_lesson_10;

public class User {

    private String name;
    private String surname;
    private String patronymic;
    private int yearOfBirth;
    private String email;

    public User(String name, String surname, String patronymic, int yearOfBirth, String email) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void printInfoUser(String name, String surname, String patronymic, int yearOfBirth, String email){
        System.out.println("ФИО " + name + " " + surname + " " + patronymic);
        System.out.println("Год рождения " + yearOfBirth);
        System.out.println("email " + email);
    }
}
