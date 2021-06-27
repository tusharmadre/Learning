package commandpattern;

public class CashRegister{
	
	Command theCommand;
	
	CashRegister(Command newCommand){
		
		theCommand = newCommand;
		
	}
	
	public void returnFinalBill(double amountDue){
		
		theCommand.executeCalculateBill(amountDue);
		
	}
	
}

