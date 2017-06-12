public class CompositeTest
{
	public static void main(String[] args)
	{
		Component hd = new LeafObject(4000,"HardDrive");
		Component mouse = new LeafObject(500,"Mouse");
		Component monitor = new LeafObject(3000,"Monitor");
		Component cpu = new LeafObject(10000,"CPU");
		Component ram = new LeafObject(5000,"RAM");
		
		CompositeObject ph = new CompositeObject("Peripheral Device");
		CompositeObject mb = new CompositeObject("Motherboard");
		CompositeObject cn = new CompositeObject("Cabinet");
		CompositeObject computer = new CompositeObject("Computer");
		
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		mb.addComponent(ram);
		mb.addComponent(cpu);
		cn.addComponent(mb);
		cn.addComponent(ph);
		computer.addComponent(cn);
		computer.addComponent(ph);
		
		computer.showPrice();
		
	}
}