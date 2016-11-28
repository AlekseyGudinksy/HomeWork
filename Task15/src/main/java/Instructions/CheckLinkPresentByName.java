package Instructions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Class which is a part of all instructions.
 * This class provides command to check if link's name exist with one argument
 * "link name" is an argument which display name of link-word
 * including in teg <a href="url"> link-word </a>
 *
 * @author Alexey Gudinsky
 */
public class CheckLinkPresentByName {
    /**
     * Method which check if link's name exist with one argument
     * "link name" is an argument which display name of link-word
     * including in teg <a href="url"> link-word </a>
     *
     */
    public void linkPresentByName() {
    }

    public boolean checkLinkByName(String s, WebDriver driver) {
//        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "./chromedriver.app");
        try {
            driver.findElement(By.linkText(s));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}