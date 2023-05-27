package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        //java uygulamalarında system ozelliklerini ayarlamak için setProperty methodu ile kullanırız.
        //setProperty methodu ile class ımıza driver ın fiziki yolunu belirtiriz
        System.out.println(System.getProperty("webdriver.chrome.driver"));
        //getProperty ile "key" degerini girere "value"' ya ulaşabiliriz.

        WebDriver driver = new ChromeDriver();//ChromeDriver turunde yeni bir obje oluşturduk

        driver.get("https://www.techproeducation.com"); // get() methodu ileString olarak girilen URL e gider


    }
}
