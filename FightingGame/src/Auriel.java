
public class Auriel extends Bruiser
{
	public Auriel()
	{
		myFinisher = (finisher) new noFinisher();
	}
	public void ability()
	{
		System.out.println("Auriel's mastery of combat allows her to equalize the fight by bringing both her and her foe's health to an equal amount");
	}
	
	public void name()
		{
		System.out.println("This fighter's name is Auriel");
		}
	
	public static void fill()
		{
		characterData.character.add(new characterData ("Auriel", 100, 350, true, 5, false));
		}
	
	public void attack()
		{
		System.out.println("This character's attack is " + 100);
		}
	
	

}
