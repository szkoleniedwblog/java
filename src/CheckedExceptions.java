import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {


    public static void main(String[] args) {
        try {
            System.out.println("Przed odczytaniem pliku");
            //readFile("C:\\Users\\Darek\\Desktop\\SELENIUM\\java\\src\\test.txt");
            readFile("src/test2.txt");

        } catch (FileNotFoundException e) {
            System.out.println("Wyjątek został wyrzucony");
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Zamknięcie pliku");
        }
    }

    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
        System.out.println("Czytam plik");

    }
}
