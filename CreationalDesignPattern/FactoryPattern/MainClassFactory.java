public class MainClassFactory
{
	public static void main(String[] args)
	{
		FactoryClass fc = new FactoryClass();
		OperatingSystem os = fc.getInstance("open source");
		os.show();
	}
}