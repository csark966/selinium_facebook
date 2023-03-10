package selinium1;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTest {
	  public static void main(String[] args) {
	        // Setting system property for Chrome driver
           
	        // Creating WebDriver instance for Chrome browser
            WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        
	        // Navigating to Facebook login page
	        driver.get("https://www.facebook.com/login/");
	        
	        // Locating email input element by its name attribute and sending user email
	        WebElement email = driver.findElement(By.name("email"));
	        email.sendKeys("jatel28017@orydns.com");
	        
	        // Locating password input element by its name attribute and sending user password
	        WebElement password = driver.findElement(By.name("pass"));
	        password.sendKeys("28017jatel");
	        
	        // Locating login button by its name attribute and clicking on it
	        WebElement loginButton = driver.findElement(By.name("login"));
	        loginButton.click();
	        
	        // Wait for the page to load
	        driver.manage().window().maximize();
	        
	        // Verify that user is logged in by checking the page title
	        if (driver.getTitle().equals("Facebook")) {
	            System.out.println("User logged in successfully!");
	        } else {
	            System.out.println("Login failed!");
	        }
	        
	        // Close the browser
//	        driver.quit();
	    }
}
