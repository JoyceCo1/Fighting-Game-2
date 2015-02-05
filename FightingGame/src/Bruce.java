
public class Bruce extends Tank
{
	public Bruce()
	{
		myFinisher = (finisher) new noFinisher();
	}
	public void ability()
	{
		System.out.println("Bruce's massive size allows him to crush his opponents underneath him");
	}
	
	public void name()
		{
		System.out.println("This fighter's name is Bruce");
		}
	
	public static void fill()
		{
		characterData.character.add(new characterData ("Bruce", 50, 500, true, 2, false, 1, false));
		}
	
	public void attack()
		{
		System.out.println("This character's attack is " + 50);
		}
	

}
