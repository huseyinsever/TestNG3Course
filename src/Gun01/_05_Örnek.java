package Gun01;

import Utilis.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _05_Örnek extends GenelWebDriver {
    /*
       Senaryo ;
         1- http://opencart.abstracta.us/index.php?route=account/login  sitesini açınız.
         2- asd@gmail.com  ve 123qweasd   bilgileri ile login olan test metodunu yazınız.
         3- Login olup olmadığınızı assert ile kontrol ediniz.

     */
    @Test
    void LoginTest() {
        WebElement inputEmail = driver.findElement(By.cssSelector("#input-email"));
        inputEmail.sendKeys("husnu3535@outlook.com ");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("husnu3535");

        WebElement Login = driver.findElement(By.cssSelector("input[value='Login']"));
        Login.click();


    }
}