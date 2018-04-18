package AccountPackage;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class Service {

	private static Account account = new Account("deepi", "sd", 654987);

	private static HashMap services = new HashMap();
	
	

	public static void main(String[] args) {
		add();
	//	remove();
	}

	public static void add() {
		services.put(account.getAccountNumber(), account);
	//	System.out.println("The account " + account.getAccountNumber() + " has been stored in our library");
		JSONObject json = new JSONObject(services);

		System.out.println(json);
	}

	public static void remove() {
		services.remove(account.getAccountNumber());
		System.out.println("The account " + account.getAccountNumber() + " has been removed from our store");
	}

	public static Account getAccount() {
		return account;
	}

	public static void setAccount(Account account) {
		Service.account = account;
	}

	public static HashMap getServices() {
		return services;
	}

	public static void setServices(HashMap services) {
		Service.services = services;
	}

	
}