package Instructions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Class which is a part of all instructions.
 * This class provides check if page has an equal title with one argument
 * "text" is an argument which displays the title of web-page
 *
 * @author Alexey Gudinsky
 */

public class CheckPageTitle {
    /**
     * Methid which check if page has an equal title with one argument
     * "text" is an argument which displays the title of web-page
     */
   public void pageTitle() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "./chromedriver.app");
    }
}
