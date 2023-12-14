package drivers;

public class ChromeDriver implements WebDriver {

    @Override
    public void get() {
        System.out.println("Otwieram przegladarkę Chrome");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduję element za pomocą Chrome");
    }
}
