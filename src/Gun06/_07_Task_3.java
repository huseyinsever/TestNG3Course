package Gun06;
import Utilis.GenelWebDriver;
import Utilis.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _07_Task_3 extends GenelWebDriver {
    /*
   Senaryo
   1- Siteye gidiniz
   2- Specials tiklayiniz
   3- Cikan urun sayisi ile indirimli urun sayisi ayni mi dogrulayiniz
   4- Yukarıdaki işlemden sonra her ürünün önceki fiyatının şu andaki fiyattan
      yüksek olduğunu doğrulayınız.
*/
    @Test
    void specialsValidation() {
        WebElement spc = driver.findElement(By.linkText("Specials"));
        spc.click();

        List<WebElement> oldPriceList = driver.findElements(By.className("price-old")); // eski fiyatlar
        List<WebElement> productList = driver.findElements(By.className("product-thumb")); // ürün isimleri  h4>a

        Assert.assertEquals(productList.size(), oldPriceList.size()); // 3.madde

        /***** Eksi fiyat yeni fiyat karşılaştırması *****/
        List<WebElement> newPriceList = driver.findElements(By.cssSelector("[class='price-new']")); // yeni fiyatlar
        for (int i = 0; i < newPriceList.size(); i++) {
            Assert.assertTrue(
                    Double.parseDouble(newPriceList.get(i).getText().replace("$", "")) < Double.parseDouble(oldPriceList.get(i).getText().replace("$", ""))
                    , "Karşılaştırma sonucu : ");
        }
    }


            // Farklı cözümü
            /*    for(int i=0;i< newPriceList.size() ; i++)
                Assert.assertTrue(Tools.WebElementToDouble(newPriceList.get(i)) <
                        Tools.WebElementToDouble(oldPriceList.get(i)));
            */
}