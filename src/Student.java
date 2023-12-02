public class Student {

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;

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

}
