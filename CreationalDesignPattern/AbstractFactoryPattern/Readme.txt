Singleton Design Pattern
	
A class is singleton if only a single instance of it vcan be created and that has global access.

So for a singleton class, it require-->
--> Private constructor- so that object can't be created outside the class
--> a private static member- that contains the object singleton object
--> static factory method- that provides the global access pof the singleton object

--> Early instantiation- object is created on class loading
-->Lazy instantiation- object is created on  demand, whenever required.

Benefits--> Memory save because only a single object is created that is reused again and again