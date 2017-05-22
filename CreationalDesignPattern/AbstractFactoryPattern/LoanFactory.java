public class LoanFactory extends AbstractFactory
{
	public Bank getBank(String bankName){
		return null;
	}
	public Loan getLoan(String loanName){
		if(loanName == null)
		{
			return null;
		}
		else if(loanName.equalsIgnoreCase("Home")){
			return new HomeLoan();
		}
		else if(loanName.equalsIgnoreCase("Personal")){
			return new PersonalLoan();
		}
		else if(loanName.equalsIgnoreCase("Car")){
			return new CarLoan();
		}
		return null;
	}
}