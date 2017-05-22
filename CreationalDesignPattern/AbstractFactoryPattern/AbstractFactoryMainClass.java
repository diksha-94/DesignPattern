import java.io.*;
public class AbstractFactoryMainClass
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter bank name: ");
		String bankName = br.readLine();
		System.out.println("Enter loan you want: ");
		String loanName = br.readLine();
		
		//Get the Factory
		AbstractFactory bank = new FactoryCreator().getFactory("bank");
		AbstractFactory loan = new FactoryCreator().getFactory("loan");
		
		//Get bank and loan details
		if(bank!=null){
			Bank b = bank.getBank(bankName);
			if(b!=null)
				b.displayBankName();
			else
				System.out.println("No bank matching");
		}
		if(loan!=null){
			Loan l = loan.getLoan(loanName);
			if(l!=null)
				l.displayRateOfInterest();
			else
				System.out.println("No loan matching");
		}
	}
}