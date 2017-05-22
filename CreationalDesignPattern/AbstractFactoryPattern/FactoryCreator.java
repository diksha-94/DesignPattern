public class FactoryCreator
{
	public AbstractFactory getFactory(String factoryName)
	{
		if(factoryName == null){
			return null;
		}
		else if(factoryName.equalsIgnoreCase("Bank")){
			return new BankFactory();
		}
		else if(factoryName.equalsIgnoreCase("Loan")){
			return new LoanFactory();
		}
		return null;
	}
}