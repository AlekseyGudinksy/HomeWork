package bsu.tat.release;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Test for logging out user
 *
 * @author Alexey Gudinsky
 */
public class LogOutTest {
    @Test
    public void UserLogOutTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8888/wp-login.php?action=logout&_wpnonce=ac0fd92c45");
        driver.findElement(By.linkText("log out")).click();
        WebElement serchField = driver.findElement(By.className("message"));
        Assert.assertTrue(serchField.getText().contains("You are now logged out."));
        driver.close();
    }


}
