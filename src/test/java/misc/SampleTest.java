package misc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
	
	@Test(retryAnalyzer = RetryTest.class)
	public void test() {
		System.out.println("Retry Test!");
		Assert.assertTrue(false);
	}

}
