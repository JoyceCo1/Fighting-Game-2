import java.util.ArrayList;


public abstract class Fighter {
	String Name;
	int attack;
	int health;
	protected int Ability;
	protected int Counter;
	protected finisher myFinisher;

	
	public void counter()
	{
		System.out.println("Every fighter has a chance to counter attacks if fast enough");
	}
	
	public void fight()
	{
		System.out.println("The fighter's main strenght comes from their ability to fight");
	}
	
	public abstract void ability();
	
	public void superChecker()
	{
		System.out.println("The assassins used the super method");
	}
	
	public abstract void identity();
	
	public abstract void name();

	public abstract void attack();
	
	
	

	
}
