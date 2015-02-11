import java.util.ArrayList;


public abstract class Fighter {
	String Name;
	int attack;
	int health;
	protected int Ability;
	protected int Counter;
	protected finisher playerFinisher;
	protected finisher enemyFinisher;

	
	public void counter()
	{
		System.out.println("Every fighter has a chance to counter attacks if fast enough");
	}
	
	public void fight()
	{
		System.out.println("The fighter's main strength comes from their combat prowess");
	}
	
	public abstract void ability();
	
	public void superChecker()
	{
		System.out.println("The assassins used the super method");
	}
	
	public abstract void identity();
	
	public abstract void name();

	public abstract void attack();
	
	public abstract void health();
	
	public abstract void ifFinisher();
		
	

	
}
