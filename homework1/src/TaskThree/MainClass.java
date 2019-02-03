package TaskThree;

public class MainClass {
    public static void main(String[] args) {

        //создаем коробку с пятью яблоками и выводим ее вес
        int quantity = 5;
        Box<Apple> appleBox1 = new Box<>(new Apple());
        for (int i = 0; i < quantity; i++) {
            appleBox1.setFruit(new Apple());
        }
        System.out.println("Вес первой коробки с яблоками: " + appleBox1.getWeight());

        //создаем коробку с пятью апельсинами
        Box<Orange> orangeBox = new Box<>(new Orange());
        for (int i = 0; i < quantity; i++) {
            orangeBox.setFruit(new Orange());
        }
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight()); //выводим вес коробки с апельсинами

        //сравниваем вес двух коробок
        if (appleBox1.compare(orangeBox)) {
            System.out.println("Вес коробок равен.");
        } else System.out.println("Вес коробок различен");

        //создаем еще одну коробку с четырьмя яблоками
        int quantity2 = 4;
        Box<Apple> appleBox2 = new Box<>(new Apple());
        for (int i = 0; i < quantity2; i++) {
            appleBox2.setFruit(new Apple());
        }
        System.out.println("Вес второй коробки с яблоками: " + appleBox2.getWeight());

        //пересыпаем яблоки из первой коробки во вторую и проверяем вес второй коробки
        appleBox1.sprinkleFruits(appleBox2);
        System.out.println("Новый вес второй коробки с яблоками: " + appleBox2.getWeight());
        System.out.println("Новый вес первой коробки с яблоками: " + appleBox1.getWeight());


    }
}
