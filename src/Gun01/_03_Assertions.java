package Gun01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Assertions {
    // Yeşil tik : Testde hata yok
    // Sarı carpı: Testde hata var
    // Beyaz     : Test çalıştırılmadı,skip
    @Test
    void EqualÖrnek() {
        String s1 = "Merhaba";
        String s2 = "İyi Aksamlar";

        // Oluşan , beklenen, "Hata BAşlığı"
        Assert.assertEquals(s1, s2, " Karşılaştirma sonucu");
        // Actual: oluşan
        // Expected: beklenen
    }
    @Test
    void NotEqualÖrnek() {
        String s1 = "Merhaba";
        String s2 = "İyi Aksamlar";

        // Oluşan , beklenen, "Hata BAşlığı"
        Assert.assertNotEquals(s1, s2, " Karşılaştirma sonucu");
        // Actual: oluşan
        // Expected: beklenen
    }
    @Test
    void TrueÖrnek() {
        int s1 = 55;
        int s2 = 555;
        // Oluşan , beklenen, "Hata BAşlığı"
        Assert.assertTrue(s1 == s2, " Karşılaştirma sonucu ");

    }
     @Test
    void NullÖrnek() {
        String s1=null;
        // Oluşan , beklenen, "Hata BAşlığı"
        Assert.assertNull(s1, "Karşılaştirma sonucu ");

    }
    @Test
    void failÖrnek(){
        int a=55;
        if (a==55)
        Assert.fail();

    }


}
