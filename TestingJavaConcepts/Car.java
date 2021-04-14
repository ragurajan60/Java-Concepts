
public class Car implements InterfaceConcepts{
	
	static int a = 10;
	final int b = 20;

	public void Start()
	{
		System.out.println("Car -- Start");
		a=20;
	}
	
	void Stop()
	{
		System.out.println("Car -- Stop");
	}

	protected void Refuel()
	{
		System.out.println("Car -- Refuel");
	}
	
	public static void pull()
	{
		System.out.println("Car -- Pull");
	}
	
	public static void push()
	{
		System.out.println("Car -- Push");
	}

	@Override
	public void Interface() {
		System.out.println("Interface");
		
	}

	@Override
	public void TestInterface() {
		// TODO Auto-generated method stub
		
	}
	
}
