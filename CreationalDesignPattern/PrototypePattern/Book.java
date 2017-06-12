public class Book
{
	private int bid;
	private String bname;
	
	public void setBid(int bid)
	{
		this.bid = bid;
	}
	public int getBid()
	{
		return bid;
	}
	
	public void setBname(String bname)
	{
		this.bname = bname;
	}
	public String getBname()
	{
		return bname;
	}
	public String toString()
	{
		return "Book:[bid: "+bid+" , bname: "+bname+"]";
	}
}