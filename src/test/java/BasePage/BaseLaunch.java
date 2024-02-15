package BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseLaunch {
    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://askomdch.com/");
        System.out.println(driver.getTitle());
        driver.close();
    }
}
