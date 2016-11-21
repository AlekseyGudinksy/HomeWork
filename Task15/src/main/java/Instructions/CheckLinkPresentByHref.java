package Instructions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Class which is a part of all instructions.
 * This class provides command to check if link is full with one argument
 * "href" is an argument with full path to website
 * including in teg <a href="url">link-word</a>
 *
 * @author Alexey Gudinsky
 */
public class CheckLinkPresentByHref {
    /**
     * Method which check if link is full with one argument
     * "href" is an argument with full path to website
     * including in teg <a href="url">link-word</a>
     */
    public void linkPresentByHref() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "./chromedriver.app");
    }
}
