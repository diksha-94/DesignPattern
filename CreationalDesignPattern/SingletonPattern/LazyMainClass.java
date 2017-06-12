//Lazy instantiation of Singleton object
//The singleton object will be created whenever required

class LazyInstantiation
{
	private LazyInstantiation(){}
	private static LazyInstantiation obj;
	private String name;
	public static LazyInstantiation getInstance(){
		if(obj == null){
			obj = new LazyInstantiation();
		}
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

public class LazyMainClass{
	public static void main(String[] args)
	{
		LazyInstantiation lazyObj = LazyInstantiation.getInstance();
		lazyObj.setObjName("Lazy instantiated singleton object");
		System.out.println(lazyObj.getObjName());
	}
}
