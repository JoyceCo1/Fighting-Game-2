import java.util.ArrayList;


public abstract class Fighter {
	
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
	
	
	String Name; 
	int attack; 
	int health;

	public String getName()
		{
		return Name;
		}
	public int getAttack()
		{
		return attack;
		}
	public int getHealth()
		{
		return health;
		}
	public void setName(String name)
		{
		this.Name = name;
		}
	public void setAttack(int attack)
		{
		this.attack = attack;
		}
	public void setHealth(int health)
		{
		this.health = health;
		}
	

	
}
