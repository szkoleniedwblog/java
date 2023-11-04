import java.util.Scanner;

public class OperatoryPorownania {

    public static void main(String[] args) {

    int firstNumber;
    int secondNumber;

        Scanner mainScanner = new Scanner(System.in);

        System.out.print("Podaj dowolną liczbę całkowitą: ");
        firstNumber = mainScanner.nextInt();
        System.out.print("Podaj drugą liczbę całkowitą: ");
        secondNumber = mainScanner.nextInt();


        System.out.println(" Czy first > second? " + (firstNumber > secondNumber));
        System.out.println(" Czy first < second? " + (firstNumber < secondNumber));
        System.out.println(" Czy first >= second? " + (firstNumber >= secondNumber));
        System.out.println(" Czy first <= second? " + (firstNumber <= secondNumber));
        System.out.println(" Czy first = second? " + (firstNumber == secondNumber));
        System.out.println(" Czy first <> second? " + (firstNumber != secondNumber));

    }

}
