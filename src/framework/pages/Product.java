package framework.pages;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.Main;

public class Product {
	private String productId;
	private String name;
	private String cost;
	private String percent;
	private String measureId;
	private String currentAmount;
	private String description;
	private String type;
	WebDriver driver;

	public Product(String id, WebDriver driver) {
		this.productId = id;
		this.driver = driver;
		this.loadFromForm();
	}
	
	public void loadFromForm() {
		driver.get(Main.host + "/product_show/" + this.productId);
		this.name = driver.findElement(By.id("name")).getText();
		this.cost = driver.findElement(By.id("cost")).getText();
		this.percent = driver.findElement(By.id("percent")).getText();
		this.measureId = driver.findElement(By.id("measureId")).getText();
		this.currentAmount = driver.findElement(By.id("currentAmount")).getText();
		this.description = driver.findElement(By.id("description")).getText();
		this.type = driver.findElement(By.id("type")).getText();		
	}
	
	@Test
	public void checkData() {
		Assert.assertEquals(this.name, "Product Test");
		Assert.assertEquals(this.cost, "10");
		Assert.assertEquals(this.percent, "0.1");
		Assert.assertEquals(this.measureId, "1");
		Assert.assertEquals(this.currentAmount, "100");
		Assert.assertEquals(this.description, "This is produt test");
		Assert.assertEquals(this.type, "1");		
	}

}
