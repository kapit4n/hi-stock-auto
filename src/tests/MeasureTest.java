package tests;

import org.junit.Test;

import framework.pages.MeasureCreatePage;
import static org.junit.Assert.*;

public class MeasureTest {

    @Test
    public void saveData() throws InterruptedException {

        Main.setup();
        MeasureCreatePage p = new MeasureCreatePage();
        String name = "Measure Tests";
        String quantity = "1.0";
        String measureParentId = "Unidad";
        String measureParent = "1LITRO";
        String description = "This is Measure description";

        p.setName(name);
        p.setQuantity(quantity);
        p.setMeasureParentId(measureParentId);
        p.setDescription(description);
        p.clickSubmit();
        p.loadElements();

        assertEquals(name, p.getName());
        assertEquals(quantity, p.getQuantity());
        assertEquals(measureParent, p.getMeasureParent());
        assertEquals(description, p.getDescription());
        Main.wait5000();
    }
}
