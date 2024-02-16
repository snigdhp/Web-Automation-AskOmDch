package FormPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

    @Test
    public class AskOmDch {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new FirefoxDriver();
        Step1_homePage();
        Step2_clickOnAccounts();
        Step3_regsiterNewCustomer();
        Step4_clickOnRegisterButton();


    }

        private static void Step4_clickOnRegisterButton() {
        driver.findElement(By.xpath("//button[contains(text(),'Register')]."))
                .click();
        }

        private static void Step3_regsiterNewCustomer() {
        driver.findElement(By.xpath("//input[@id='reg_username']"))
                .sendKeys("tarun");
        waitTimeInSecond(4);
        driver.findElement(By.xpath("//input[@id='reg_email']"))
                .sendKeys("tarun@yopmail.com");
        waitTimeInSecond(5);
        driver.findElement(By.xpath("//input[@id='reg_password']"))
                .sendKeys("Tarun@123");
        waitTimeInSecond(6);

    }

        private static void waitTimeInSecond(int waitTimeInSecond) {
            try {
                Thread.sleep(waitTimeInSecond *1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        private static void Step2_clickOnAccounts() {
        driver.findElement(By.xpath("//header/div[@id='ast-desktop-header']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[6]/a[1]"))
                .click();
    }


    private static void Step1_homePage() {
        driver.get("https://askomdch.com/");
    }

}


