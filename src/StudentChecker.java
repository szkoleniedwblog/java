public class StudentChecker {

    public static void main(String[] args) {

        // tworzymy 3 obiekty studentów
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        // deklarujemy ich zmienne
        student1.imie = "Marek";
        student1.nazwisko = "Kowalczyk";
        student1.nick = "MKowalczyk";
        student1.email = "mkowalczyk@test.pl";
        student1.numerIndeksu = 2101;

        student2.imie = "Józef";
        student2.nazwisko = "Marciniak";
        student2.nick = "JMarciniak";
        student2.email = "marciniakjozef@test.pl";
        student2.numerIndeksu = 2102;

        student3.imie = "Anan";
        student3.nazwisko = "Kamińska";
        student3.nick = "AKaminska";
        student3.email = "anna.kaminska@test.pl";
        student3.numerIndeksu = 2103;


        // tworzymy tablice ze studentami - tablica powtsaje
        // na bazie naszej klasy i chyba trzyma wszystkie podelementy z tej klasy
        Student[] studenci = new Student[3];

        // przypisujemy obiekty studenci do tablicy
        studenci[0] = student1;
        studenci[1] = student2;
        studenci[2] = student3;

        // wyświetlamy wszystkie metody
       for (int i= 0; i<=studenci.length-1; i++) {
           System.out.println(" ");
           studenci[i].przedstawSie();
           studenci[i].zaloguj();
           studenci[i].podajNumerIndeksu();
           studenci[i].podajEmail();

        }

    }





}
