package exceptions;

import java.util.Scanner;

public class ExceptionsCheck {

    public static void main(String[] args) throws InvalidAgeException {

        String imie;
        int wiek;
        boolean alkohol;
        char ostatniZnak;

        Scanner mojScanner = new Scanner(System.in);

        // pobieramy imię od klienta
        System.out.println("Dzień dobry !!!");
        System.out.print("Podaj swoje imię: ");
        imie = mojScanner.nextLine();

        // jeżeli nie podamy imienia to przypisujemy wyrażenie Drogi kliencie
        if (imie.isEmpty()) {
            imie = "Drogi kliencie";
        }

        // po ostatnim znaku imienia rozkminiamy czy to kobieta
        ostatniZnak = imie.charAt(imie.length() - 1);

        // pytanko o zakup alkoholu
        System.out.print("Czy kupujesz alkohol ? ");
        alkohol = mojScanner.nextBoolean();

        if (alkohol) {
            System.out.print("Podaj wiek: ");
            wiek = mojScanner.nextInt();

            if (wiek <= 0) {
                throw new InvalidAgeException("Nieprawidłowy wiek !!!");
            } else if (wiek < 18) {
                if (ostatniZnak == 'a' || ostatniZnak == 'A') {
                    System.out.println(imie + " jesteś niepełnoletnia i nie możesz kupic alkoholu. Przykro mi.");
                } else {
                    System.out.println(imie + " jesteś niepełnoletni i nie możesz kupic alkoholu. Przykro mi.");
                }

            }

        }

        System.out.println("Dziękujemy za zakupy !!! Zapraszamy ponownie.");
    }

    }



