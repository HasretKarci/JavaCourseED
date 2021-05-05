package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.*;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy kpsPublicSoapProxy= new KPSPublicSoapProxy();
		boolean result=false;
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
										Long.parseLong(customer.getNationalityId()), 
										customer.getFirstName().toUpperCase(), 
										customer.getLastName().toUpperCase(), 
										customer.getDateOfBirth().getYear());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return result;
		
	}

}
