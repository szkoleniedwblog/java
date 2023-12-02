public class Metody {

   // metoda która nic nie zwraca - void
    public void sumujLiczbyDoStu() {
    // public - rodzaj dostępu do metody
    // void - co ma zwrócić metoda , jeżeli void - to nic nie zwraca
    // może zwrócić int, może zwrócić dowolny obiekt, np nasz Student lub Auto lub String
    // nazwa metody

        int suma = 0;
        System.out.println("Sumujemy liczby od 0 - 100:");
        for (int i=0; i<=100; i++) {
            System.out.print("Dodaję do " + suma + " wartość " + i);
            suma = suma + i;
            System.out.println(" Mam teraz: " + suma);
        }
        System.out.println("Ostatenie suma wynosi = " + suma);

    }

    // metoda która zwraca int - int
    public int pobierzWynik() {
        // public - rodzaj dostępu do metody
        // int - co ma zwrócić metoda , jeżeli void - to nic nie zwraca
        // nazwa metody

        int suma = 0;
        for (int i=0; i<=100; i++) {
            suma = suma + i;
        }
        return suma;
    }

    public int sumujLiczbyOdDo(int liczbaOd, int liczbaDo, String jakisInny) {
        // przekazujemy dowolne paranetry do metody;
        int suma = 0;
        for (int i = liczbaOd; i<=liczbaDo; i++) {
            suma = suma + i;
        }
        System.out.println(jakisInny + liczbaOd + " - " + liczbaDo);
        return suma;

    }
}
