import java.util.*;

public class player1
	{
	String name; 
	int attack; 
	int health;
	public player1(String n, int atk, int h)
		{
		name = n;
		attack = atk;
		health = h;
		}
	public String getName()
		{
		return name;
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
		this.name = name;
		}
	public void setAttack(int attack)
		{
		this.attack = attack;
		}
	public void setHealth(int health)
		{
		this.health = health;
		}
	
	ArrayList player1 = new ArrayList();
	

	}
