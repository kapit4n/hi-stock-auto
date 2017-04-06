package framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MeasureCreatePage extends CreatePage {
    private WebElement name;
    private WebElement quantity;
    private WebElement measureParentId;
    private WebElement measureParent;
    private WebElement description;

    public String getUri(){
        return "/measure_add";
    }

    public MeasureCreatePage() throws InterruptedException {
        super();
    }

    public void loadElements() {
        super.loadElements();
        name = loadById("name");
        quantity = loadById("quantity");
        measureParentId = loadById("measureParentId");
        measureParent = loadById("measureParent");
        description = loadById("description");
    }

    public void setName(String name) {
        this.name.sendKeys(name);
    }

    public String getName() {
        return this.name.getText();
    }

    public String getQuantity() {
        return quantity.getText();
    }

    public void setQuantity(String quantity) {
        this.quantity.sendKeys(quantity);
    }

    public String getMeasureParentId() {
        return measureParentId.getText();
    }

    public void setMeasureParentId(String measureParentId) {
        (new Select(this.measureParentId)).selectByVisibleText(measureParentId);
    }

    public String getMeasureParent() {
        return measureParent.getText();
    }

    public void setMeasureParent(String measureParent) {
        this.measureParent.sendKeys(measureParent);
    }

    public String getDescription() {
        return description.getText();
    }

    public void setDescription(String description) {
        this.description.sendKeys(description);
    }
}
