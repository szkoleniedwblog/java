package identifiers.first;

public class Random {

    // klasa w tej samej paczce - poprzez obiekt tez nie ma
    // dostępu do pol i metod private

    public void testIdentifier() {

        Parent parent = new Parent();


        System.out.println(" ");
        System.out.println("Test dostępu z obiektu klasy w tej samej paczce: ");

        parent.first = "first";
        parent.second = "second";
        parent.third = "third";
        // parent.fourth = "fourth"; brak dostępu

        parent.firstMethod();
        parent.secondMethod();
        parent.thirdMethod();
        // parent.fourthMethod(); brak dostepu
    }

}
