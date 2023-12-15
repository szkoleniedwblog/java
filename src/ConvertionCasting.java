import drivers.FirefoxDriver;
import drivers.WebDriver;

public class ConvertionCasting {

    public static void main(String[] args) {

        int a = 2;
        double b = 4.23;

        double c = a/b;     // a zostaje niejawnie przekorwertowana na double

        int d = a/(int)b;       // tu sie nic w tle nie zadzieje

        // saodzielnie musimy przkonwertować double na int
        // w nawiasie podajemy typ na który chcemy przekonwertować


        System.out.println(c);
        System.out.println(d);

        WebDriver driver = new FirefoxDriver();

        FirefoxDriver firefoxDriver = (FirefoxDriver) driver;
        firefoxDriver.get();


    }



}
