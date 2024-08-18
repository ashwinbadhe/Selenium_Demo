package TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements  IRetryAnalyzer{

	int CountForRetry = 0;

	int SetCountForRetry = 3;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(result.isSuccess()) {
			if(CountForRetry<SetCountForRetry) {
				CountForRetry++;
				return true;
			}
		}
		return false;
	}

	

	

}