package Gun02;

import Utilis.GenelWebDriver;
import Utilis.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class _01_ValidateMenu extends GenelWebDriver {

    /*
       Senaryo;
       1- Siteyi açınız
       2- Top Menudeki menu elemanlarının olduğunu doğrulayınız.
    */
    @Test
    void menuValidation() {
        List<String> menuExpectedList = new ArrayList<>();
        menuExpectedList.add("Desktops");
        menuExpectedList.add("Laptops & Notebooks");
        menuExpectedList.add("Components");
        menuExpectedList.add("Tablets");
        menuExpectedList.add("Software");
        menuExpectedList.add("Phones & PDAs");
        menuExpectedList.add("Cameras");
        menuExpectedList.add("MP3 Players");

        By menuFinder = By.cssSelector("[class='nav navbar-nav']>li");
        List<WebElement> menuActualList = driver.findElements(menuFinder);

        Tools.compareToList(menuExpectedList,menuActualList);

    }

}




