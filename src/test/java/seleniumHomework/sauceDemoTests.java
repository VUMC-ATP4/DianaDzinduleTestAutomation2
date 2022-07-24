package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sauceDemoTests {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        System.out.println("Sāku testu!");
    }

    @Test
    public void Test1() throws InterruptedException {

        WebElement userNameInputField = driver.findElement(By.id("user-name"));
        userNameInputField.sendKeys("standard_user");
        WebElement passwordInputField = driver.findElement(By.id("password"));
        passwordInputField.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.className("submit-button"));
        loginButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
        WebElement chooseAddToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        chooseAddToCart.click();
        WebElement shoppingCartContainer = driver.findElement(By.id("shopping_cart_container"));
        shoppingCartContainer.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/cart.html");
        WebElement myProduct = driver.findElement(By.id("item_4_title_link"));
        WebElement checkout = driver.findElement(By.name("checkout"));
        checkout.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/checkout-step-one.html");
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Diana");
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Dzindule");
        WebElement postalCode = driver.findElement(By.id("postal-code"));
        postalCode.sendKeys("LV-2015");
        WebElement approveMyData = driver.findElement(By.id("continue"));
        approveMyData.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/checkout-step-two.html");
        WebElement product = driver.findElement(By.id("item_4_title_link"));
        WebElement finishMyOrder = driver.findElement(By.id("finish"));
        finishMyOrder.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/checkout-complete.html");
        WebElement backHome = driver.findElement(By.id("back-to-products"));
        backHome.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
    }

    @Test
    public void Test2errorMessageMyInformationEmpty(){
        WebElement userNameInputField = driver.findElement(By.id("user-name"));
        userNameInputField.sendKeys("standard_user");
        WebElement passwordInputField = driver.findElement(By.id("password"));
        passwordInputField.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.className("submit-button"));
        loginButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
        WebElement shoppingCartContainer = driver.findElement(By.id("shopping_cart_container"));
        shoppingCartContainer.click();
        WebElement checkout = driver.findElement(By.name("checkout"));
        checkout.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/checkout-step-one.html");
        WebElement approveMyData = driver.findElement(By.id("continue"));
        approveMyData.click();
        WebElement errorText = driver.findElement(By.cssSelector("h3[data-test='error']"));
        Assert.assertEquals(errorText.getText(),"Error: First Name is required");
    }

    @Test
    public void Test2errorMessageFirstNameEmpty(){
        WebElement userNameInputField = driver.findElement(By.id("user-name"));
        userNameInputField.sendKeys("standard_user");
        WebElement passwordInputField = driver.findElement(By.id("password"));
        passwordInputField.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.className("submit-button"));
        loginButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
        WebElement shoppingCartContainer = driver.findElement(By.id("shopping_cart_container"));
        shoppingCartContainer.click();
        WebElement checkout = driver.findElement(By.name("checkout"));
        checkout.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/checkout-step-one.html");
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("");
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Dzindule");
        WebElement postalCode = driver.findElement(By.id("postal-code"));
        postalCode.sendKeys("LV-2015");
        WebElement approveMyData = driver.findElement(By.id("continue"));
        approveMyData.click();
        WebElement errorText = driver.findElement(By.cssSelector("h3[data-test='error']"));
        Assert.assertEquals(errorText.getText(),"Kļūda! Obligāti nepieciešams ievadīt vārdu!");
    }

    @Test
    public void Test2errorMessageLastNameEmpty(){
        WebElement userNameInputField = driver.findElement(By.id("user-name"));
        userNameInputField.sendKeys("standard_user");
        WebElement passwordInputField = driver.findElement(By.id("password"));
        passwordInputField.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.className("submit-button"));
        loginButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
        WebElement shoppingCartContainer = driver.findElement(By.id("shopping_cart_container"));
        shoppingCartContainer.click();
        WebElement checkout = driver.findElement(By.name("checkout"));
        checkout.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/checkout-step-one.html");
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Diana");
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("");
        WebElement postalCode = driver.findElement(By.id("postal-code"));
        postalCode.sendKeys("LV-2015");
        WebElement approveMyData = driver.findElement(By.id("continue"));
        approveMyData.click();
        WebElement errorText = driver.findElement(By.cssSelector("h3[data-test='error']"));
        Assert.assertEquals(errorText.getText(),"Kļūda! Obligāti nepieciešams ievadīt uzvārdu!");
    }

    @Test
    public void Test2errorMessagePostalCodeEmpty(){
        WebElement userNameInputField = driver.findElement(By.id("user-name"));
        userNameInputField.sendKeys("standard_user");
        WebElement passwordInputField = driver.findElement(By.id("password"));
        passwordInputField.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.className("submit-button"));
        loginButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
        WebElement shoppingCartContainer = driver.findElement(By.id("shopping_cart_container"));
        shoppingCartContainer.click();
        WebElement checkout = driver.findElement(By.name("checkout"));
        checkout.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/checkout-step-one.html");
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Diana");
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Dzindule");
        WebElement postalCode = driver.findElement(By.id("postal-code"));
        postalCode.sendKeys("");
        WebElement approveMyData = driver.findElement(By.id("continue"));
        approveMyData.click();
        WebElement errorText = driver.findElement(By.cssSelector("h3[data-test='error']"));
        Assert.assertEquals(errorText.getText(),"Kļūda! Obligāti nepieciešams ievadīt pasta indeksu!");
    }

    @AfterMethod
    public void closeBrowser(){driver.quit();
        System.out.println("Beidzu testu!");
    }
}
