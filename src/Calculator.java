import java.util.Scanner;

// podstawowy kalkulator
public class Calculator {

    public static void main(String[] args) {

        int liczba1;
        int liczba2;

        Scanner mainScanner = new Scanner(System.in);

        System.out.print("Podaj dowolną liczbę całkowitą: ");
        liczba1 = mainScanner.nextInt();
        System.out.print("Podaj drugą liczbę całkowitą: ");
        liczba2 = mainScanner.nextInt();


        System.out.println("Podstawowe działania:");
        System.out.println("Dodanie liczb = " + (liczba1 + liczba2));
        System.out.println("Odjęcie liczb = " + (liczba1 - liczba2));
        System.out.println("Mnożenie liczb = " + (liczba1 * liczba2));
        System.out.println("Dzielenie liczb = " + (liczba1 / liczba2));
        System.out.println("Reszta z dzielenia liczb = " + (liczba1 % liczba2));

    }



}
