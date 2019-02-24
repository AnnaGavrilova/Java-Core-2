package CargoByShips;

public class WayToPier extends Stage {
    public WayToPier() {
        this.name = "путь причал / пролив";
    }

    @Override
    public void go(Ship ship) {
        try {
            System.out.println(ship.getName() + " начал проходить: " + name);
            Thread.sleep(2000 + (int) (Math.random() * 800));
            System.out.println(ship.getName() + " закончил этап: " + name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
