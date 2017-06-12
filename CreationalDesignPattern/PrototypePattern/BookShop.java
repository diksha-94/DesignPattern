import java.util.*;
public class BookShop implements Cloneable
{
	private String shopname;
	ArrayList<Book> books = new ArrayList<Book>();
	public void setShopname(String shopname)
	{
		this.shopname = shopname;
	}
	public String getShopname()
	{
		return shopname;
	}
	
	public void setBooks(ArrayList<Book> books)
	{
		this.books = books;
	}
	public ArrayList<Book> getBooks()
	{
		return books;
	}
	
	//Suppose this load Data is loading the books data from the database
	public void loadData()
	{
		for (int i=0;i<10;i++)
		{
			Book b = new Book();
			b.setBid(i+1);
			b.setBname("Bookname["+i+"]");
			books.add(b);
		}
	}
	//Shallow cloning 
	/*
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}*/
	
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
	public String toString()
	{
		return "Bookshop:[shopname: "+shopname+" , books: "+books+"]";
	}
}