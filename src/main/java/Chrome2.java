import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Work\\chromedriver86.exe");
        WebDriver driver = new ChromeDriver();

        //hit url in the browser
        driver.get("http://zapisanisobie.pl");
        //input login
        driver.findElement(By.id("logid")).sendKeys("michkoper@onet.pl");
        //input password
        driver.findElement(By.name("haslo")).sendKeys("Marik1234");
        //click forgot password
//        driver.findElement(By.linkText("Przypomnienie hasła")).click();
        driver.findElement(By.className("klawisz44")).click();


    }
}
