public class PetlaWhile {

    public static void main(String[] args) {

        int numer = 0;

        // pętla while
        while(numer <= 20) {
            if (numer < 10 ) {
                System.out.println("Zmienna = 0" + numer);
            } else {
                System.out.println("Zmienna = " + numer);
            }
            numer++;
        }
        numer = 0;
        // pętla do while
         do {
            if (numer < 10 ) {
                System.out.println("Zmienna = 0" + numer);
            } else {
                System.out.println("Zmienna = " + numer);
            }
            numer++;
        }
        while(numer <= 20);

    }

}
