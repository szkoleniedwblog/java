public class TypyObiektowe {

    public static void main(String[] args) {

        // definicja zmiennych dla liczb całkowitych
        Byte naJednymBajcie = 111;
        Short naDwochBajtach = 11111;
        Integer naCzterechBajtach = 111111111;
        Long naOsmiuBajtach = 1111111111L;

        // definicja zmiennych dla liczb zmienno przecinkowych
        Float naCzterechBajtach2 = 122.7788F;                   // 6-7 cyfr po przecinku
        Double naOsmiuBajtach2 = 122.22121212121212D;            // do 15 cyfr po przecinku

        // definicja zmiennych logicznych
        Boolean prawda = true;
        Boolean falsz = false;

        // definicja zmiennych typu znak
        Character znak = 'A';
        String ciagZnakow = "Hello World";		// ciąg znaków

        System.out.println(ciagZnakow.charAt(0));
        System.out.println(ciagZnakow.charAt(1));
        System.out.println(ciagZnakow.charAt(2));
        System.out.println(ciagZnakow.charAt(3));


        System.out.println(ciagZnakow.contains("ll"));

    }
}
