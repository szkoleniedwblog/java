public class Auto {

    public String marka;
    public String model;
    public int rok;
    public int przebieg;
    public String wlasciciel;
    public String cena;

    // domyślny konstruktor bez argumentów
    public Auto() {

    }
    public Auto(String marka, String model, int rok, int przebieg, String wlasciciel, String cena) {
        this.marka = marka;
        this.model = model;
        this.rok = rok;
        this.wlasciciel = wlasciciel;
        this.cena = cena;
    }

    public void jedz() {
        System.out.println("Jadęęęę !!!");
    }

    public void hamuj() {
        System.out.println("Hamujęęę !!!");
    }

    public void info() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji: " + rok);
        System.out.println("Przebieg: " + przebieg);
        System.out.println("Właściciel: " + wlasciciel);
        System.out.println("Cena: " + cena);
    }

}
