package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C12_Odev3 {
    public static void main(String[] args) throws InterruptedException {
//1. Yeni bir Class olusturalim.C06_ManageWindow
        System.setProperty("Webdriver.Chrom.driver","src/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
//3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
//4. Sayfayi simge durumuna getirin
        driver.manage().window().minimize();
//5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();
//6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());
// 7. Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();
//8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
// 9. Sayfayi kapatin
        driver.close();
    }
}
