package Gun07;

import Utilis.GenelWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_PlaceOrderPOM extends GenelWebDriver {
    // TODO : maximize  olmdan sağlıklı çalışması araştırılacak
    @Test
    void ProccedToCheckout(){
        _03_PlaceOrderElements elements=new _03_PlaceOrderElements(driver);

        elements.search.sendKeys("ipod");
        elements.searchButton.click();
        elements.addToCart.click();
        elements.shoppingCart.click();
       // JavascriptExecutor js=(JavascriptExecutor)driver;

        elements.checkOut.click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.Continue)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.Continue2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.Continue3)).click();
        elements.checkBox.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.Continue4)).click();
        elements.confirmClick.click();

        wait.until(ExpectedConditions.urlContains("success"));

        Assert.assertEquals(elements.h1yazıDgrlma.getText(),"Your order has been placed!","Karşilaştirma Sonucu");


    }


}
