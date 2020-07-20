package BehaviouralDesignPattern;

public class Fan_On implements Command
{
	Fan f;
	public Fan_On(Fan f)
	{
		this.f=f;
	}
	public void execute()
	{
		f.On();
	}
}
