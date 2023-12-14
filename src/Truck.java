public class Truck implements Vehicle {


    @Override
    public void jazda(int speed) {
        System.out.println("Jade ciężarówką z prędkością " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Zatrzymuje się ciężarówką.");
    }

    @Override
    public String info() {
        return "Ciężarówka";
    }

    public void zatankuj() {
        System.out.println("Tankuję ciężarówkę");
    }
}
