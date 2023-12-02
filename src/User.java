public class User {

    public String userName;
    public String password;

    // java ma domyślny konstruktor ale możemy go też zdefiniować.
    // wywołąna jest zawsze po zdefiniowaniu obiektu a pomocą new
    /*public User() {
        System.out.println("Jestem w konstruktorze domyśłnym i jestem teraz wywołana");
    }*/

    // może być więcej konstruktorów i możemy do nich przekazywac jakieś argumenty
    // wóczas domyśkny jest ten bez parametrów
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        System.out.println("Jestem w konstruktorze z parametrami i jestem teraz wywołana");
    }

    public void sayHello() {
        System.out.println("Hello my username is " + userName);

    }
    public void ustawHaslo() {
        System.out.println("My pass is " + password);

    }
}
