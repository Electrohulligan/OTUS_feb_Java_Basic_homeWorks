package ru.otus.java.basic.homeworks.homework_4_lesson_10;

import java.time.Year;

public class Homework4 {
    public static void main(String[] args) {
        User[] user = new User[10];
        user[0] = new User("Иванов", "Иван", "Иванович", 1980, "ivanov@mail.ru");
        user[1] = new User("Петров", "Пётр", "Петрович", 1981, "petrov@mail.ru");
        user[2] = new User("Александров", "Алесандр", "Александрович", 1982, "alexandrov@mail.ru");
        user[3] = new User("Васильев", "Василий", "Васильевич", 1988, "vasilev@mail.ru");
        user[4] = new User("Максимов", "Максим", "Максимыч", 1995, "maksimov@mail.ru");
        user[5] = new User("Филиппов", "Филип", "Филлипович", 1990, "fillipov@mail.ru");
        user[6] = new User("Ефимов", "Ефим", "Ефимовчи", 1960, "efimov@mail.ru");
        user[7] = new User("Поликарпов", "Поликарп", "Поликарпович", 1965, "polikarpov@mail.ru");
        user[8] = new User("Артёмов", "Артём", "Артёмович", 2000, "artemov@mail.ru");
        user[9] = new User("Алексеев", "Алексей", "Алексеевич", 2005, "alexeev@mail.ru");

        for(User user1 : user) {
            if ((Year.now().getValue() - user1.getYearOfBirth()) > 40) {
                user1.printInfoUser(user1.getName(),user1.getSurname(),user1.getPatronymic(),user1.getYearOfBirth(),
                                    user1.getEmail());
            }
        }

        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------------");

        Box box1 = new Box( "box1",10,20,30,"зелёный", true, true);
        Box box2 = new Box("box2",5,5,5,"красный", false, true);
        Box box3 = new Box("box3",1,1,1,"серо-буро-малиновый", false, false);
        box1.printInfoBox(box1);
        box1.setColor("синий");
        box1.setHeigh(20);
        box1.putItem(box1);
        box1.removeItem(box1);

        box2.putItem(box2);
        box3.putItem(box3);
    }
}