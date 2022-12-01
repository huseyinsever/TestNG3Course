package Gun05;

import Utilis.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.swing.plaf.SeparatorUI;

public class _02_ContactUs extends GenelWebDriver {
    /*
  1- ContactUs a tıklayınız
  2- Mesaj kutusuna en az 10 karakterlik bir mesaj yazınız.
  3- Submit ettikten sonra Contact US yazısını doğrulayınız.
 */
    @Test
    @Parameters("mesaj") // XML deki adı
    void ConTactUs(String gelenMesaj){// metoddaki adı

        WebElement contactUs=driver.findElement(By.linkText("Contact Us"));
        contactUs.click();

        WebElement enquiry=driver.findElement(By.cssSelector("[id='input-enquiry']"));
        enquiry.sendKeys(gelenMesaj);

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[value='Submit']")));
        WebElement submit=driver.findElement(By.cssSelector("[value='Submit']"));
        submit.click();

        WebElement YazıDogrula=driver.findElement(By.xpath("(//*[text()='Contact Us'])[3]"));
        Assert.assertTrue(YazıDogrula.getText().contains("Contact Us"));



    }
}
