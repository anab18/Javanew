package Class22;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver[] w = {new ChromeDriver(), new FirefoxDriver()};
        for (WebDriver r : w) {
            r.openBrowser();
            r.closeBrowser();
            r.findElement();
            r.maxiimizeWindow();

        }
    }
}

