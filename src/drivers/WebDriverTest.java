package drivers;

public class WebDriverTest {

    public static void main(String[] args) throws NoValidBrowserName {


        WebDriver driver = getsDriver("chrome2");

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

    private static WebDriver getsDriver(String name) throws NoValidBrowserName {

        if (name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FirefoxDriver();
        }
        throw new NoValidBrowserName("Nieprawidłowa nazwa przeglądarki");

    }


}
