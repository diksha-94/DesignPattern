public class FactoryClass
{
	public OperatingSystem getInstance(String str){
		if(str==null)
			return null;
		else if(str.equalsIgnoreCase("open source"))
			return new Android();
		else if(str.equalsIgnoreCase("closed source"))
			return new IOS();
		else
			return new Windows();
	}
}