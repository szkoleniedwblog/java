public class Tablice {

    public static void main(String[] args) {

        String[] imiona = new String[3];

        imiona[0] = "Darek";
        imiona[1] = "Marek";
        imiona[2] = "Jarek";

        System.out.println(imiona[0]);
        System.out.println(imiona[1]);
        System.out.println(imiona[2]);

        int[] lottoNumbers = new int[] {1,2,3,4,5};
        System.out.println(lottoNumbers[3]);
        System.out.println(lottoNumbers[0]);

        System.out.println(lottoNumbers.length);

        System.out.println("Pętla for ");
        for (int i=0; i<=lottoNumbers.length-1; i++) {
            System.out.println(lottoNumbers[i]);
        }

        System.out.println("Pętla do - while ");
        int numer = 0;

        do {
            System.out.print(numer + " - ");
            System.out.println(lottoNumbers[numer]);
            numer++;
        }
        while (numer <= lottoNumbers.length - 1);

    }


}
