Factory Pattern--
	It's a creational design pattern means concerned to the way of creating object.
	
	A Factory Pattern or Factory Method Pattern says that just define an interface or 
	abstract class for creating an object but let the subclasses decide which class to 
	instantiate. In other words, subclasses are responsible to create the instance of 
	the class.
	
	
Example--> Operating System in a mobile phone can be any- android, Windows, ios ,...
			So created an abstract class OperatingSystem, and the subclasses Android, Windows and ios inheriting Operating System class.
			In future, more OS can be introduced.
			MainClass is the client , and the client can require any of the OS as per the requirement.
			So whatever OS is required, object of that class is created , for ex-of Android(can be any other in future).
			
			So without using the factory design pattern, we are directly creating the object of OS in the client class, 
			but ideally ,we must hide this implementation from the client.
			
			Client must ask for the operating system as per requirement like he wants an open Source OS, or closed source or any other.
			
So according to the Factory Design Pattern, this implementation of creating the object is hide from the client.
Instead the client will give its requirement and a class called Factory, will return the object according to the input given by the client.

As implemented in MainClassFactory.java and Factory class as FactoryClass.java