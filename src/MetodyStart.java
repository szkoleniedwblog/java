public class MetodyStart {

    public static void main(String[] args) {

        Metody suma = new Metody();
        System.out.println("---------");

            suma.sumujLiczbyDoStu();

        System.out.println("---------");

            int wynik = suma.pobierzWynik();
            System.out.println(wynik);

        System.out.println("---------");

            wynik = suma.sumujLiczbyOdDo(2,3, "Suma od - do: ");
            System.out.println(wynik);
            wynik = suma.sumujLiczbyOdDo(2,5, "Suma od - do: ");
            System.out.println(wynik);
            wynik = suma.sumujLiczbyOdDo(100,101, "Suma od - do: ");
            System.out.println(wynik);

        System.out.println("---------");
    }


}
