package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstClass {

	public static void main(String[] args) throws InterruptedException {

		// Create a new instance of the Firefox driver
		//String exePath = "D:\\projects\\aut-example\\chromedriver.exe";
		String exePath = "/home/llll/projects/hello-selenium/geckodriver";
		System.setProperty("webdriver.gecko.driver", exePath);
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();

        //Launch the Online Store Website
		driver.get("http://www.store.demoqa.com");

        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");
        Thread.sleep(10000);

        driver.findElement(By.cssSelector("a[href='http://store.demoqa.com/products-page/checkout/']")).click();
        System.out.println(driver.findElement(By.cssSelector("a[href='http://store.demoqa.com/products-page/checkout/']")));

		//Wait for 5 Sec
        Thread.sleep(10000);



        // Close the driver
        driver.quit();
    }

}
