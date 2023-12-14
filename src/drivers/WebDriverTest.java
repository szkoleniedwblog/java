package drivers;

public class WebDriverTest {

    public static void main(String[] args) {


        WebDriver driver = getsDriver("firefox");

        //WebDriver driver = new ChromeDriver();
        driver.get();
        driver.findElementBy();

        //WebDriver driver = new FirefoxDriver();
        //driver.get();
        //driver.findElementBy();



        // tworzymy obiekt dla chrome
        //ChromeDriver chrome = new ChromeDriver();
        //chrome.get();
        //chrome.findElementBy();
        //chrome.findElementBy();
        //chrome.findElementBy();
        //chrome.findElementBy();
        //chrome.findElementBy();

        // tworzymy obiekt dla firefox
        //FirefoxDriver firefox = new FirefoxDriver();
        //firefox.get();
        //firefox.findElementBy();
        //firefox.findElementBy();
        //firefox.findElementBy();
        //firefox.findElementBy();
        //firefox.findElementBy();


    }

    private static WebDriver getsDriver(String name) {

        if (name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FirefoxDriver();
        }
        return null;

    }


}
