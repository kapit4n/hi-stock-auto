package tests;

import org.junit.Test;

import framework.pages.CustomerCreatePage;
import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void saveData() throws InterruptedException {

        Main.setup();
        CustomerCreatePage p = new CustomerCreatePage();
        String name = "Customer Tests";
        String ci = "6258789";
        String phone = "485698";
        String address = "Av. Blanco Galindo";
        String accountId = "1616";
        
        p.setName(name);
        p.setCi(ci);
        p.setPhone(phone);
        p.setAddress(address);
        p.setAccountId(accountId);
        
        p.clickSubmit();
        p.loadElements();

        assertEquals(name, p.getName());
        assertEquals(ci, p.getCi());
        assertEquals(phone, p.getPhone());
        assertEquals(address, p.getAddress());
        assertEquals(accountId, p.getAccountId());
        
        Main.wait5000();
    }
}
