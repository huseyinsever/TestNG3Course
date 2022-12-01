package Gun07;

import Utilis.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
   Senaryo :
   1- Siteyi açınız.
   2- Sitede "ipod" kelimesini aratınız
   3- Çıkan sonuçlardan ilkini sepete atınız.
   4- Shopping Chart a tıklatınız.
   5- Checkout yapınız.
   6- Continue butonalarına tıklatıp bilgileri giriniz.
   7- En confirm ile siparişi verdiğinizi doğrulayınız.
      doğrulamayı çıkan sayfadaki "Your order has been placed" yazısı ile yapınız.
*/
public class _02_PlaceOrder extends GenelWebDriver {

    @Test
    void ProccedToCheckout(){

        WebElement search=driver.findElement(By.cssSelector("[name='search']"));
        search.sendKeys("ipod");

        WebElement  searchbutton=driver.findElement(By.xpath("//*[@class='btn btn-default btn-lg']"));
        searchbutton.click();

        WebElement addToCart=driver.findElement(By.xpath("(//*[text()='Add to Cart'])[1]"));
        addToCart.click();

        WebElement shoppingCart=driver.findElement(By.xpath("//*[text()='Shopping Cart']"));
        shoppingCart.click();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        WebElement checkOut=driver.findElement(By.xpath("(//*[text()='Checkout'])[2]"));
        checkOut.click();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[value='Continue']")));
        WebElement Continue=driver.findElement(By.cssSelector("[value='Continue']"));
        Continue.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id='button-shipping-address']")));
        WebElement Continue2=driver.findElement(By.cssSelector("[id='button-shipping-address']"));
        Continue2.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id='button-shipping-method']")));
        WebElement Continue3=driver.findElement(By.cssSelector("[id='button-shipping-method']"));
        Continue3.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type='checkbox']")));
        WebElement checkBox=driver.findElement(By.cssSelector("[type='checkbox']"));
        checkBox.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id='button-payment-method']")));
        WebElement Continue4=driver.findElement(By.cssSelector("[id='button-payment-method']"));
        Continue4.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id='button-confirm']")));
        WebElement confirmClick=driver.findElement(By.cssSelector("[id='button-confirm']"));
        confirmClick.click();

        wait.until(ExpectedConditions.urlContains("success"));

        WebElement h1yazıDgrlma=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Your order has been placed!'])[2]")));

        Assert.assertEquals(h1yazıDgrlma.getText(),"Your order has been placed!","Karşilaştirma Sonucu");


    }
}
