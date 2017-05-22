public class BankFactory extends AbstractFactory
{
	public Bank getBank(String bankName){
		if(bankName == null)
		{
			return null;
		}
		else if(bankName.equalsIgnoreCase("SBI")){
			return new SBI();
		}
		else if(bankName.equalsIgnoreCase("HDFC")){
			return new HDFC();
		}
		else if(bankName.equalsIgnoreCase("ICICI")){
			return new ICICI();
		}
		return null;
	}
	public Loan getLoan(String loanName){
		return null;
	}
}