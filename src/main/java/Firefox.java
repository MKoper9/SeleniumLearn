import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
    public static void main(String[] args) {
        //Create Driver object for firefox browser

        System.setProperty("webdriver.gecko.driver","C:\\Work\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://google.com");

        //show page name
        System.out.println(driver.getTitle());
    }
}
