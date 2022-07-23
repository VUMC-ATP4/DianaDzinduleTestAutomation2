package mavenTestNGHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SeleniumOpenCloseWeb {

    WebDriver chromeBrowseris;

    @BeforeSuite
    public void pirmsTestaInfo() {
        System.out.println("\nUzdevums Nr. 2\nTiks veikti divi mājas lapu testi: Google un Delfi mājas lapām.");
    }

    @BeforeTest
    public void pirmsTestaPageOpen() {
        ChromeDriver chromeBrowseris = new ChromeDriver();
    }

    @BeforeMethod
    public void pirmsTestaTeksts() {
        System.out.println("Sākas tests!");
    }

    @AfterMethod
    public void pecTesta() {
        System.out.println("Beidzas tests!");
    }

    @Test
    public void myTestOne(){
        final String baseUrl = "https://www.google.lv/";
        ChromeDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        driver.quit();
    }

    @Test
    public void myTestTwo(){
        final String baseUrl = "https://www.delfi.lv/";
        ChromeDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        String expectedTitle = "DELFI - Vadošais ziņu portāls Latvijā - DELFI";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        driver.quit();
    }
}


