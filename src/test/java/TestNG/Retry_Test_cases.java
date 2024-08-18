package TestNG;


import org.testng.Assert;
import org.testng.annotations.*;

public class Retry_Test_cases {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Test_Case_01() {
		Assert.assertTrue(false);
	}

	@Test
	public void Test_Case_02() {
		Assert.assertTrue(false);
	}

	@Test
	public void Test_Case_03() {
		Assert.assertTrue(true);
	}

}
