public class FinalTest {

    public static void main(String[] args) {
        final int x = 2;
        // x = 5; tez sie nie da bo x wyżej jest jako final
        final Person person = new Person("tim", 26);
        person.age = 25; // tu sie da bo to nie age jest final

        // person = new Person("roger", 22);  nie a się bo person wyżej jest final


    }


}
