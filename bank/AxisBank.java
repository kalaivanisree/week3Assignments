package bank;

public class AxisBank extends BankInfo {
	
	public void deposit()
	{
		System.out.println("My Deposit");
	}
	
	public static void main(String[] args) {
		 
		AxisBank ax=new AxisBank();
		ax.deposit();
		ax.saving();
		ax.fixed();
		
	}
}
