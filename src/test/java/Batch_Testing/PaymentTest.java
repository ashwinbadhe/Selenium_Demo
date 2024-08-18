package Batch_Testing;

import org.testng.annotations.Test;

public class PaymentTest {
	
	@Test
	public void CashOnDelivery() {
		System.out.println("Payment paid by cash successfully");
	}
	
	
	@Test
	public void CashOnNetBanking() {
		System.out.println("Payment paid by Net Banking successfully");
	}
	

}
