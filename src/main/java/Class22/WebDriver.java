package Class22;

public interface WebDriver {
   void  openBrowser();

   void closeBrowser();
   void maxiimizeWindow();
   void findElement();

}

class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("open browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close driver");
    }

    @Override
    public void maxiimizeWindow() {
        System.out.println("maximize Window");
    }

    @Override
    public void findElement() {
        System.out.println("find element");
    }
}
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("open");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close");
    }

    @Override
    public void maxiimizeWindow() {
        System.out.println("maximize window");

    }

    @Override
    public void findElement() {
        System.out.println("find element");
    }
}