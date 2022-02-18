package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTest {
	
	@Test(groups = {"Smoke", "Sanity"})
	public void testA() {
		Assert.assertEquals(1, 1);
		
	}
	
	@Test(groups = {"Smoke"})
	public void testB() {
		Assert.assertEquals(false, false);
		Assert.assertFalse(false);
	}

	@Test(dependsOnGroups = {"Smoke", "Sanity"})
	public void testC() {
		Assert.assertEquals(false, false);
		Assert.assertFalse(false);
	}
	
	@Test(invocationCount = 5)
	public void testD() {
		System.out.println("test D");
	}
	
	@Test(invocationCount = 5)
	public void testE() {
		System.out.println("test D");
	}
}
