import java.util.ArrayList;


public class characterData
	{
	String Name; 
	int attack; 
	int health;
	boolean hittable;
	int location;
	boolean counter;
	int speed;
	boolean turn;
	int energy;
	int turnChecker;

	public characterData(String n, int a, int h, boolean hit, int l, boolean c, int s, boolean t, int e, int tc)
		{
		Name = n;
		attack = a; 
		health = h;
		hittable = hit;
		location = l;
		counter = c;
		speed = s;
		turn = t;
		energy = e;
		turnChecker = tc;
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
	public int getSpeed()
		{
		return speed;
		}
	public boolean getTurn()
		{
		return turn;
		}
	public int getEnergy()
		{
		return energy;
		}
	public int getTurnChecker()
		{
		return turnChecker;
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
	public void setSpeed(int speed)
		{
		this.speed = speed;
		}
	public void setTurn(boolean turn)
		{
		this.turn = turn;
		}
	public void setEnergy(int energy)
		{
		this.energy = energy;
		}
	public void setTurnChecker(int turnChecker)
		{
		this.turnChecker = turnChecker;
		}

	
	static ArrayList <characterData> character = new ArrayList<characterData>();

	}
