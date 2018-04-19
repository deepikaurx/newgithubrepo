package AccountsM.AccountsM;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

public class Name {

	Account account1=new Account("anthony","singh", 123456);
	private static HashMap <Object,String> services = new HashMap();
	private int counter;
	@Test
	public void test() {
		String expected="anthony";
		String actual=account1.getFirstName();
		assertEquals(expected, actual) ;
		
		String name = "anthony";
		
		services.put(account1.getAccountNumber(), account1.getFirstName());
		
		for(String key: services.values()) {
			System.out.println(key);
			
			if(key.equals(name)) {
				counter++;
			}
			
		}
		System.out.println(counter);
		
	}
}
