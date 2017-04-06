package tests;

import org.junit.Test;

import framework.pages.UserCreatePage;
import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void saveData() throws InterruptedException {
        Main.setup();
        UserCreatePage p = new UserCreatePage();
        String name = "User Test";
        String carnet = "5847874";
        String phone = "4725485";
        String login = "user1";
        String password = "user1";
        String address = "Address 1";
        String salary = "500";
        String type = "Admin";

        p.setName(name);
        p.setCarnet(carnet);
        p.setPhone(phone);
        p.setLogin(login);
        p.setPassword(password);
        p.setAddress(address);
        p.setSalary(salary);
        p.setType(salary);
        p.clickSubmit();
        p.loadElements();

        assertEquals(name, p.getName());
        assertEquals(carnet, p.getCarnet());
        assertEquals(phone, p.getPhone());
        assertEquals(login, p.getLogin());
        assertEquals(password, p.getPassword());
        assertEquals(address, p.getAddress());
        assertEquals(salary, p.getSalary());
        assertEquals(type, p.getType());
        Main.wait5000();
    }
}
