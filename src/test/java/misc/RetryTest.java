package misc;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTest implements IRetryAnalyzer{

	int minCount = 0;
	int maxCount = 1;
	public boolean retry(ITestResult result) {
		if(minCount < maxCount) {
			minCount++;
			return true;
		}
		return false;
	}
	

}
