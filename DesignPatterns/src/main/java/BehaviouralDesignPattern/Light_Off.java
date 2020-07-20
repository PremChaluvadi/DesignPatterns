package BehaviouralDesignPattern;

public class Light_Off implements Command
{
	Light l;
	public Light_Off(Light l)
	{
		this.l=l;
	}
	public void execute()
	{
		l.Off();
	}
}
