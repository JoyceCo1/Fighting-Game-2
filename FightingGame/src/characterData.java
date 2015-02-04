import java.util.ArrayList;


public class characterData
	{
	String Name; 
	int attack; 
	int health;
	boolean hittable;
	int location;
	boolean counter;
	public characterData(String n, int a, int h, boolean hit, int l, boolean c)
		{
		Name = n;
		attack = a; 
		health = h;
		hittable = hit;
		location = l;
		counter = c;
		}

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
	public boolean getHittable()
		{
		return hittable;
		}
	public int getLocation()
		{
		return location;
		}
	public boolean getCounter()
		{
		return counter;
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
	public void setHittable(boolean hittable)
		{
		this.hittable = hittable;
		}
	public void setCounter(boolean counter)
		{
		this.counter = counter;
		}
	
	static ArrayList <characterData> character = new ArrayList<characterData>();

	}
