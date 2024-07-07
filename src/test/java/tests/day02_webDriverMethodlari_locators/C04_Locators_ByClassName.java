package tests.day02_webDriverMethodlari_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Locators_ByClassName {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty ( "Webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( Duration.ofSeconds ( 10 ) );



        driver.get ( "https://www.testotomasyonu.com" );


        WebElement aramaKutusu = driver.findElement ( By.id ("global-search") );

        aramaKutusu.sendKeys ( "dres" + Keys.ENTER );

        // aramaKutusu.submit ();


        WebElement sonucYaziElementi = driver.findElement ( By.className ( "product-count-text" ));

        System.out.println ( sonucYaziElementi );


        String actualSonucYazisi = sonucYaziElementi.getText ();

        actualSonucYazisi = actualSonucYazisi.replaceAll ( "\\D", "" );

        int bulunanSonucSayisi = Integer.parseInt ( actualSonucYazisi );

        if(bulunanSonucSayisi>3){
            System.out.println ("dress arama testi PASSED");
        }else System.out.println ("dress arama testi FAILED");





        Thread.sleep ( 3000 );


        driver.quit ();










    }

}
