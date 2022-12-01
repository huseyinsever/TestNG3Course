package Gun07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
// Bu sayfadaki bütün elemenalrın driverlar bağlantısı gerekiyor
// bunun için aşağıdaki consructor eklendi ve için PageFatory ile
// driver üzerinden bu (this) sayfadaki bütün elemnalar ilşkilendirildi.
// Böylece Sayfada dan nesne türetildiği zaman değil, kullanıldığı
// anda elemanların bulunması aktif oluyor.Bu yöntemle bütün sayfalarda
// aynı isimde elemanlar var ise buradaki tanımlama hepsi için geçerli hale
// gelmiş oluyor. buna yapıya Page Object Model (POM) adı veriliyor.
public class _03_PlaceOrderElements {
    public _03_PlaceOrderElements(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }

    @FindBy(css ="[name='search']")
    public WebElement search;

    @FindBy(xpath ="//*[@class='btn btn-default btn-lg']")
    public WebElement  searchButton;

    @FindBy(xpath ="(//*[text()='Add to Cart'])[1]")
    public  WebElement addToCart;

    @FindBy(xpath="//*[text()='Shopping Cart']")
    public WebElement shoppingCart;

    @FindBy(xpath = "(//*[text()='Checkout'])[2]")
    public  WebElement checkOut;

    @FindBy(css ="[value='Continue']")
    public WebElement Continue;

    @FindBy(css ="[id='button-shipping-address']")
    public WebElement Continue2;

    @FindBy(css= "[id='button-shipping-method']")
    public WebElement Continue3;

    @FindBy(css = "[type='checkbox']")
    public  WebElement checkBox;

    @FindBy(css= "[id='button-payment-method']")
    public WebElement Continue4;

    @FindBy(css = "[id='button-confirm']")
    public WebElement confirmClick;

    @FindBy(xpath ="(//*[text()='Your order has been placed!'])[2]")
    public WebElement h1yazıDgrlma;

//    @FindBy(xpath = "(//div[@class='button-group']/button)[1]")
//    public WebElement addToCart;
//
//    @FindBy(css ="i[class='fa fa-shopping-cart']")
//    public WebElement shoppingCart;



}
