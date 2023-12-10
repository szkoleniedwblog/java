package identifiers.first;

public class Child extends Parent {

    // klasa potomna nie ma dostępu do private klasy rodzica
    // w tej samej paczce

    public void testIdentifier() {
        System.out.println(" ");
        System.out.println("Test dostępu z klasy Child w tej samej paczce: ");
        System.out.println("Pole first - " + first);
        System.out.println("Pole second - " + second);
        System.out.println("Pole third - " + third);
        // System.out.println("Pole fourth - " + fourth); brak dostepu
        firstMethod();
        secondMethod();
        thirdMethod();
        // fourthMethod(); brak dostepu

    }

}
