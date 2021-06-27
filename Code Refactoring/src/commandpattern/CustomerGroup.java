package commandpattern;

import java.util.ArrayList;

public class CustomerGroup{

	ArrayList<BillPayer> customers;
	
	CustomerGroup(){
		
		customers = new ArrayList<BillPayer>();
		
	}
	
	public void add(BillPayer newPayer){
		
		customers.add(newPayer);
		
	}
	
	public BillPayer get(int customerIndex){
		
		return customers.get(customerIndex);
		
	}

}
