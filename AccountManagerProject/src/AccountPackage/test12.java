package AccountPackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class test12 {

	Account account1=new Account("tralala","blablabla", 123456);
	
	@Test
	public void test() {
		int expected=123456;
		int actual=account1.getAccountNumber();
		assertEquals(expected, actual) ;
		
	}

}
