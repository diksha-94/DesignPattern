public class PrototypeMain
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		//Created one bookshop
		BookShop bs = new BookShop();
		bs.setShopname("books shop1");
		bs.loadData();
		
		//Creating another bookshop
		/*
		BookShop bs1 = new BookShop();
		bs1.setShopname("books shop2");
		bs1.loadData();
		System.out.println(bs1);
		*/
		//Created the another bookshop object in the same way , but it has a memory and time problem 
		//it is loading the data from database, so it will take too much time.
		//Instead of doing this way, bs1 can ask bs to give its data to bs1
		//To do this, we can use clone (cloning the already existing object)
		
		//BookShop bs1 = (BookShop)bs.clone();
		BookShop bs1 = bs.clone();
		//System.out.println(bs1);
		bs.getBooks().remove(2);
		System.out.println(bs);
		
		System.out.println(bs1);
	}
}