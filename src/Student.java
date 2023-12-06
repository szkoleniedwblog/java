public class Student {

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;

    // static jest to słowo któe powoduje że nie możemy ustawić tej wartości z zewnątrz
    // ale możemy ją czytac na poziomie klasy i obeitku danej klasy
    public static String nazwaUczelni = "UMK";

    public void przedstawSie() {
        System.out.println("Nazywam się: " + imie + " " + nazwisko);
    }
    public void zaloguj() {
       System.out.println("Loguję sie za pomocą nicka: " + nick);
    }
    public void podajNumerIndeksu() {
        System.out.println("Mój numer indeksu to: " + numerIndeksu);
    }
    public void podajEmail() {
        System.out.println("Mój adres email to: " + email);
    }

    public static void infoUczelnia() {
        System.out.println("Moja uczelnia to " + nazwaUczelni);
        drugaMetoda();
    }
    public static void drugaMetoda() {
        System.out.println("JEstem w drugiej metodzie");
    }

}
