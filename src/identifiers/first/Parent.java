package identifiers.first;

public class Parent {

    public String first = "public";
    String second = "default";
    protected String third = "protected";
    private String fourth = "private";

    public void firstMethod() {
        System.out.println("public");
    }

    void secondMethod() {
        System.out.println("default");
    }

    protected void thirdMethod() {
        System.out.println("protected");
    }

    private void fourthMethod() {
        System.out.println("private");
    }

    // sprawdzamy do których pól i metod mamy dostęp z wewnątrz
    public void testIdentifiers() {
        System.out.println(" ");
        System.out.println("Test dostępu z klasy Parent:");
        System.out.println("Pole first - " + first);
        System.out.println("Pole second - " + second);
        System.out.println("Pole third - " + third);
        System.out.println("Pole fourth - " + fourth);
        firstMethod();
        secondMethod();
        thirdMethod();
        fourthMethod();
    }



}
