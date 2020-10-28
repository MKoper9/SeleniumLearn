import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

    public static void main(String[] args) {

        //Create Driver object for chrome browser

        System.setProperty("webdriver.chrome.driver","C:\\Work\\chromedriver86.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com");

    }
}
