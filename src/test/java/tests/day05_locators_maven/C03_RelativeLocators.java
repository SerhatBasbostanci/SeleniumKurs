package tests.day05_locators_maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_RelativeLocators {


    public static void main(String[] args) {



        System.setProperty ( "Webdriver.chrome.driver","kurulumDosyalari/chromedriver" );

        WebDriver driver= new ChromeDriver ();
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( Duration.ofSeconds ( 10 ) );



        driver.get ( "https://testotomasyonu.com/relativeLocators ");





    }
}
