package tests.day02_webDriverMethodlari_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Locators {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty ( "Webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( Duration.ofSeconds ( 10 ) );


        driver.get ( "https://www.testotomasyonu.com" );

        WebElement aramaKutusu = driver.findElement ( By.id ( "global-search" ) );

        aramaKutusu.sendKeys ( "phone" );

        Thread.sleep (3000);

        aramaKutusu.submit ();

        driver.quit ();





    }
}
