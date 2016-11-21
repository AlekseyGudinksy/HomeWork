package Instructions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Class which is a part of all instructions.
 * This class provides check if web-page has text with one argument
 * "text" is an argument which means that page has some text information
 * between teg <body> "text" </body>
 *
 * @author Alexey Gudinsky
 */
public class CheckPageContains {
    public void pageContains() {
        /**
         *
         */
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "./chromedriver.app");
    }
}
