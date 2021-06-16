package Adapters;



import java.rmi.RemoteException;
import MernisServiceReference.KPSPublicSoapProxy;
import abstracts.CustomerCheckService;
import entities.Customer;


public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalId()),customer.getFirstName()
					,customer.getLastName(),customer.getDateOfBirth());
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
		return false;

	}
						
		
}
	

