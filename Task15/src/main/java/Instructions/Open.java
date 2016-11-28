package Instructions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.Timeouts;

/**
 * Class which is a part of all instructions.
 * This class provides command to open web-site with 2 arguments:
 * The first is "url" - an argument with full path of website including 'http://'
 * The second is "timeout" - time in which side has to be opened in milliseconds
 *
 * @author Alexey Gudinsky
 */
public class Open {

    /**
     * argument 'url' gets from commandline or from file
     */
    String url = "";
    /**
     * argument timeout will multiply input value in seconds to 1000
     * int timeout = argument*1000; something like that
     */
    int timeout = 0;
    int realtime = 0;

    /**
     * Method which opens open web-site with 2 arguments
     */
    public void open() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "./chromedriver.app");
        WebDriver.Timeouts pageLoadTimeout;
        driver.get(url);

    }

}
