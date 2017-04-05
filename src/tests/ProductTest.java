package tests;

import org.junit.Test;

import framework.pages.ProductCreatePage;

public class ProductTest {

    @Test
    public void saveData() throws InterruptedException {
        ProductCreatePage p = new ProductCreatePage();
        p.setName("product Tests");
        p.setPercent("0.1");
        p.setCost("10");
        p.setCurrentAmount("500");
        p.setDescription("This is product description");
        p.setMeasureId("1");
        p.setStockLimit("10");
        p.clickSubmit();
    }
}
