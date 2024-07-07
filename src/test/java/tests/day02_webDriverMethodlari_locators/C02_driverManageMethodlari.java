package tests.day02_webDriverMethodlari_locators;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.time.Duration;

public class C02_driverManageMethodlari {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver ();

        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( Duration.ofSeconds ( 10 ) );


        System.out.println ( "Maximize konum : "+driver.manage ().window ().getPosition () );
        System.out.println ( "Maxmize size : "+driver.manage ().window ().getSize () );

        Thread.sleep ( 4000 );

        driver.manage ().window ().fullscreen ();


        Thread.sleep ( 2000 );


        System.out.println ( "Full screen konum : "+driver.manage ().window ().getPosition () );
        System.out.println ( "Full screen size : "+driver.manage ().window ().getSize () );




        Thread.sleep ( 2000 );

        driver.manage ().window ().minimize ();


        System.out.println ( "Minimize konum : "+driver.manage ().window ().getPosition () );
        System.out.println ( "Minimize size : "+driver.manage ().window ().getSize () );





        driver.manage ().window ().setPosition ( new Point ( 300,300 ) );
        driver.manage ().window ().setSize ( new Dimension ( 500,500 ) );

        Thread.sleep ( 5000 );

        System.out.println ( "Ozel olcu icin konum : "+driver.manage ().window ().getPosition () );
        System.out.println ( "Ozel olcu icin size : "+driver.manage ().window ().getSize () );

        Thread.sleep ( 4000 );
        driver.quit ();








    }
}
