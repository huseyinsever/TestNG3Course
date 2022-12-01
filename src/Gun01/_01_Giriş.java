package Gun01;

import org.testng.annotations.Test;

public class _01_Giriş {
    // Eğer test metodlarına sıralama verilmezse alfabetik sırasına göre çalışır.
    @Test(priority = 1) // Annotationlar (Priority: Öncelik sırası demek)
    void webSitesiAc(){
        System.out.println("Driver tanimlandi ve web sitesi açildi");
    }
    @Test(priority = 2) // Annotationlar
    void loginTestİşlemiYap(){
        System.out.println("Login test işlemi yapildi");
        // Yeşil Tik hatalı assertion yok demektir.
    }
    @Test(priority = 3) // Annotationlar
    void driverKapat(){
        System.out.println("Driver kapatildi ve çikildi");
    }




}
