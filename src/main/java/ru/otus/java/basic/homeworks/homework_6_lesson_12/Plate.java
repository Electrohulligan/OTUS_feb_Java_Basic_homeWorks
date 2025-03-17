package ru.otus.java.basic.homeworks.homework_6_lesson_12;

public class Plate {
    private int volume;
    private int maxAmountOfFood;
    private int currentAmountOfFood;

    public Plate(int volume, int currentAmountOfFood, int maxAmountOfFood) {
        this.volume = volume;
        this.currentAmountOfFood = currentAmountOfFood;
        this.maxAmountOfFood = maxAmountOfFood;
    }

    public int getMaxAmountOfFood() {
        return maxAmountOfFood;
    }

    public int getCurrentAmountOfFood() {
        return currentAmountOfFood;
    }

    public void setMaxAmountOfFood(int maxAmountOfFood) {
        this.maxAmountOfFood = maxAmountOfFood;
    }

    public void setCurrentAmountOfFood(int currentAmountOfFood) {
        this.currentAmountOfFood = currentAmountOfFood;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void addFullPlateFood(Plate plate, int addedFood) {
        if(addedFood > plate.volume) {
            System.out.println("Такое количество еды в тарелку не поместиться");
        } else {
            plate.currentAmountOfFood += addedFood;
            System.out.println("Тарелку наполнили");
            System.out.println("Количество еды в тарелке теперь " + currentAmountOfFood + " единиц");
        }
    }

    public boolean decreaseFood(Plate plate, int byEaten) {
        if(currentAmountOfFood - byEaten > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void feedCats(Plate plate, Cat[] cats){
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].isEnoughFood(cats[i], plate) && cats[i].isSatiety() == false) {
                cats[i].eat(cats[i], plate);
                System.out.println("Кот " + cats[i].getName() + " поел и теперь сыт");
            } else if (cats[i].isEnoughFood(cats[i], plate) && cats[i].isSatiety() == true) {
                System.out.println("Кот " + cats[i].getName() + " уже ел и сейчас сыт");
            } else if (!cats[i].isEnoughFood(cats[i], plate) && cats[i].isSatiety() == true) {
                System.out.println("Кот " + cats[i].getName() + " уже ел и сейчас сыт");
            }
            else {
                System.out.println("Еды в тарелке для кота " + cats[i].getName() + " недостаточно, он не смог поеть и остался голодным");
            }
        }
    }
}