public class AutoTest {

    public static void main(String[] args) {

        // tworzymy nowy obiekt na podstawie utworzonej klasy Auto
        Auto mercedes = new Auto();

        // deklarujemy zmienne w obiekcie mercedes
        mercedes.marka = "Mercedes";
        mercedes.model = "Klasa S";
        mercedes.rok = 2011;
        mercedes.przebieg = 120000;
        mercedes.wlasciciel = "Pierwszy";
        mercedes.cena = "67tys. PLN";

        // wywolujemy metody dotepne w tym obiekcie (czy klasie)
        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        // tworzymy nowy obiekt na podstawie utworzonej klasy Auto
        Auto audi = new Auto();

        // deklarujemy zmienne w obiekcie mercedes
        audi.marka = "Audi";
        audi.model = "A5";
        audi.rok = 2018;
        audi.przebieg = 45000;
        audi.wlasciciel = "Drugi";
        audi.cena = "87tys. PLN";

        // wywolujemy metody dotepne w tym obiekcie (czy klasie)
        audi.jedz();
        audi.hamuj();
        audi.info();
        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();


        // tworzymy klejne auto - bez ustawionych zmiennych
        Auto noName = new Auto();
        // próbując wywołać zwracane namsą nulle i zera
        noName.jedz();
        noName.hamuj();
        noName.info();

    }

}
