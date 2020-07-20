package BehaviouralDesignPattern;

public class Light_On implements Command
{
	Light l;
	public Light_On(Light l)
	{
		this.l=l;
	}
	public void execute()
	{
		l.On();
	}
}
