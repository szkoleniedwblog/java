import java.util.Scanner;

public class InstrukcjaSwitch {

    public static void main(String[] args) {

        String danie;

        Scanner mojScanner = new Scanner(System.in);
        System.out.print("Co chcesz zamówić? ");
        danie = mojScanner.nextLine();

        switch (danie) {

            case "Pizza":
                System.out.println("Cena to 11 zł.");
                break;
            case "Frytki":
                System.out.println("Cena to 44 zł.");
                break;
            case "Gulasz":
                System.out.println("Cena to 33 zł.");
                break;
            case "Zapiekanka":
                System.out.println("Cena to 22 zł.");
                break;
            default:
                System.out.println("Nie mamy takiego dania.");

        }

    }

}
