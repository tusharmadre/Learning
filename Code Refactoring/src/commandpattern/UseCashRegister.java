package commandpattern;

public class UseCashRegister{
	
	public static void main(String[] args){
				
		BillPayer sallyMay = CustomerTypePicker.getWomanOver60();
		
		Waiter theWaiter = new Waiter(sallyMay);
		
		CashRegister calculateBill = new CashRegister(theWaiter);
		
		calculateBill.returnFinalBill(12.00);
				
		BillPayer paulThumb = CustomerTypePicker.getManOver60();
		theWaiter = new Waiter(paulThumb);
		calculateBill = new CashRegister(theWaiter);
		calculateBill.returnFinalBill(12.00);
				
		CustomerGroup custGroup = new CustomerGroup();
		custGroup.add(CustomerTypePicker.getWomanOver60());
		custGroup.get(0).calculateBill(12.00);
		
		
	}
	
}
