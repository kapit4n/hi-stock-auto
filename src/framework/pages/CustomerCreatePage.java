package framework.pages;

import org.openqa.selenium.WebElement;

public class CustomerCreatePage extends CreatePage {
    private WebElement name;
    private WebElement ci;
    private WebElement phone;
    private WebElement address;
    private WebElement accountId;

    public String getUri(){
        return "/customer_add";
    }

    public CustomerCreatePage() throws InterruptedException {
        super();
    }

    public void loadElements() {
        super.loadElements();
        name = loadById("name");
        ci = loadById("ci");
        phone = loadById("phone");
        address = loadById("address");
        accountId = loadById("accountId");
    }

    public void setName(String name) {
        this.name.sendKeys(name);
    }

    public String getName() {
        return this.name.getText();
    }

    public String getCi() {
        return ci.getText();
    }

    public void setCi(String ci) {
        this.ci.sendKeys(ci);
    }

    public String getPhone() {
        return phone.getText();
    }

    public void setPhone(String phone) {
        this.phone.sendKeys(phone);
    }

    public String getAddress() {
        return address.getText();
    }

    public void setAddress(String address) {
        this.address.sendKeys(address);
    }

    public String getAccountId() {
        return accountId.getText();
    }

    public void setAccountId(String accountId) {
        this.accountId.sendKeys(accountId);
    }

}
