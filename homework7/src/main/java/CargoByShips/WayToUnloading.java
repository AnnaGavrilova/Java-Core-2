package CargoByShips;

public class WayToUnloading extends Stage {
    public WayToUnloading() {
        this.name = "путь пролив / разгрузка";
    }

    @Override
    public void go(Ship ship) {
        try {
            System.out.println(ship.getName() + " начал проходить: " + name);
            Thread.sleep(1000 + (int) (Math.random() * 800));
            System.out.println(ship.getName() + " закончил этап: " + name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
