public class Calculator {

    public int dodajLiczby(int liczba1,int liczba2) {
        return (liczba1 + liczba2);
    }

    public int odejmijLiczby(int liczba1, int liczba2) {
            return (liczba1 - liczba2);
    }

    public int pomnozLiczby(int liczba1, int liczba2) {
        return (liczba1 * liczba2);
    }

    public int podzielLiczby(int liczba1, int liczba2) {
        if (liczba2 == 0) {
            System.out.println("Dzielenie przez zero niemożliwe !!!");
            return 0;
        } else {
            return (liczba1 / liczba2);
        }
    }

    public int resztaZDzielenialLiczb(int liczba1, int liczba2) {
        if (liczba2 == 0) {
            System.out.println("Dzielenie przez zero niemożliwe !!!");
            return 0;
        } else {
            return (liczba1 % liczba2);
        }
    }

}
