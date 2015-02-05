
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
	
	public void name()
		{
		System.out.println("This fighter's name is Sahira");
		}
	
	public static void fill()
		{
		characterData.character.add(new characterData ("Sahira", 200, 250, true, 0, false, 3, false));
		}
	
	public void attack()
		{
		System.out.println("This character's attack is " + 200);
		}
	

}
