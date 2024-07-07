package tests.day04_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_WebElementMethodlari {

    public static void main(String[] args) {

       //  System.setProperty ( "Webdriver.driver.chrome","kurulumDosyalri.chrome" );

        WebDriver driver =new ChromeDriver ();
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( Duration.ofSeconds ( 10 ) );


        driver.get ( "https:www.testotomasyonu.com" );
        WebElement aramaKutusu = driver.findElement ( By.id ( "global-search" ) );








    }
}
