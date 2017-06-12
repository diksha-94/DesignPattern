Prototype Design Pattern-->
		Creational design pattern
		Focussed on the way of creating object.
		
		Sometimes creation of object can be very expensive in terms of time and memory.
		Suppose you are creating an object with some initial values and those values for it are coming from database,
		so in that case reation will be very time consuming.
		
		So if you have already created an object from database, then what is the need of creating the second object also from database, 
		you can just copy/clone the forst object.
		
		
		Example-say you want to open a bookshop- in a bookshop books are coming from database.
				Suppose you want to open a new bookshop, instead of again getting all the books from database, as it 
				will take too much time, you can copy/paste from the already created bookshop.
				
				As in eal life, it's not possible but virtually it can be possible.
				
		//Created one bookshop
		BookShop bs = new BookShop();
		bs.setShopname("books shop1");
		bs.loadData();
		System.out.println(bs);
		
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
		
		For cloning, the class we need to clone must implement Cloneable interface(marker interface)
		and must override the clone method of Object, clone() is protected in Object.
		
		
		Cloning types---->
				Shallow cloning
				Deep cloning
			
		Shallow cloning is like only one object is created with two references to it.
		So if we change one, it will affect the other.
		
		While in deep cloning , two different objects are created, change in one don't affect the other object.
		Deep cloning can be achieved by creating your own clone method, by just copying the data from one object to another.
		
		
		
		//Shallow cloning 
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	//Deep cloning
	public BookShop clone() throws CloneNotSupportedException
	{
		BookShop shop = new BookShop();
		
		for(Book b : getBooks())
		{
			shop.getBooks().add(b);
		}
		return shop;
	}
		