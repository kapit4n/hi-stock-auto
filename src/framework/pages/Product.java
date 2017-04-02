package framework.pages;

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
		this.setName(driver.findElement(By.id("name")).getText());
		this.setCost(driver.findElement(By.id("cost")).getText());
		this.setPercent(driver.findElement(By.id("percent")).getText());
		this.setMeasureId(driver.findElement(By.id("measureId")).getText());
		this.setCurrentAmount(driver.findElement(By.id("currentAmount")).getText());
		this.setDescription(driver.findElement(By.id("description")).getText());
		this.setType(driver.findElement(By.id("type")).getText());		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getPercent() {
		return percent;
	}

	public void setPercent(String percent) {
		this.percent = percent;
	}

	public String getMeasureId() {
		return measureId;
	}

	public void setMeasureId(String measureId) {
		this.measureId = measureId;
	}

	public String getCurrentAmount() {
		return currentAmount;
	}

	public void setCurrentAmount(String currentAmount) {
		this.currentAmount = currentAmount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


}
