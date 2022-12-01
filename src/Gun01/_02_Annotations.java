package Gun01;

import org.testng.annotations.*;

public class _02_Annotations {
   /*
         @BeforeClass --> // Her class çalışıyorken önce burası çalışır
           @BeforeMetod --> // Her metoddan(test metod) önce çalışır
              @Test     -->  testlerin çalıştığı metodlar
              @Test     -->  testlerin çalıştığı metodlar
           @AfterMetod --> // Her metoddan(test metod) sonra çalışır
         @AfterClass --> // Her class çalışıyorken sonra burası çalışır
     */
    @BeforeClass
    void beforeClass(){
        System.out.println("Her classtan önce çalışacak : Before Class");
    }
    @BeforeMethod
    void beforeMetod(){
        System.out.println("Her test metod dan önce çalışacak : Before Metod");
    }
    @Test
    void Test1(){ System.out.println("Test 1 calıstı ");}
    @Test
    void Test2(){ System.out.println("Test 2 calıstı "); }

    @AfterMethod
    void afterMetod(){
        System.out.println("Her test metod dan sonra çalısacak : After Metod");
    }
    @AfterClass
    void afterClass(){
        System.out.println("Her classtan sonra çalışacak : After Class");
    }




}
