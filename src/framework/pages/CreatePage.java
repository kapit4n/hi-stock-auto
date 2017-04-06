package framework.pages;

import org.openqa.selenium.*;

import tests.Main;

public abstract class CreatePage {

    abstract public String getUri();

    public WebElement save;

    public WebElement cancel;

    public WebElement loadById(String id) {
        try {
            return Main.driver.findElement(By.id(id));
        } catch (Exception e) {
            // System.out.println(e);
            return new WebElementEmpty();
        }

    }

    public CreatePage() throws InterruptedException {
        goToPage();
        loadElements();
    }

    public void loadElements() {
        try {
            save = loadById("addSubmit");
            cancel = loadById("cancel");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void goToPage() throws InterruptedException {
        Main.driver.get(Main.host + "/product_add");
        Main.wait3000();
    }

    public void clickSubmit() throws InterruptedException {
        save.click();
        Main.wait5000();
    }

    public void clickCancel() throws InterruptedException {
        save.click();
        Main.wait3000();
    }
}