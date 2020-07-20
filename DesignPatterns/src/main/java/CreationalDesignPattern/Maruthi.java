package CreationalDesignPattern;

public class Maruthi implements Car
{
	String name;
	int cost;
	public Maruthi()
	{
		name="Maruthi";
		cost=50000;
	}
	
	public void getDetails()
	{
		System.out.println("Cost of "+name+" is "+cost);
	}
}
