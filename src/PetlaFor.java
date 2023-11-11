
public class PetlaFor {

    public static void main(String[] args) {

        int liczba = 100;

        for (int i=1; i<=liczba; i++) {

            if (i % 10 == 0) {
                    System.out.println(i);
                }

            else {
                if (i < 10) {
                    System.out.print("0" + i + " ");
                } else {
                    System.out.print(i + " ");
                }
            }
        }




    }


}
