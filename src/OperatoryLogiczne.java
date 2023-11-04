public class OperatoryLogiczne {

    public static void main(String[] args) {

        boolean firstNumber = true;
        boolean secondNumber = false;
        boolean thirdNumber = true;
        boolean fourthNumber = false;

        System.out.println(" Czy first && second? " + (firstNumber && secondNumber));
        System.out.println(" Czy first && third? " + (firstNumber && thirdNumber));
        System.out.println(" Czy first || second? " + (firstNumber || secondNumber));
        System.out.println(" Czy second || fourth? " + (secondNumber || fourthNumber));
        System.out.println(" Czy nie first ? " + (!firstNumber));
        System.out.println(" Czy nie second? " + (!secondNumber));
        System.out.println(" Czy nie (first && second)? " + (!(firstNumber && secondNumber)));


    }

}
