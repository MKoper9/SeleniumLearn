import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

    public static void main(String[] args) {

        //Create Driver object for chrome browser

        System.setProperty("webdriver.chrome.driver","C:\\Work\\chromedriver86.exe");
        WebDriver driver = new ChromeDriver();

        //hit url in the browser
        driver.get("http://google.com");

        //show page name
        System.out.println(driver.getTitle());

        // validate you are in current url
        System.out.println(driver.getCurrentUrl());

//        System.out.println(driver.getPageSource()); //print pages

        //go to yahoo
        driver.get("http://yahoo.com");
        //return to google
        driver.navigate().back();
        //close current browser
        driver.close();
        //close all the browsers qopened by selenium script
//        driver.quit();
    }
}
