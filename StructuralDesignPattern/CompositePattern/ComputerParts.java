import java.util.*;
interface Component{
	public void showPrice();
}
class LeafObject implements Component
{
	private int price;
	private String name;
	public LeafObject(int price, String name)
	{
		this.price = price;
		this.name = name;
	}
	public void showPrice(){
		System.out.println(name+" : "+price);
	}
}
class CompositeObject implements Component
{
	private String name;
	List<Component> components = new ArrayList<Component>();
	public CompositeObject(String name)
	{
		this.name = name;
	}
	public void addComponent(Component com)
	{
		components.add(com);
	}
	public void showPrice(){
		System.out.print(name);
		for(Component comp : components)
		{
			comp.showPrice();
		}
	}
}

//Bothe the leaf and composite components have some common things