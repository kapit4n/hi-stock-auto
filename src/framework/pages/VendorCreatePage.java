package framework.pages;

import org.openqa.selenium.WebElement;

public class VendorCreatePage extends CreatePage {
    private WebElement name;
    private WebElement phone;
    private WebElement address;
    private WebElement contact;
    private WebElement account;

    public String getUri(){
        return "/vendor_add";
    }

    public VendorCreatePage() throws InterruptedException {
        super();
    }

    public void loadElements() {
        super.loadElements();
        name = loadById("name");
        phone = loadById("phone");
        address = loadById("address");
        contact = loadById("contact");
        account = loadById("account");
    }

    public void setName(String name) {
        this.name.sendKeys(name);
    }

    public String getName() {
        return this.name.getText();
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

    public String getContact() {
        return contact.getText();
    }

    public void setContact(String contact) {
        this.contact.sendKeys(contact);
    }

    public String getAccount() {
        return account.getText();
    }

    public void setAccount(String account) {
        this.account.sendKeys(account);
    }

}
