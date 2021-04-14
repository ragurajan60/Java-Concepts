
public class RangeRover extends Car {
	
	public RangeRover(int a)
	{
		System.out.println("Range Rover -- Int Constructor");
	}
	
	public RangeRover(String a)
	{
		System.out.println("Range Rover -- String Constructor");
	}
	
	@Override
	public void Start()
	{
		System.out.println("Range Rover -- Start");
	}
	
	@Override
	public void Stop()
	{
		System.out.println("Range Rover -- Stop");
	}
	
	public void Clean()
	{
		System.out.println("Range Rover -- Clean");
	}
	
	public void Pull()
	{
		System.out.println("Range Rover -- Pull");
	}
	
	@Override
	public void Interface()
	{
		System.out.println("Range Rover -- Interface");
	}
}
