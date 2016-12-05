package bsu.tat.release;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Test for logging in admin user
 *
 * @author Alexey Gudinsky
 */
public class LogInTest {
    @Test
    public void UserLogInTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8888/wp-login.php?loggedout=true");
        WebElement serchField = driver.findElement(By.id("user_login"));
        serchField.sendKeys("admin");
        serchField = driver.findElement(By.id("user_pass"));
        serchField.sendKeys("admin");
        serchField = driver.findElement(By.id("wp-submit"));
        serchField.submit();
        WebElement searchClassAbItem = driver.findElement(By.xpath(".//*[@id='wp-admin-bar-my-account']/a"));
        Assert.assertTrue(searchClassAbItem.getText().contains("Howdy, admin"));

    }
}
