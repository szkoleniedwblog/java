import java.util.Scanner;

// podstawowy kalkulator
public class CalculatorTest {

    public static void main(String[] args) {

        int liczba1;
        int liczba2;

        Scanner mainScanner = new Scanner(System.in);
            System.out.print("Podaj dowolną liczbę całkowitą: ");
            liczba1 = mainScanner.nextInt();
            System.out.print("Podaj drugą liczbę całkowitą: ");
            liczba2 = mainScanner.nextInt();

            Calculator calculator = new Calculator();


            System.out.println("Podstawowe działania:");

            System.out.println("Dodanie liczb: " + calculator.dodajLiczby(liczba1,liczba2));

            System.out.println("Odjęcie liczb: " + calculator.odejmijLiczby(liczba1,liczba2));

            System.out.println("Mnożenie liczb: " + calculator.pomnozLiczby(liczba1,liczba2));

            System.out.println("Dzielenie liczb: " + calculator.podzielLiczby(liczba1,liczba2));

            System.out.println("Reszta z dzielenia liczb: " + calculator.resztaZDzielenialLiczb(liczba1,liczba2));


    }



}
