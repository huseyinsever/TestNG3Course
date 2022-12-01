package Gun03;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Dependency {
    /*
   interviewlarda sorulan bir konu : testlere öncelikleri nasıl verirsin ?
   priority, dependecy;   Nasıl kullanırsın ?
   1- priority =1 gibi sıralı rakamlar vererek bununla çalışma sırasını belirtirim.
   2- dependOnMethods : bununla kendinden önce hangi metod çalışması gerekiyor ise onu belirtirim.
      Bir metodu direkt çalıştırdığınızda kendinden önce bağımlı 1  metod var ise ototmatik onları
      önce çağırıp sonra kendisi çalışır. Fakat 2 veya daha fazla tane var ise bağımlı olduğu metod o zaman çalışamaz.
 */
    @Test
    void startCar(){

        System.out.println("Car Started");
    }
    @Test(dependsOnMethods ={"startCar"}) // Bu testin calışması startCar ın hatasız çalışmasına bağımlı
    void driveCar(){

        System.out.println("Car Driver");
        Assert.fail();// buraya SKIP durumunu görebilmek için koyduk faili.
    }

    @Test(dependsOnMethods = {"startCar","driveCar"})// Bu testin çalışması için verilen 2 testin hatasız bitmesi lazım
    void parkCar(){

        System.out.println("Car Parked");

    }
    @Test (dependsOnMethods = {"parkCar"},alwaysRun = true)// AlwaysRun = True bağımlılıkları var ama hata çıkarsa
    void stopCar(){                                        // da çalıştır.

        System.out.println("Car Stop");

    }

}
