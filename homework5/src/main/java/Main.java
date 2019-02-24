
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class Main {
    public static final int CARS_COUNT = 4;

    public static void main(String[] args) {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Semaphore smp = new Semaphore(2);
        final Race race = new Race(new Road(60), new Tunnel(smp), new Road(40));
        final Car[] cars = new Car[CARS_COUNT];
        final CyclicBarrier cb1 = new CyclicBarrier(CARS_COUNT, new BarActionStart());
        final CyclicBarrier cb2 = new CyclicBarrier(CARS_COUNT, new BarActionFinish());
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10), cb1, cb2);
        }

        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }
    }
}


