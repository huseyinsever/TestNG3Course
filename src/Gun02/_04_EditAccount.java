package Gun02;

import Utilis.GenelWebDriver;
import Utilis.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.tools.Tool;

public class _04_EditAccount extends GenelWebDriver {
    /*
      1- Siteyi açınız.
      2- Edit Account a tıklatınız.
      3- Yeni isim ve soyisim göndererek Continue yapınız.
      4- İşlem sonucunu kontrol ediniz.
      5- Bu işlemi 2 kez çalıştırarak eski haline getiriniz.
     */
    @Test
    void EditAccount(){
           editAccount1("Osman","Aslan");
           Tools.Bekle(2);
           editAccount1("emre","seker");

    }

    void editAccount1(String ad, String soyad){
        WebElement editAccount=driver.findElement(By.xpath("(//*[text()='Edit Account'])[2]"));
        editAccount.click();

        WebElement firstName=driver.findElement(By.xpath("//*[@name='firstname']"));
        firstName.clear();
        firstName.sendKeys(ad);

        WebElement lastName=driver.findElement(By.xpath("//*[@name='lastname']"));
        lastName.clear();
        lastName.sendKeys(soyad);

        WebElement Continue=driver.findElement(By.xpath("//*[@value='Continue']"));
        Continue.click();

        Tools.succesMessageValidation();

    }

}
