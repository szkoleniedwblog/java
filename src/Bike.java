public class Bike implements Vehicle {

    @Override
    public void jazda(int speed) {

        System.out.println("Jadę rowerem z prędkościa " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Zatrzymuję się rowerem.");
    }

    @Override
    public String info() {
        return "Rower";
    }

}
