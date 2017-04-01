package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FirstClass {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// Create a new instance of the Firefox driver
		//String exePath = "D:\\projects\\aut-example\\chromedriver.exe";
		//String exePath = "/home/larce/projects/hello-selenium/chromedriver";
		String exePath = "/home/larce/projects/hello-selenium/geckodriver";
		System.setProperty("webdriver.gecko.driver", exePath);
		//System.setProperty("webdriver.chrome.driver", exePath);
		//WebDriver driver = new ChromeDriver();
		driver = new FirefoxDriver();

		driver.get("http://localhost:8081");

		// Wait for 5 Sec
		Thread.sleep(3000);
		login();
		/*Thread.sleep(3000);
		testCompanyShow();
		Thread.sleep(3000);
		testCompanyEdit();
		Thread.sleep(3000);
		testMeasureCreate();
		Thread.sleep(3000);
		testProductCreate();
		Thread.sleep(3000);
		testVendorCreate();
		Thread.sleep(3000);
		testModuleCreate();
		Thread.sleep(3000);	
		testCustomerCreate();
		Thread.sleep(3000);
		testUserCreate();
		Thread.sleep(3000);
		testAccountCreate();
		Thread.sleep(3000);
		testTransaction1Create();
		Thread.sleep(3000);
		testTransaction2Create();*/
		Thread.sleep(3000);
		testInsumoRequestCreate();
		Thread.sleep(3000);
		/*testDiscountCreate();
		Thread.sleep(3000);*/
		//deleteRow("proveedor", "rows", "Vendor Test");

		driver.quit();
	}
	
	public static void login() throws InterruptedException {
		System.out.println("Successfully opened hi stock");
		Thread.sleep(10000);
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.id("submitLogin")).click();;		
	}
	
	public static void testCompanyShow() {
		driver.findElement(By.id("setting")).click();
	}

	public static void testCompanyEdit() throws InterruptedException {
		System.out.println("Editing Company");
		driver.get("http://localhost:8081/setting_update");
		Thread.sleep(5000);
		driver.findElement(By.id("settingName")).sendKeys("Dyamsoft");
		driver.findElement(By.id("president")).sendKeys("Juan Salinas");
		driver.findElement(By.id("description")).sendKeys("Dyamsoft is a software development company");
		Thread.sleep(2000);
		driver.findElement(By.id("updateSubmit")).click();
	}

	public static void testMeasureCreate() throws InterruptedException {
		System.out.println("Creating Measure");
		Actions action = new Actions(driver);
		driver.get("http://localhost:8081/measure_add");
		
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("Measure Test");
		driver.findElement(By.id("quantity")).sendKeys("1");
		driver.findElement(By.id("description")).sendKeys("Measure Test");
		driver.findElement(By.id("measureParent")).sendKeys("16");
		Thread.sleep(2000);
		driver.findElement(By.id("addSubmit")).click();;
		System.out.println("Measure was created successsfully");
	}
	

	public static void testProductCreate() throws InterruptedException {
		System.out.println("Creating Product");
		driver.get("http://localhost:8081/product_add");
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

	public static void testVendorCreate() throws InterruptedException {
		System.out.println("Creating Vendor");
		driver.get("http://localhost:8081/vendor_add");
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Vendor Test");
		driver.findElement(By.id("phone")).sendKeys("60355282");
		driver.findElement(By.id("address")).sendKeys("Simon Rodrigues");
		driver.findElement(By.id("contact")).sendKeys("Juan Pablo");
		driver.findElement(By.id("accountValue")).sendKeys("555");
		Thread.sleep(2000);
		driver.findElement(By.id("addSubmit")).click();;
		System.out.println("Vendor was created successsfully");
	}

	public static void testModuleCreate() throws InterruptedException {
		System.out.println("Creating Module");
		driver.get("http://localhost:8081/module_add");
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Module Test");
		driver.findElement(By.id("president")).sendKeys("Daniela Presidenta");
		driver.findElement(By.id("description")).sendKeys("Module description");
		driver.findElement(By.id("associationId")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.id("addSubmit")).click();;
		System.out.println("Module was created successsfully");
	}

	public static void testCustomerCreate() throws InterruptedException {
		System.out.println("Creating Productor");
		driver.get("http://localhost:8081/customer_add");	
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Productor Test");
		driver.findElement(By.id("ci")).sendKeys("5478745");
		driver.findElement(By.id("phone")).sendKeys("485697");
		driver.findElement(By.id("address")).sendKeys("Av: Blanco Galindo");
		driver.findElement(By.id("accountId")).sendKeys("1616");
		Thread.sleep(2000);
		driver.findElement(By.id("addSubmit")).click();;
		System.out.println("Productor was created successsfully");
	}

	public static void testUserCreate() throws InterruptedException {
		System.out.println("Creating User");
		driver.get("http://localhost:8081/user_add");
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("User Test");
		driver.findElement(By.id("carnet")).sendKeys("5478745");
		driver.findElement(By.id("phone")).sendKeys("485697");
		driver.findElement(By.id("login")).sendKeys("user1");
		driver.findElement(By.id("password")).sendKeys("user1");
		driver.findElement(By.id("direccion")).sendKeys("Direccion 2323");
		driver.findElement(By.id("Salary")).sendKeys("400");
		driver.findElement(By.id("type1")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.id("addSubmit")).click();;
		System.out.println("User was created successsfully");
	}

	public static void testAccountCreate() throws InterruptedException {
		System.out.println("Creating Account");
		driver.get("http://localhost:8081/account_add");
		Thread.sleep(2000);
		driver.findElement(By.id("code")).sendKeys("1.1.1.1");
		driver.findElement(By.id("name")).sendKeys("Account Test1");
		(new Select(driver.findElement(By.id("type")))).selectByVisibleText("ACTIVO");
		//driver.findElement(By.id("type")).sendKeys("ACTIVO");
		driver.findElement(By.id("negative")).sendKeys("NO");
		(new Select(driver.findElement(By.id("parent")))).selectByValue("1");
		driver.findElement(By.id("description")).sendKeys("Description of the account");
		Thread.sleep(2000);
		driver.findElement(By.id("addSubmit")).click();;
		System.out.println("Account was created successsfully");
	}

	public static void testTransaction1Create() throws InterruptedException {
		System.out.println("Creating Income Transaction");
		driver.get("http://localhost:8081/transaction_add/1");
		Thread.sleep(2000);
		driver.findElement(By.id("date")).sendKeys("09/01/2016");
		driver.findElement(By.id("description")).sendKeys("This is a transaction of Income");
		Thread.sleep(2000);
		driver.findElement(By.id("addSubmit")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("addDetail")).click();
		Thread.sleep(2000);
		
		// Add debit
		//(new Select(driver.findElement(By.id("accountId")))).selectByValue("72");
		(new Select(driver.findElement(By.id("accountId")))).selectByVisibleText("1.1.1.1 Account Test1");
		driver.findElement(By.id("debitInput")).sendKeys("2000");
		Thread.sleep(2000);		
		driver.findElement(By.id("addSubmit")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("goTransaction")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("addDetail")).click();
		Thread.sleep(2000);		

		// Add credit detail
		(new Select(driver.findElement(By.id("accountId")))).selectByValue("32");
		driver.findElement(By.id("creditInput")).sendKeys("1000");
		Thread.sleep(2000);		
		driver.findElement(By.id("addSubmit")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("goTransaction")).click();
		Thread.sleep(3000);
		
		System.out.println("Income Transaction was created successsfully");
	}


	public static void testTransaction2Create() throws InterruptedException {
		System.out.println("Creating Egreso Transaction");
		driver.get("http://localhost:8081/transaction_add/2");
		Thread.sleep(2000);
		driver.findElement(By.id("date")).sendKeys("09/01/2016");
		driver.findElement(By.id("description")).sendKeys("This is OutGoing Transaction");

		//User Test
		(new Select(driver.findElement(By.id("receivedBy")))).selectByVisibleText("User Test");
		(new Select(driver.findElement(By.id("autorizedBy")))).selectByValue("1");
		
        
		Thread.sleep(2000);
		driver.findElement(By.id("addSubmit")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("addDetail")).click();
		Thread.sleep(2000);
		
		// Add debit
		(new Select(driver.findElement(By.id("accountId")))).selectByVisibleText("1.1.1.1 Account Test1");
		driver.findElement(By.id("creditInput")).sendKeys("1000");
		Thread.sleep(2000);		
		driver.findElement(By.id("addSubmit")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("goTransaction")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("addDetail")).click();
		Thread.sleep(2000);		

		// Add credit detail
		(new Select(driver.findElement(By.id("accountId")))).selectByValue("50");
		driver.findElement(By.id("debitInput")).sendKeys("1000");
		Thread.sleep(2000);		
		driver.findElement(By.id("addSubmit")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("goTransaction")).click();
		Thread.sleep(3000);
		
		System.out.println("Egreso Transaction was created successsfully");
	}
	
	
	
	public static void testInsumoRequestCreate() throws InterruptedException {
		System.out.println("Creating Product Request By Insumo");
		driver.get("http://localhost:8081/transaction_add/2");
		Thread.sleep(2000);
		driver.findElement(By.id("date")).sendKeys("09/01/2016");
		(new Select(driver.findElement(By.id("userId")))).selectByValue("3");
		(new Select(driver.findElement(By.id("moduleId")))).selectByVisibleText("Module Test");
		driver.findElement(By.id("detail")).sendKeys("Detail");
		Thread.sleep(2000);
		driver.findElement(By.id("addSubmit")).click();
		System.out.println("Product Request By Insumo was created successsfully");
		Thread.sleep(3000);
		
		driver.findElement(By.id("addDetail")).click();
		Thread.sleep(2000);
		System.out.println("Creating Request Detail");
		driver.findElement(By.id("search")).sendKeys("Product Test");
		driver.findElement(By.id("searchSubmit")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("quantity")).sendKeys("100");
		driver.findElement(By.id("addSubmit")).click();
		Thread.sleep(3000);
		
		System.out.println("Request Detail was created successsfully");

		driver.findElement(By.id("payModule")).click();
		Thread.sleep(2000);
		System.out.println("Creating Request Module");
		//driver.findElement(By.id("search")).sendKeys("Module Test");
		//driver.findElement(By.id("searchSubmit")).click();
		Thread.sleep(3000);
		
		// Setting the values
		driver.findElement(By.id("quantity")).sendKeys("100");
		driver.findElement(By.id("price")).sendKeys("20");
		driver.findElement(By.id("totalPrice")).sendKeys("200");
		driver.findElement(By.id("paid")).sendKeys("100");
		driver.findElement(By.id("credit")).sendKeys("100");
		(new Select(driver.findElement(By.id("measureId")))).selectByVisibleText("Measure Test");
		driver.findElement(By.id("observation")).sendKeys("paid 100");
		
		driver.findElement(By.id("addSubmit")).click();
		Thread.sleep(5000);
		System.out.println("Request Productor was created successsfully");
		driver.findElement(By.id("goRequestRow")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("payTransport")).click();
		Thread.sleep(2000);
		System.out.println("Creating Request Transport");
		//driver.findElement(By.id("search")).sendKeys("Transport Test");
		//driver.findElement(By.id("searchSubmit")).click();
		Thread.sleep(3000);
		
		// Setting the values
		driver.findElement(By.id("quantity")).sendKeys("100");
		driver.findElement(By.id("totalPrice")).sendKeys("200");
		driver.findElement(By.id("paid")).sendKeys("100");
		driver.findElement(By.id("credit")).sendKeys("100");
		(new Select(driver.findElement(By.id("measureId")))).selectByVisibleText("Measure Test");
		driver.findElement(By.id("observation")).sendKeys("paid 100");
		
		driver.findElement(By.id("addSubmit")).click();
		Thread.sleep(5000);
		System.out.println("Request Productor was created successsfully");
		driver.findElement(By.id("goRequestRow")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("goRequest")).click();
		Thread.sleep(10000);
	}
	
	public static void testDiscountCreate() throws InterruptedException {
		System.out.println("Creating Discount Report");

		// Going to the discount report
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.id("discount_report"));
		action.moveToElement(we).moveToElement(driver.findElement(By.id("discount_report_add"))).click().build().perform();
		Thread.sleep(2000);
		
		// Set data
		driver.findElement(By.id("startDate")).sendKeys("09/01/2016");
		driver.findElement(By.id("endDate")).sendKeys("20/01/2016");
		Thread.sleep(2000);
		driver.findElement(By.id("addSubmit")).click();
		System.out.println("Discount Report was created successsfully");
		Thread.sleep(3000);
		
		// Adding the detail to the discount
		driver.findElement(By.id("addProductor")).click();
		Thread.sleep(2000);
		
		System.out.println("Creating Productor to the discoutn report");
		driver.findElement(By.id("search")).sendKeys("Productor Test");
		driver.findElement(By.id("searchSubmit")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("discount")).sendKeys("100");
		driver.findElement(By.id("addSubmit")).click();
		Thread.sleep(3000);
		
		// Adding the detail to the discount
		driver.findElement(By.id("addProductor")).click();
		Thread.sleep(2000);
		
		System.out.println("Creating Productor to the discoutn report");
		driver.findElement(By.id("search")).sendKeys("Productor Test");
		driver.findElement(By.id("searchSubmit")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("discount")).sendKeys("100");
		driver.findElement(By.id("addSubmit")).click();
		Thread.sleep(3000);
		
				
		System.out.println("Productor was added to the report successsfully");
		Thread.sleep(5000);
	}

	
	public static void selectTr() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.id("measure"));
		action.moveToElement(we).moveToElement(driver.findElement(By.id("measure_list"))).click().build().perform();
		Thread.sleep(2000);
		WebElement baseTable = driver.findElement(By.id("rows"));
		
		List<WebElement> tableRows = baseTable.findElements(By.tagName("tr"));
		int quantity = 0;
		for(WebElement el: tableRows) {
			if (el.getText().contains("Measure Test")) {
				quantity++;
			}
		}		
		
		System.out.println(quantity + " Measures to delete");
		
		while (quantity > 0){
			quantity--;
			Thread.sleep(3000);
			action = new Actions(driver);
			we = driver.findElement(By.id("measure"));
			Thread.sleep(2000);
			//action.moveToElement(we).moveToElement(driver.findElement(By.id("measure_list"))).click().build().perform();
			(action.moveToElement(we).moveToElement(driver.findElement(By.id("measure_list")))).click();
			Thread.sleep(2000);
			baseTable = driver.findElement(By.id("rows"));
			tableRows = baseTable.findElements(By.tagName("tr"));
			boolean deleted = false;
			for(WebElement el: tableRows) {
				if (!deleted && el.getText().contains("Measure Test")) {
					deleted = true;
					List<WebElement> links = el.findElements(By.tagName("a"));
					boolean actionDelete = false;
					for (WebElement link : links) {
						if (!actionDelete && link.getText().equalsIgnoreCase("Eliminar")) {
							actionDelete = true;
							link.click();
							Thread.sleep(2000);
							System.out.println("Deleted a Measure");
						}
					}
				}
			}
		}
	}

	public static void deleteRow(String module, String tableId, String rowName) throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.id(module));
		action.moveToElement(we).moveToElement(driver.findElement(By.id(module + "_list"))).click().build().perform();
		Thread.sleep(2000);
		WebElement baseTable = driver.findElement(By.id(tableId));
		
		List<WebElement> tableRows = baseTable.findElements(By.tagName("tr"));
		int quantity = 0;
		for(WebElement el: tableRows) {
			if (el.getText().contains(rowName)) {
				quantity++;
			}
		}		
		
		System.out.println((quantity + 1) + " " + module + "s to delete");
		
		while (quantity > 0){
			quantity--;
			Thread.sleep(3000);
			action = new Actions(driver);
			we = driver.findElement(By.id(module));
			Thread.sleep(2000);
			(action.moveToElement(we).moveToElement(driver.findElement(By.id(module + "_list")))).click();
			Thread.sleep(2000);
			baseTable = driver.findElement(By.id(tableId));
			tableRows = baseTable.findElements(By.tagName("tr"));
			boolean deleted = false;
			for(WebElement el: tableRows) {
				if (!deleted && el.getText().contains(rowName)) {
					deleted = true;
					List<WebElement> links = el.findElements(By.tagName("a"));
					boolean actionDelete = false;
					for (WebElement link : links) {
						if (!actionDelete && link.getText().equalsIgnoreCase("Eliminar")) {
							actionDelete = true;
							link.click();
							Thread.sleep(2000);
							System.out.println("Deleted the " + quantity + " " + module);
						}
					}
				}
			}
		}
	}

}
