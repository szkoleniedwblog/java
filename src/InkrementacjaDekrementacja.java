// zwiększanie lub zmniejszanie o jeden wartości zmiennych liczbowych
public class InkrementacjaDekrementacja {
    public static void main(String[] args) {

        int a = 0;
        // post i preinkrementacja - zwiększenie o jeden
        int b = a++;
        System.out.println("b = " + b);     // najpierw b = a = 0,
        System.out.println("a = " + a);     // dopiero po tym zwięększamy a o 1

        int c = ++a;
        System.out.println("a = " + a);     // najpierw a zwiększamy o 1
        System.out.println("c = " + c);     // przypisujemy a do c


        int d = 0;
        // postdekrementacja - zmniejszenie o jeden
        int e = d--;
        System.out.println("e = " + e);     // najpierw do e przypisujemy d = 0,
        System.out.println("d = " + d);     // dopiero po tym mniejszamy d o 1

        // predekrementacja - zmniejszenie o jeden
        int f = --d;
        System.out.println("d = " + d);     // najpierw d zmniejszamy o 1
        System.out.println("f = " + f);     // przypisujemy d do f

    }

}
