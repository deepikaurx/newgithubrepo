package AccountPackage;

import java.util.HashMap;
import java.util.Map;

public class Service {

	static Account account = new Account("deepi", "sd", 654987);

	static HashMap services = new HashMap();

	public static void main(String[] args) {
		add();
		remove();
	}

	public static void add() {

		services.put(account.getAccountNumber(), account);
		System.out.println("The account " + account.getAccountNumber() + " has been stored in our library");

	}

	public static void remove() {
		services.remove(account.getAccountNumber());
		System.out.println("The account " + account.getAccountNumber() + " has been removed from our store");
	}

}