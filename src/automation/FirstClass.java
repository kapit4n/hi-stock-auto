package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

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
		testMeasureCreate();
		Thread.sleep(3000);		
		testProductCreate();
		Thread.sleep(3000);		
		testProveedorCreate();
		Thread.sleep(3000);		
		testModuleCreate();
		Thread.sleep(3000);		
		testProductorCreate();
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
		Thread.sleep(2000);
		driver.findElement(By.id("companyName")).sendKeys("Dyamsoft");
		driver.findElement(By.id("president")).sendKeys("Juan Salinas");
		driver.findElement(By.id("description")).sendKeys("Dyamsoft is a sofwtare development company");
		Thread.sleep(2000);
		driver.findElement(By.id("updateSubmit")).click();;
	}

	public static void testMeasureCreate() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.id("measure"));
		action.moveToElement(we).moveToElement(driver.findElement(By.id("measure_add"))).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Measure Test");
		driver.findElement(By.id("quantity")).sendKeys("1");
		driver.findElement(By.id("description")).sendKeys("Measure Test");
		driver.findElement(By.id("measureParent")).sendKeys("16");
		Thread.sleep(2000);
		driver.findElement(By.id("addSubmit")).click();;
		System.out.println("Measure was created successsfully");
	}
	

	public static void testProductCreate() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.id("product"));
		action.moveToElement(we).moveToElement(driver.findElement(By.id("product_add"))).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Product Test");
		driver.findElement(By.id("cost")).sendKeys("10");
		driver.findElement(By.id("percent")).sendKeys("0.1");
		driver.findElement(By.id("measureId")).sendKeys("1");
		driver.findElement(By.id("currentAmount")).sendKeys("100");
		driver.findElement(By.id("description")).sendKeys("This a product test");
		driver.findElement(By.id("type")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.id("addSubmit")).click();;
		System.out.println("Product was created successsfully");
	}	

	public static void testProveedorCreate() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.id("proveedor"));
		action.moveToElement(we).moveToElement(driver.findElement(By.id("proveedor_add"))).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Proveedor Test");
		driver.findElement(By.id("phone")).sendKeys("60355282");
		driver.findElement(By.id("address")).sendKeys("Simon Rodrigues");
		driver.findElement(By.id("contact")).sendKeys("Juan Pablo");
		driver.findElement(By.id("accountValue")).sendKeys("555");
		Thread.sleep(2000);
		driver.findElement(By.id("addSubmit")).click();;
		System.out.println("Proveedor was created successsfully");
	}

	public static void testModuleCreate() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.id("module"));
		action.moveToElement(we).moveToElement(driver.findElement(By.id("module_add"))).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Module Test");
		driver.findElement(By.id("president")).sendKeys("Daniela Presidenta");
		driver.findElement(By.id("description")).sendKeys("Module description");
		driver.findElement(By.id("associationId")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.id("addSubmit")).click();;
		System.out.println("Module was created successsfully");
	}

	public static void testProductorCreate() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.id("productor"));
		action.moveToElement(we).moveToElement(driver.findElement(By.id("productor_add"))).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Productor Test");
		driver.findElement(By.id("ci")).sendKeys("5478745");
		driver.findElement(By.id("phone")).sendKeys("485697");
		driver.findElement(By.id("address")).sendKeys("Simon lopez 1212");
		driver.findElement(By.id("accountId")).sendKeys("1616");
		driver.findElement(By.id("moduleId")).sendKeys("1");
		driver.findElement(By.id("acopio")).sendKeys("45");
		driver.findElement(By.id("avg")).sendKeys("12");
		driver.findElement(By.id("excedent")).sendKeys("10");
		driver.findElement(By.id("pleno")).sendKeys("18");
		Thread.sleep(2000);
		driver.findElement(By.id("addSubmit")).click();;
		System.out.println("Productor was created successsfully");
	}
	
}
