package ru.otus.java.basic.homeworks.homework_9_lesson_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork9 {
    public static void main(String[] args) {

        System.out.println(getIncreaseSequence(-5, 10).toString());
        System.out.println(getSumMoreThatFive(Arrays.asList(3, 4, 5, -8, 10)));
        System.out.println(getChangeNumberForList(Arrays.asList(3, 4, 5, -8, 10), 11));
        System.out.println(getIncreaeNumberForList(Arrays.asList(3, 4, 5, -8, 10), 11));
        System.out.println("---------------------------------------");
        List<Employee> emoloyees = new ArrayList<>(Arrays.asList(new Employee("Иван", 25),
                new Employee("Пётр", 30),
                new Employee("Илья", 35),
                new Employee("Олег", 18)));

        System.out.println(getNameEmployee(emoloyees));
        System.out.println((getEmployeeAgeMoreThan(emoloyees, 30)).toString());
        getEmployeeAverageAge(emoloyees, 25);
        getEmployeeAverageAge(emoloyees, 35);
        System.out.println(getYoungestEmployee(emoloyees).toString());

    }

    public static List<Integer> getIncreaseSequence(int min, int max) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = min; i <= max; i++) {
            list.add(i);
        }
        return list;
    }

    public static Integer getSumMoreThatFive(List<Integer> list) {
        int sum = 0;
        for (Integer i : list) {
            if (i >= 5) {
                sum += i;
            }
        }
        return sum;
    }

    public static List<Integer> getChangeNumberForList(List<Integer> list, int num) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, num);
        }
        return list;
    }

    public static List<Integer> getIncreaeNumberForList(List<Integer> list, int num) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + num);
        }
        return list;
    }

    public static List<String> getNameEmployee(List<Employee> listEmployee) {
        List<String> nameEmployee = new ArrayList();
        for (int i = 0; i < listEmployee.size(); i++) {
            nameEmployee.add(listEmployee.get(i).getName());
        }
        return nameEmployee;
    }

    public static List<Employee> getEmployeeAgeMoreThan(List<Employee> listEmployee, int minAge) {
        List<Employee> nameEmployee = new ArrayList();
        for (int i = 0; i < listEmployee.size(); i++) {
            if (listEmployee.get(i).getAge() >= minAge)
                nameEmployee.add(listEmployee.get(i));
        }
        return nameEmployee;
    }

    public static void getEmployeeAverageAge(List<Employee> listEmployee, int minAverageAge) {
        int sumAge = 0;
        int averageAge = 0;
        for (int i = 0; i < listEmployee.size(); i++) {
            sumAge = sumAge + listEmployee.get(i).getAge();
        }
        averageAge = sumAge / listEmployee.size();

        if (averageAge >= minAverageAge) {
            System.out.println("средний возраст сотрудников больше или равен указанному значению");
        } else System.out.println("средний возраст сотрудников меньше указанного значения");
    }

    public static Employee getYoungestEmployee(List<Employee> listEmployee) {
        int youngAge = listEmployee.get(0).getAge();
        Employee youngEmployee = listEmployee.get(0);
        for (int i = 0; i < listEmployee.size(); i++) {
            if (listEmployee.get(i).getAge() < youngAge) {
                youngAge = listEmployee.get(i).getAge();
                youngEmployee = listEmployee.get(i);
            }
        }
        return youngEmployee;
    }
}


