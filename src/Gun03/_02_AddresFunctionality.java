package Gun03;

import Utilis.GenelWebDriver;
import Utilis.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class _02_AddresFunctionality extends GenelWebDriver {
    /*
       Senaryo;
       1- Siteyi açınız.
       2- Adress Ekleyiniz.
       3- En son eklenen adresi edit yaparak ad ve soyadı değiştirip kaydediniz.
       4- En son eklenen adresi siliniz.

    */
    @Test
    void addresFunctionality() {
        WebElement addressBook = driver.findElement(By.xpath("(//*[text()='Address Book'])[1]"));
        addressBook.click();

        WebElement newAddres = driver.findElement(By.xpath("(//*[text()='New Address'])[1]"));
        newAddres.click();

        WebElement firstName = driver.findElement(By.xpath("//*[@name='firstname']"));
        firstName.sendKeys("Kayhan");

        WebElement lastName = driver.findElement(By.xpath("//*[@name='lastname']"));
        lastName.sendKeys("Özer");

        WebElement company = driver.findElement(By.xpath("//*[@name='company']"));
        company.sendKeys("SpaceX");

        WebElement address1 = driver.findElement(By.xpath("//*[@name='address_1']"));
        address1.sendKeys("Ulubatlı mh");

        WebElement address2 = driver.findElement(By.xpath("//*[@name='address_2']"));
        address2.sendKeys("Kınık mh");

        WebElement city = driver.findElement(By.xpath("//*[@name='city']"));
        city.sendKeys("İZMİR");

        WebElement postcode = driver.findElement(By.xpath("//*[@name='postcode']"));
        postcode.sendKeys("123466");

        WebElement country = driver.findElement(By.xpath("//*[@name='country_id']"));
        Select ulke = new Select(country);
        ulke.selectByIndex(11);

        //wait.until(ExpectedConditions.elementToBeClickable(country));
        wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.cssSelector("select[id='input-zone']>option"))));
        //bu elemanın bayatlamış hali gidene kadar bekle

        WebElement RegionState = driver.findElement(By.xpath("//*[@name='zone_id']"));
        Select regionstate = new Select(RegionState);
        regionstate.selectByIndex(1);


        WebElement defaultAddress = driver.findElement(By.xpath("(//*[@name='default'])[1]"));
        defaultAddress.click();

        WebElement Continue = driver.findElement(By.xpath("//*[@value='Continue']"));
        Continue.click();

        Tools.succesMessageValidation();

    }
    @Test (dependsOnMethods = {"addresFunctionality"})
    void adSoyadDeğişim(){
        WebElement addressBook=driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        List<WebElement>editAll=driver.findElements(By.linkText("Edit"));
        WebElement sonEdit=editAll.get(editAll.size()-1);// sonuncu edit
        System.out.println(editAll.size());
        sonEdit.click();


        WebElement firstNameNew = driver.findElement(By.xpath("//*[@name='firstname']"));
        firstNameNew.clear();
        firstNameNew.sendKeys("Hüseyin");

        WebElement lastNameNew = driver.findElement(By.xpath("//*[@name='lastname']"));
        lastNameNew.clear();
        lastNameNew.sendKeys("Seker");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@name='default'])[1]")));
        WebElement defaultAddress = driver.findElement(By.xpath("(//*[@name='default'])[1]"));
        defaultAddress.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@value='Continue']")));
        WebElement Continue2 = driver.findElement(By.xpath("//*[@value='Continue']"));
        Continue2.click();



        Tools.succesMessageValidation();

    }
        @Test(dependsOnMethods = {"addresFunctionality","adSoyadDeğişim"})
        void addressDelete() {
            WebElement addressBook=driver.findElement(By.linkText("Address Book"));
            addressBook.click();

            List<WebElement>deleteAll=driver.findElements(By.linkText("Delete"));// Delete buttonunun listesi
            WebElement sonDelete=deleteAll.get(deleteAll.size()-2);// sonuncu edit
            System.out.println(deleteAll.size());
            sonDelete.click();

            Tools.succesMessageValidation();
        }


     /*
       WebElement country=driver.findElement(By.id("input-country"));
       Select countryS=new Select(country);
       countryS.selectByIndex(10);
       WebElement State=driver.findElement(By.id("input-zone"));
       Select state=new Select(State);
       System.out.println("state.getOptions().size() 1 = " + state.getOptions().size());
       wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("[id='input-zone']>option"),
                   state.getOptions().size()));
       // option ların sayısı ilk halinden küçük olana kadar bekle : yeni durum gelene kadar bekle
       System.out.println("state.getOptions().size() 2 = " + state.getOptions().size());
       State=driver.findElement(By.id("input-zone"));
       state=new Select(State);
//       System.out.println("state.getOptions().size() = " + state.getOptions().size());
//       for(WebElement e: state.getOptions())
//           System.out.println(e.getText());
       state.selectByIndex(3);
       */



}
