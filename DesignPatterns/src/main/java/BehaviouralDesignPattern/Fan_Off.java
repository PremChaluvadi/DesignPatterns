package BehaviouralDesignPattern;

public class Fan_Off implements Command
{
	Fan f;
	public Fan_Off(Fan f)
	{
		this.f=f;
	}
	public void execute()
	{
		f.Off();
	}
}
