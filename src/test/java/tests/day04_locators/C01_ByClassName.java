package tests.day04_locators;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_ByClassName {

    public static void main(String[] args) throws InterruptedException {




        // 1- Bir test class’i olusturun ilgili ayarlari yapin

        // System.setProperty ( "Webdriver.chrome.driver", "kurulumDosyalari/chromedriver" );

        WebDriver driver= new ChromeDriver ();
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( Duration.ofSeconds ( 10 ) );


        // - https://www.testotomasyonu.com/ adresine gidin

        driver.get ( "https://www.testotomasyonu.com/" );

        // 3- arama kutusuna phone yazip aratin

        WebElement aramakutusu = driver.findElement ( By.id ( "global-search" ) );

        aramakutusu.sendKeys ( "phone" + Keys.ENTER );

        // - Category bolumunde 8 element oldugunu test edin

        List<WebElement> catagoryElementleriList = driver.findElements ( By.className ( "panel-list" ) );

        // - Category isimlerini yazdirin

        //System.out.println ( catagoryElementleriList );

        // - Sayfayi kapatin

        Thread.sleep ( 3000 );
        driver.quit ();















    }


}
