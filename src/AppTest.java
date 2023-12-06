public class AppTest {

    public static void main(String[] args) {

        AndroidApp androidApp = new AndroidApp("Booksy");
        androidApp.appInfo();
        androidApp.runAndroidApp();

        IphoneApp iphoneApp = new IphoneApp("iNavi");
        iphoneApp.appInfo();
        iphoneApp.runIphoneApp();



    }


}
