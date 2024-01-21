package Class26.HW;

import Utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class FaceBook {
    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\anabo\\IdeaProjects\\Javanew\\Files\\Config.properties";
        String URL= ConfigReader.read( "URL");
        String UserName=ConfigReader.read("UserName");
        String PassWord=ConfigReader.read("PassWord");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(URL);
        webDriver.findElement(By.xpath("//input[@id='email']")).sendKeys(UserName);
        webDriver.findElement(By.xpath("//input[@id='pass']")).sendKeys(PassWord);
       webDriver.findElement(By.xpath("//button[@name='login']")).click();

    }
}
