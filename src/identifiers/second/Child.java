package identifiers.second;

import identifiers.first.Parent;


public class Child extends Parent {

    // klasa potomna nie ma dostępu do private klasy rodzica z innej paczki
    // klasa potomna nie ma tez dostepu do identyfikatora domyslnego
    // bez identyfikatora = domyslny = identyfikator w obrebie paczki

    public void testIdentifier() {
        System.out.println(" ");
        System.out.println("Test dostępu z klasy Child w innej paczce: ");
        System.out.println("Pole first - " + first);
        // System.out.println("Pole second - " + second); brak dostepu
        System.out.println("Pole third - " + third);
        // System.out.println("Pole fourth - " + fourth); brak dostepu
        firstMethod();
        // secondMethod(); brak dostepu
        thirdMethod();
        // fourthMethod(); brak dostepu
    }
}