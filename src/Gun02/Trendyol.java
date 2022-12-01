package Gun02;

import Utilis.GenelWebDriver;
import Utilis.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.tools.Tool;
import java.util.ArrayList;
import java.util.List;

public class Trendyol extends GenelWebDriver {
    /*
      Senaryo;
      1- TrendYol a gidiniz
      2- Top Menudeki menu elemanlarının olduğunu doğrulayınız.
   */
    @Test
    void validateMenu() {

       wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='modal-close'][title='Kapat']")));
       WebElement kapat=driver.findElement(By.cssSelector("[class='modal-close'][title='Kapat']"));
       kapat.click();

        Tools.Bekle(2);
        List<String> expected = new ArrayList<>();
        expected.add("KADIN");
        expected.add("ERKEK");
        expected.add("ÇOCUK");
        expected.add("EV & MOBILYA");
        expected.add("SÜPERMARKET");
        expected.add("KOZMETIK");
        expected.add("AYAKKABI & ÇANTA");
        expected.add("SAAT & AKSESUAR");
        expected.add("ELEKTRONIK");
        expected.add("SPOR&OUTDOOR");

       List <WebElement>actual=driver.findElements(By.cssSelector("ul[class='main-nav']>li"));
        for (int i = 0; i < expected.size(); i++) {

            Assert.assertEquals(expected.get(i),actual.get(i).getText(),"Sonuçlar");

        }
    }
}