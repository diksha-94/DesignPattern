public class School
{
	public static void main(String[] args)
	{
		AssignmentWork aw = new AssignmentWork();
		Pen p = new PenAdapter();
		aw.setP(p);
		
		aw.writeAssignment("I am bit tired of writing the assignment");
	}
}