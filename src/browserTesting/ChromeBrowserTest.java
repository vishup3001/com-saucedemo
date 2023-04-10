package browserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        //1.Launch The Chrome Browser
        WebDriver driver = new ChromeDriver();
        //2.open the url into browser
        driver.get(baseUrl);
        //3.Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //4.print the current url
        System.out.println("https://www.saucedemo.com/");
        //5.Print the page source
        System.out.println("Page source :" +driver.getPageSource());
        //6.Enter email to email field
       WebElement emailfield = driver.findElement(By.id("user-name"));
        emailfield.sendKeys("vish123@gmail.com");
        //7.Enter password to password field
        driver.findElement(By.name("password")).sendKeys("1234");
        //8.close the browser
        driver.close();


    }
}
