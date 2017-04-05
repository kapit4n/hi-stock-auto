package framework.pages;

import org.openqa.selenium.WebElement;

public class ProductCreatePage extends CreatePage {
    private WebElement name;
    private WebElement cost;
    private WebElement percent;
    private WebElement measureId;
    private WebElement currentAmount;
    private WebElement description;
    private WebElement stockLimit;

    public String getUri(){
    	return "/product_add";
    }

    public ProductCreatePage() throws InterruptedException {
        super();
    }

    public void loadElements() {
        super.loadElements();
        name = loadById("name");
        cost = loadById("cost");
        percent = loadById("percent");
        measureId = loadById("measureId");
        currentAmount = loadById("currentAmount");
        description = loadById("description");
        stockLimit = loadById("stockLimit");
    }

    public void setName(String name) {
        this.name.sendKeys(name);
    }

    public String getName() {
        return this.name.getText();
    }

    public String getCost() {
        return cost.getText();
    }

    public void setCost(String cost) {
        this.cost.sendKeys(cost);
    }

    public String getPercent() {
        return percent.getText();
    }

    public void setPercent(String percent) {
        this.percent.sendKeys(percent);
    }

    public String getMeasureId() {
        return measureId.getText();
    }

    public void setMeasureId(String measureId) {
        this.measureId.sendKeys(measureId);
    }

    public String getCurrentAmount() {
        return currentAmount.getText();
    }

    public void setCurrentAmount(String currentAmount) {
        this.currentAmount.sendKeys(currentAmount);
    }

    public String getDescription() {
        return description.getText();
    }

    public void setDescription(String description) {
        this.description.sendKeys(description);
    }

    public String getStockLimit() {
        return stockLimit.getText();
    }

    public void setStockLimit(String stockLimit) {
        this.stockLimit.sendKeys(stockLimit);
    }
}
