package tests;

import org.junit.Test;

import framework.pages.ProductCreatePage;
import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void saveData() throws InterruptedException {

        Main.setup();
        ProductCreatePage p = new ProductCreatePage();
        String productName = "product Tests";
        String percent = "0.1";
        String cost = "10.0";
        String price = "11.0";
        String currentAmount = "500";
        String description = "This is product description";
        String measureId = "1";
        String measure = "1LITRO";
        String stockLimit = "10";

        p.setName(productName);
        p.setPercent(percent);
        p.setCost(cost);
        p.setCurrentAmount(currentAmount);
        p.setDescription(description);
        p.setMeasureId(measureId);
        p.setStockLimit(stockLimit);
        p.clickSubmit();
        p.loadElements();

        assertEquals(productName, p.getName());
        assertEquals(percent, p.getPercent());
        assertEquals(cost, p.getCost());
        assertEquals(price, p.getPrice());
        assertEquals(currentAmount, p.getCurrentAmount());
        assertEquals(description, p.getDescription());
        assertEquals(stockLimit, p.getStockLimit());
        assertEquals(measure, p.getMeasure());
        Main.wait5000();
    }
}
