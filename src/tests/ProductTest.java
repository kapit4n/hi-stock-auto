package tests;

import org.junit.Assert;
import org.junit.Test;

import framework.Main;
import framework.pages.Product;

public class ProductTest {

	@Test
	public void checkData() {
		Product p = new Product("1", Main.driver);
		Assert.assertEquals(p.getName(), "Product Test");
		Assert.assertEquals(p.getCost(), "10");
		Assert.assertEquals(p.getPercent(), "0.1");
		Assert.assertEquals(p.getMeasureId(), "1");
		Assert.assertEquals(p.getCurrentAmount(), "100");
		Assert.assertEquals(p.getDescription(), "This is produt test");
		Assert.assertEquals(p.getType(), "1");
	}
}
