package TaskThree;

import java.util.ArrayList;

public class Box<T extends Fruits> {

    protected T fruit;
    protected ArrayList<T> arrayOfFruits = new ArrayList<>();

    public Box(T o) {
        fruit = o;
    }

    //добавление фрукта в коробку
    public void setFruit(T element) {
        arrayOfFruits.add(element);
    }

    public T getFruit() {
        return fruit;
    }

    //подсчет веса коробки
    public float getWeight() {
        return (arrayOfFruits.size() * fruit.getWeight());
    }

    //сравнение веса двух коробок
    public boolean compare(Box<?> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }

    //добавление фруктов из данной коробки в другую
    public void sprinkleFruits(Box<T> another) {
        if (this.fruit.getName().equals(another.fruit.getName())) {
            for (T o : arrayOfFruits) {
                another.setFruit(o);
            }
            arrayOfFruits.clear();
        } else {
            System.out.println("Пересыпать не получится, в коробках разные фрукты!");
        }
    }
}
