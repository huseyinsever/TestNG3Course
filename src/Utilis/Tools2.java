package Utilis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Tools2 extends GenelWebDriver{

    @Test
    public void validation(){
        List<String>expected=new ArrayList<>();
        expected.add("Moda");
        expected.add("Elektronik");
        expected.add("Ev & Yaşam");
        expected.add("Anne & Bebek");
        expected.add("Kozmetik & Kişisel Bakım");
        expected.add("Mücevher & Saat");
        expected.add("Spor & Outdoor");
        expected.add("Kitap, Müzik, Film, Oyun");
        expected.add("Otomotiv & Motosiklet");

        List<WebElement>actualList=driver.findElements(By.cssSelector("li[class='catMenuItem']"));

        for (int i = 0; i < expected.size(); i++) {
            Assert.assertEquals(expected.get(i),actualList.get(i).getText());

        }

    }



}
