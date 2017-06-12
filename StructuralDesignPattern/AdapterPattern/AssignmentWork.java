public class AssignmentWork
{
	private Pen p;
	public void setP(Pen p)
	{
		this.p = p;
	}
	public Pen getP()
	{
		return p;
	}
	public void writeAssignment(String str)
	{
		//Here p is an interface ,and it's not implemented
		//So it will give exception as NullPointer.
		//Now what if I don't wan to create an implementation of Pen interface,
		//As we do, by not taking our Pen, we ask our friend to give a pen
		//So in this case i asked my friend to give me the pen, but he said I don't have implementation for Pen
		//But I have it for PilotPen , but that's not at all related to Pen. I can provide you the class for pilotPen
		p.write(str);
	}
}