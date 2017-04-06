package tests;

import org.junit.Test;

import framework.pages.VendorCreatePage;
import static org.junit.Assert.*;

public class VendorTest {

    @Test
    public void saveData() throws InterruptedException {
        Main.setup();
        VendorCreatePage p = new VendorCreatePage();
        String name = "Vendor Tests";
        String phone = "485698";
        String address = "Av. Blanco Galindo";
        String contact = "Contact example";
        String account = "1616";

        p.setName(name);
        p.setPhone(phone);
        p.setAddress(address);
        p.setContact(contact);
        p.setAccount(account);
        
        p.clickSubmit();
        p.loadElements();

        assertEquals(name, p.getName());
        assertEquals(phone, p.getPhone());
        assertEquals(address, p.getAddress());
        assertEquals(contact, p.getContact());
        assertEquals(account, p.getAccount());
        
        Main.wait5000();
    }
}
