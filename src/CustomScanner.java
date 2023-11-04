import java.util.Scanner;

// pobieranie danych od użytkownika
public class CustomScanner {

    public static void main(String[] args) {

    /*    Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imię:");
        String name = scanner.nextLine();

        System.out.println("Cześć " + name + " !");*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę całkowitą:");
        int firstNumber = scanner.nextInt();

        System.out.println("Druga potęga podanej liczby to  " + firstNumber * firstNumber);
        System.out.println("Trzecia potęga podanej liczby to  " + firstNumber * firstNumber * firstNumber);
    }


}
