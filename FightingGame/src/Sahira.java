
public class Sahira extends Assassin
{
	public Sahira()
	{
		myFinisher = (finisher) new yesFinisher();
	}
	public void ability()
	{
		System.out.println("Sahira's special move stops other fighters from hitting her, then she attacks back for double damage");
		
	}
	
	public void finalStrike()
	{
		System.out.println("Sahira uses her knowledge of her foes body to immediately lower their health to zero.");
	}

}
