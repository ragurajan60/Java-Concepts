
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		RangeRover rr = new RangeRover(10);
		RangeRover rr1 = new RangeRover("a");
		rr.Start();
		rr.Stop();
		rr1.Start();
		//rr.Refuel();
		c.Start();
		c.Refuel();
		Car.push();
		Car.pull();
		Car.a = 20;
		rr.Interface();
		System.out.println(Car.a + rr.b);
		InterfaceConcepts ic = new RangeRover(10);
		ic.TestInterface();
		ic.Interface();
		rr.TestInterface();
		InterfaceConcepts icTesla = new Tesla();
		icTesla.Interface();
		icTesla.TestInterface();
		}
}
