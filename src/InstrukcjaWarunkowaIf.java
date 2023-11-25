import java.util.Scanner;

public class InstrukcjaWarunkowaIf {

    public static void main(String[] args) {

        float dzielna;
        float dzielnik;

        Scanner mojScanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        dzielna = mojScanner.nextFloat();

        System.out.print("Podaj drugą liczbę: ");
        dzielnik = mojScanner.nextFloat();

        System.out.println("Wynik dzielenia pierwszej liczby przez drugą:");

        if (dzielnik!=0) {
            System.out.println("Wynik dzielenia = " + (dzielna/dzielnik));
        } else {
            System.out.println("Nie można podzielić przez zero !!!");
        }

    }

}
