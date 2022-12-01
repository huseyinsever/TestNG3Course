package Gun07;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _01_SoftAssertvsHardAssert {

    @Test
    void hardAssert(){
        String s1="Merhaba";
        System.out.println("Hard assert öncesi");
        Assert.assertEquals("Merhaba 123",s1,"HardAssert Sonucu");

    }
    @Test
    void softAssert(){
        String strHomePage="www.facebook.com/homepage";
        String strCartPage="www.facebook.com/cartpage";
        String strEditAccount="www.facebook.com/editaccount";

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals("www.facebook.com/homepage",strHomePage);
        System.out.println("assert 1");

        softAssert.assertEquals("www.facebook.com/profile",strCartPage);
        System.out.println("assert 2");

        softAssert.assertEquals("www.facebook.com/settings",strEditAccount);
        System.out.println("assert 3");

        softAssert.assertAll(); // Bütün assert sonuçlarını işleme koyuyor
        System.out.println("Aktiflik sonrasi"); // Bu bölüm assertAll dan sonra olduğu ve öncesinde hata oluştuğu için
                                                // yazılmadı.


    }

}
