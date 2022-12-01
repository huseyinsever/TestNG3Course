package Gun08;

import Gun07._03_PlaceOrderElements;
import Utilis.GenelWebDriver;
import Utilis.Tools;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.xml.namespace.QName;

/*
   Senaryo ;
    1- Siteye gidiniz..
   2- "ipod" ürününü aratınız."ipod" u xml den gönderiniz
   3- çıkan elemanlardan random bir elemanın Add Wish butonuna tıklayınız.
   4- Daha sonra WishList e tıklatınız
   5- Burada çıkan ürünle tıklanan ürünün isminin aynı olup olmadığını doğrulayınız.
 */
public class _01_WishList extends GenelWebDriver {

    @Parameters("itemName")
    @Test
    void addToWishList(String aranacakUrun) {
        _03_PlaceOrderElements elements=new _03_PlaceOrderElements(driver);
        elements.search.sendKeys(aranacakUrun);
        elements.searchButton.click();

        _02_WishListElements wishList=new _02_WishListElements(driver);
        int rndNumber= Tools.RandomGenerator(wishList.searchResults.size());
        String rndUrunAd=wishList.searchResults.get(rndNumber).getText();
        wishList.wishBtnList.get(rndNumber).click();

        wishList.btnWish.click();

        boolean bulundu=false;
        for(WebElement e : wishList.tableNames){
            if (e.getText().equals(rndUrunAd)) {
                bulundu = true;
                break;
            }
        }

        System.out.println("bulundu = " + bulundu);
        Assert.assertTrue(bulundu);


    }


}
