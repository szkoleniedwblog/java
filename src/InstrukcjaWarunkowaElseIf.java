import java.util.Scanner;

public class InstrukcjaWarunkowaElseIf {

    public static void main(String[] args) {

        float liczba1;
        float liczba2;

        Scanner mojScanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        liczba1 = mojScanner.nextFloat();

        System.out.print("Podaj drugą liczbę: ");
        liczba2 = mojScanner.nextFloat();

        System.out.println("Porównanie podanych liczb:");

        if (liczba1 > liczba2) {
            System.out.println("Liczba " + liczba1 + " jest większa niż liczba " + liczba2);
        } else if (liczba1 == liczba2) {
            System.out.println("Liczba " + liczba1 + " jest równa liczbie " + liczba2);
        } else {
            System.out.println("Liczba " + liczba1 + " jest mniejsza niż liczba " + liczba2);
        }

    }





}
