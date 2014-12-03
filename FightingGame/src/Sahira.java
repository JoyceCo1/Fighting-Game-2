
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
	
	public void superChecker()
	{
		super.superChecker();
	}

}
