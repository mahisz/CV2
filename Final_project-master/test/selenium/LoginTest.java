package selenium;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends SdaBaseTest {

    @Test
    public void createLoginAutomationPageTest() {
        driver.get("http://automationpractice.com/");
        driver.findElement(By.xpath("//a[contains(@class,\"login\")]")).click();
        System.out.println(driver.getCurrentUrl());
        final WebElement inputEmail = driver.findElement(By.id("email_create"));
        System.out.println(driver.getCurrentUrl());
        inputEmail.sendKeys("xxx3@gmail.com");
        final WebElement createAccountButton = driver.findElement(By.id("SubmitCreate"));
        createAccountButton.click();
        String actualUrl="http://automationpractice.com/index.php?controller=authentication&back=my-account";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Test
    public void loginWithNonExistingUser() {
        driver.get("http://automationpractice.com/");
        driver.findElement(By.xpath("//a[contains(@class,\"login\")]")).click();
        final WebElement emailAddress = driver.findElement(By.id("email"));
        emailAddress.sendKeys("abd@op.pl");
        final WebElement accountPassword = driver.findElement(By.id("passwd"));
        accountPassword.sendKeys("abcabc");
        final WebElement logIn = driver.findElement(By.id("SubmitLogin"));
        logIn.click();
        final WebElement errorMessage = driver.findElement(By.xpath("//li[contains(text(), 'Authentication failed')]"));
        Assert.assertEquals(errorMessage.getText(), "Authentication failed.");
        
    }

}
