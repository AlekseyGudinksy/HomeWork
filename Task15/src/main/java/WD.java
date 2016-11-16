import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Consist WebDrivers for different browsers
 *
 * @author Aleksey Gudinsky
 */
public class WD {
    /**
     * Method which checks web-site's
     */
    void checkWeb() {
//        WebDriver wdFox = new FirefoxDriver();
//        WebDriver wdSafari = new SafariDriver();
        WebDriver driver = new ChromeDriver();
//        WebDriver wdOpera = new OperaDriver();
//         System.setProperty("webdriver.chrome.driver","/Applications/ChromeDriver.app");
        driver.get("https:/www.google.com/");
    }

}
