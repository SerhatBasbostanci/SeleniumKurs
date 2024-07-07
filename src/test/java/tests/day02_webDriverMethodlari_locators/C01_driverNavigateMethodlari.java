package tests.day02_webDriverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driverNavigateMethodlari {

    public static void main(String[] args) throws InterruptedException {

        //System.setProperty ( "Webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");

        WebDriver driver = new ChromeDriver ();

        driver.get ( "https://www.testotomasyonu.com");


        String expectedUrlIcerik = "testotomasyonu";
        String actualUrl = driver.getCurrentUrl ();


        if (actualUrl.contains ( expectedUrlIcerik )){
            System.out.println ("Testotomasyonu url testi PASSED");
        }else System.out.println ("Test otomasyonu url testi FAILED");
        Thread.sleep ( 2000 );
        driver.navigate ().to ( "https://www.youtube.com" );

        expectedUrlIcerik = "youtube";
        actualUrl = driver.getCurrentUrl ();


        if(actualUrl.contains ( expectedUrlIcerik )){
            System.out.println ("Youtube url testi PASSED");

        }else System.out.println ("Youtube url testi FAILED");
        Thread.sleep ( 2000 );

        driver.navigate ().back ();

        String expectedTitleIcerik = "Test Otomasyonu";
        String actualTitle = driver.getTitle ();

        if(actualTitle.contains ( expectedTitleIcerik )){
            System.out.println ("Test otomasyonu title testi PASSED");
        }else System.out.println ("Test otomasyonu title testi FAILED");
        Thread.sleep ( 2000 );
        driver.navigate ().forward ();


        expectedTitleIcerik = "YouTube";
        actualTitle=driver.getTitle ();

        if(actualTitle.contains ( expectedTitleIcerik )){
            System.out.println ("Youtube title icerik testi PASSED");
        }else System.out.println ("Youtube title icerik testi FAILED");



        Thread.sleep ( 2000 );
        driver.quit ();











    }


}
