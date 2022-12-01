package Gun05;

import Utilis.GenelWebDriver;
import Utilis.ParametreliWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _04_SearchFunctionality extends ParametreliWebDriver {
    /*
       Senaryo ;
       1- Siteyi açınız.
       2- mac kelimeini göndererek aratınız.
       3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.
       4- aynı işlemi samsung için de yapınız
     */
    @Test
    @Parameters("arananKelime")
    void searchFunctionality(String txtSearch){

        WebElement searchInput=driver.findElement(By.cssSelector("[class='form-control input-lg']"));
        searchInput.sendKeys(txtSearch);

        WebElement button=driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        button.click();

        //h4>a yapılabilir liste için
       List<WebElement> macBulunan=driver.findElements(By.cssSelector("div[class*='product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12']"));
        for (WebElement liste:macBulunan) {
            Assert.assertTrue(liste.getText().toLowerCase().contains(txtSearch));
        }








    }
}
