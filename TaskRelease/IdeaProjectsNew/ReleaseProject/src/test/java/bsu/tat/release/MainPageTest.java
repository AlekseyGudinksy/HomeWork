package bsu.tat.release;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Some tests on basic elements of page
 *
 * @author Alexey Gudinsky
 */
public class MainPageTest {
    @Test
    public void seleniumTest() {
        String url = "http://localhost:8888";
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement serchField = driver.findElement(By.className("site-title"));
        Assert.assertTrue(serchField.getText().contains("webpage_example"));
        driver.close();
    }

    @Test
    public void HelloWorldTest() {
        String url = "http://localhost:8888";
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement serchField = driver.findElement(By.className("entry-title"));
        Assert.assertTrue(serchField.getText().contains("Hello world!"));
        driver.close();

    }

    @Test
    public void PostContentTest() {
        String url = "http://localhost:8888";
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement serchField = driver.findElement(By.className("entry-content"));
        Assert.assertTrue(serchField.getText().contains("Welcome to WordPress. This is your first post. Edit or delete it, then start writing!"));
        driver.close();
    }

    @Test
    public void SiteDescription() {
        String url = "http://localhost:8888";
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement serchField = driver.findElement(By.className("site-description"));
        Assert.assertTrue(serchField.getText().contains("Just another WordPress site"));
        driver.close();
    }
}
