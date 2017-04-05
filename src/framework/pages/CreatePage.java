package framework.pages;

import org.openqa.selenium.*;

import tests.Main;
 
public abstract class CreatePage {

	abstract public String getUri();

    public WebElement save;

    public WebElement cancel;

    public WebElement loadById(String id) {
        return Main.driver.findElement(By.id(id));
    }

    public CreatePage() throws InterruptedException {
        goToPage();
        loadElements();
    }

    public void loadElements() {
        save = loadById("addSubmit");
        cancel = loadById("cancel");
    }

    public void goToPage() throws InterruptedException {
    	System.out.println(Main.host + "/product_add");
        Main.driver.get(Main.host + "/product_add");
        Main.wait3000();
    }

    public void clickSubmit() throws InterruptedException {
        save.click();
        Main.wait3000();
    }

    public void clickCancel() throws InterruptedException {
        save.click();
        Main.wait3000();        
    }
}