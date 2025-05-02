package ru.otus.java.basic.homeworks.homework_8_lesson_15;

public class ApplicationHomework_8_lesson_15 {

    public void checkArray(String[][] arr) throws AppArraySizeException {
        if(arr.length != 4) throw new AppArraySizeException("Неверное количество строк");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].length != 4) throw new AppArraySizeException("Неверное количестов столбцов в строке " + i);
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int sumArray(String[][] arr) throws AppArrayDataException {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(!Character.isDigit(Integer.parseInt(arr[i][j])))
                    sum += Integer.parseInt(arr[i][j]);
                else { throw new AppArrayDataException(
                        "Эллемент массива с индексами " + i + " " + j + " не является числом");
                    }
            }
        }
        return sum;
    }
}