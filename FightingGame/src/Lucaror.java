
public class Lucaror extends Assassin
{
	public Lucaror()
	{
		myFinisher = (finisher) new noFinisher();
	}
	public void ability()
	{
		System.out.println("Lucaror's mastery of stealth allows him to get next to a target and prevent them from using casts");
	}
	public void name()
		{
		System.out.println("This fighter's name is Lucaror");
		}
	
	public static void fill()
		{
		characterData.character.add(new characterData ("Lucaror", 200, 250, true, 1));
		}
	
	public void attack()
		{
		System.out.println("This character's attack is " + 200);
		}
	

}
