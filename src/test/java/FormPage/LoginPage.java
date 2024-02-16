package FormPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class LoginPage {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new FirefoxDriver();
        //Login Select Username and Password
        step_1_ClickAccountTab();
        step_2_selectUsername();
        step_3_Enterpassword();
        step_4_clickOnRememberMe();
        step_5_clickOnLoginBtn();


    }

    private static void step_5_clickOnLoginBtn() {
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
    }

    private static void step_4_clickOnRememberMe() {
        driver.findElement(By.xpath("//input[@id='rememberme']"))
                .click();
    }

    private static void step_3_Enterpassword() {
        driver.findElement(By.xpath("//input[@id='password']"))
                .sendKeys("Tarun@123");
        waitInTimeSecond(5);

    }


    private static void step_2_selectUsername() {
        //driver.findElement(By.xpath("//input[@id='username']").sendKeys("tarun");
        driver.findElement(By.id("username"))
                .sendKeys("tarun");
        waitInTimeSecond(4);

    }

    private static void step_1_ClickAccountTab() {
        driver.get("https://askomdch.com/account/");
    }

    private static void waitInTimeSecond(int waitInTimeSecond) {
        try {
            Thread.sleep(waitInTimeSecond * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
