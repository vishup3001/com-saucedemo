package browserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser = "Edge";
    static String baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong Browser Name");
        }
        // 1.open url into browser
        driver.get(baseUrl);
        // 2.print the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //3.print the current url
        System.out.println("https://www.saucedemo.com/");
        //4. print the page source
        System.out.println("Page source :" +driver.getPageSource());
        //5.enter email to email field
        driver.findElement(By.id("user-name")).sendKeys("vish123@gmail.com");
        //6.Enter password to password field
        driver.findElement(By.id("password")).sendKeys("456789");
        //7.close the browser
        driver.close();

    }
}
