package tests.day04_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_ByLinkText {
    public static void main(String[] args) throws InterruptedException {

        //  1- Bir test class’i olusturun ilgili ayarlari yapin

        //System.setProperty ( "Webdriver.chrome.driver","kurulumDosyalari.chromedriver" );


        WebDriver driver = new ChromeDriver ();
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( Duration.ofSeconds ( 10 ) );


        // 2- https://www.automationexercise.com/ adresine gidin

        driver.get ( "https://www.automationexercise.com/ " );


        Thread.sleep ( 1000 );
        // cookies kabul edin

       List<WebElement> cookiesKabulListe = driver.findElements ( By.className ( "fc-button-label" ) );
       cookiesKabulListe.get ( 0 ).click ();
       Thread.sleep ( 2000 );


        //  3- Sayfada 147 adet link bulundugunu test edin.

        List<WebElement> linkElemntleriList = driver.findElements ( By.tagName ( "a" ) );

        System.out.println ( linkElemntleriList.size () );


        //  Products linkine tiklayin



        //  special offer yazisinin gorundugunu test edin


        //  Sayfayi kapatin

        Thread.sleep ( 3000 );
        driver.quit ();

        //  automationexercise.com


        //  Automation Exercise


        //  This is for automation practice
















    }

}
