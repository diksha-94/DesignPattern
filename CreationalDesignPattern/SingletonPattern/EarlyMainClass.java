//Early instantiation of singleton object

class EarlyInstantiation
{
	private EarlyInstantiation(){}
	private String name;
	private static EarlyInstantiation obj = new EarlyInstantiation();
	
	public static EarlyInstantiation getInstance()
	{
		return obj;
	}
	public String getObjName()
	{
		return name;
	}
	public void setObjName(String name)
	{
		this.name = name;
	}
}

public class EarlyMainClass{
	public static void main(String[] args)
	{
		EarlyInstantiation earlyObj = EarlyInstantiation.getInstance();
		earlyObj.setObjName("Early instantiated singleton object");
		System.out.println(earlyObj.getObjName());
	}
}