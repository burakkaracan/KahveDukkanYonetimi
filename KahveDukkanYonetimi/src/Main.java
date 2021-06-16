import abstracts.BaseCustomerManager;
import concretes.StarbucksCustomerManager;
import entities.Customer;
import Adapters.MernisServiceAdapter;


public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(new Customer(1, "Burak Talha", "Karacan", 1997, Long.valueOf("1111111111")));

	}
}
