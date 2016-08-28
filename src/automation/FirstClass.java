package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstClass {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		// Create a new instance of the Firefox driver
		// String exePath = "D:\\projects\\aut-example\\chromedriver.exe";
		String exePath = "/home/llll/projects/hello-selenium/geckodriver";
		System.setProperty("webdriver.gecko.driver", exePath);
		// WebDriver driver = new ChromeDriver();
		driver = new FirefoxDriver();

		driver.get("http://localhost:8081");

		// Wait for 5 Sec
		Thread.sleep(3000);
		login();
		Thread.sleep(3000);
		testCompanyShow();
		Thread.sleep(3000);
		testCompanyEdit();
		Thread.sleep(3000);		
		driver.quit();
	}
	
	public static void login() throws InterruptedException {
		System.out.println("Successfully opened the website www.Store.Demoqa.com");
		Thread.sleep(5000);
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.id("submitLogin")).click();;		

	}
	
	public static void testCompanyShow() {
		driver.findElement(By.id("company")).click();
	}

	public static void testCompanyEdit() throws InterruptedException {
		driver.findElement(By.id("company_update")).click();
		driver.findElement(By.id("companyName")).sendKeys("Dyamsoft");
		driver.findElement(By.id("president")).sendKeys("Juan Salinas");
		driver.findElement(By.id("description")).sendKeys("Dyamsoft is a sofwtare development company");
		Thread.sleep(2000);
		driver.findElement(By.id("updateSubmit")).click();;
	}
}
