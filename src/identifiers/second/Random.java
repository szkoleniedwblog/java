package identifiers.second;

import identifiers.first.Parent;

public class Random {

    // klasa w innej paczce - poprzez obiekt tez nie ma
    // dostępu do pol i metod private i default
    // nie ma dziedziczenia więc nie ma tez dostepu do protected

    public void testIdentifier() {

        Parent parent = new Parent();


        System.out.println(" ");
        System.out.println("Test dostępu z obiektu klasy w innej paczce: ");

        parent.first = "first";
        // parent.second = "second"; brak dostępu
        // parent.third = "third"; brak dostępu
        // parent.fourth = "fourth"; brak dostępu

        parent.firstMethod();
        // parent.secondMethod(); brak dostępu
        // parent.thirdMethod(); brak dostępu
        // parent.fourthMethod(); brak dostepu
    }

}
