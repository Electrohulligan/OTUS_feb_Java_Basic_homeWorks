package ru.otus.java.basic.homeworks.homework_4_lesson_10;

public class Box {

    private String name;
    private int length;
    private int width;
    private int height;
    private String color;
    private boolean filled;
    private boolean opened;

    public Box(String name, int length, int width, int height, String color, boolean filled, boolean opened) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
        this.filled = filled;
        this.opened = opened;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        System.out.println("Изменить размеры существующей коробки невозможно");
    }

    public boolean isOpened() {
        return opened;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Коробка перекрашена в " + color + " цвет");
    }

    public int getHeight() {
        return height;
    }

    public void setHeigh(int height) {
        System.out.println("Изменить размеры существующей коробки невозможно");
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        System.out.println("Изменить размеры существующей коробки невозможно");
    }

    public void printInfoBox(Box box) {
        String checkOpened;
        String checkFilled;

        if (box.isFilled()) {
            checkFilled = "c предметом";
        } else {
            checkFilled = "пустая";}

        if (box.isOpened()) {
            checkOpened = "открытом";
        } else {
            checkOpened = "закрытом";
        }

        System.out.println("Коробка " + box.name + " длиной " + box.length + " шириной " + box.width + " " +
                            "и высотой " + box.height +
                            " имеет " + box.color + " цвет, находится в " + checkOpened + " состоянии " +
                            checkFilled + " внутри");
    }

    public void putItem(Box box) {
        if(box.isOpened() == true) {
            if(box.filled == true) {
                System.out.println("в коробке " + box.getName() + " уже есть предмет, необходимо сначала убрать его");
            } else {
                System.out.println("Предмет помещён в коробку " + box.getName());
                box.filled = false;
            }
        } else {
            System.out.println("Коробка " + box.getName() + " закрыта");
        }
    }

    public void removeItem(Box box) {
        if(box.isFilled() == true) {
            box.filled = false;
            System.out.println("Предмет удалён из коробки " + box.getName());
        }
    }
}