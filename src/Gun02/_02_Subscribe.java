package Gun02;

import Utilis.GenelWebDriver;
import Utilis.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_Subscribe extends GenelWebDriver {
/*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe ve UnSubscribe işlemlerini ayrı ayrı testlerde yapınız.

 */
    @Test(priority = 1)
    void YesButton(){
        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Newsletter")));
        WebElement newsLetter=driver.findElement(By.partialLinkText("Newsletter"));
        newsLetter.click();

        WebElement YesButton=driver.findElement(By.xpath("(//*[@type='radio'])[1]"));
        YesButton.click();

        WebElement Continue=driver.findElement(By.xpath("//*[@value='Continue']"));
        Continue.click();

        Tools.succesMessageValidation();


    }
    @Test(priority = 2)
    void NoButton(){
        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Newsletter")));
        WebElement newsLetter=driver.findElement(By.partialLinkText("Newsletter"));
        newsLetter.click();

        WebElement NoButton=driver.findElement(By.xpath("(//*[@type='radio'])[2]"));
        NoButton.click();

        WebElement Continue=driver.findElement(By.xpath("//*[@value='Continue']"));
        Continue.click();

        Tools.succesMessageValidation();


    }
}
