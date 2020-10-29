import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Edge {

    public static void main(String[] args) {


        System.setProperty("webdriver.edge.driver", "C:\\Work\\msedgedriver86.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("http://www.interia.pl");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());


    }
}
