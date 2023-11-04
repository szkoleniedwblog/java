// umołżiwiają wykonanie podstawowych operacji matematycznych
public class OperatoryMatematyczne {

    public static void main(String[] args) {

        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;

        int addiction = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = thirdNumber/secondNumber;
        int mod = secondNumber%firstNumber;

        System.out.println("Wynik dodawania "+addiction);
        System.out.println("Wynik odejmowania "+subtraction);
        System.out.println("Wynik mnożenia "+multiplication);
        System.out.println("Wynik dzielenia "+division);
        System.out.println("Różnica "+mod);

        firstNumber+=secondNumber;      // firstNumber = firstNumber + secondNumber ;
        System.out.println("Wynik dodawania "+firstNumber);
        firstNumber-=secondNumber;      // firstNumber = firstNumber - secondNumber ;
        System.out.println("Wynik odejmowania "+firstNumber);
        firstNumber*=secondNumber;      // firstNumber = firstNumber * secondNumber ;
        System.out.println("Wynik mnożenia "+firstNumber);
        firstNumber/=secondNumber;      // firstNumber = firstNumber / secondNumber ;
        System.out.println("Wynik dzielenia "+firstNumber);
        firstNumber%=secondNumber;      // firstNumber = firstNumber % secondNumber ;
        System.out.println("Wynik różnicy "+firstNumber);

    }

}
