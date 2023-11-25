public class TabliceCwiczenie {

    public static void main(String[] args) {

        // wyświetlenie liczb podzielnych przez 3 z zakresu 1 -100
        System.out.println("Liczby od 1 do 100 podzielne prze 3");
        for (int i = 1; i<=100; i++) {

            if (i % 3 == 0) {
                System.out.println(i);
            }

        }

        // odwracamy tablicę
        int[] tab1 = new int[] {1,3,5,7,9,11,13};
        int temp;

        //drukujemy tablice przez zamianą
        System.out.println("Tabela przed");
        for (int i= 0; i<=tab1.length-1; i++) {
            System.out.println(tab1[i]);
            }

        // zamieniamy wartości za pomocą zmiennej temp
        for (int i = 0; i<(tab1.length/2); i++) {
            temp = tab1[i];
            tab1[i] = tab1[tab1.length-1-i];
            tab1[tab1.length-1-i] = temp;

        }
        //drukujemy tablice po zamianie
        System.out.println("Tabela 1 po zamianie");
        for (int i=0; i<=tab1.length-1; i++) {
             System.out.println(tab1[i]);
        }
    }



}
