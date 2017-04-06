package framework.pages;

import org.openqa.selenium.WebElement;

public class UserCreatePage extends CreatePage {
    private WebElement name;
    private WebElement carnet;
    private WebElement phone;
    private WebElement login;
    private WebElement password;
    private WebElement address;
    private WebElement salary;
    private WebElement type;

    public String getUri(){
        return "/user_add";
    }

    public UserCreatePage() throws InterruptedException {
        super();
    }

    public void loadElements() {
        super.loadElements();
        name = loadById("name");
        carnet = loadById("carnet");
        phone = loadById("phone");
        login = loadById("login");
        password = loadById("password");
        address = loadById("address");
        salary = loadById("salary");
        type = loadById("typeId");
    }

    public void setName(String name) {
        this.name.sendKeys(name);
    }

    public String getName() {
        return this.name.getText();
    }

    public String getCarnet() {
        return carnet.getText();
    }

    public void setCarnet(String carnet) {
        this.carnet.sendKeys(carnet);
    }

    public String getPhone() {
        return phone.getText();
    }

    public void setPhone(String phone) {
        this.phone.sendKeys(phone);
    }

    public String getLogin() {
        return login.getText();
    }

    public void setLogin(String login) {
        this.login.sendKeys(login);
    }

    public String getPassword() {
        return password.getText();
    }

    public void setPassword(String password) {
        this.password.sendKeys(password);
    }

    public String getAddress() {
        return address.getText();
    }

    public void setAddress(String address) {
        this.address.sendKeys(address);
    }

    public String getSalary() {
        return salary.getText();
    }

    public void setSalary(String salary) {
        this.salary.sendKeys(salary);
    }

    public String getType() {
        return type.getText();
    }

    public void setType(String type) {
        this.type.sendKeys(type);
    }
}
