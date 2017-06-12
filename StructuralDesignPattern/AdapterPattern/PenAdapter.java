public class PenAdapter implements Pen
{
	//this adapter class is connected between Pen and PilotPen(to make them compatible to each other)
	PilotPen pp=new PilotPen();
	public void write(String str)
	{
		pp.mark(str);
	}
}