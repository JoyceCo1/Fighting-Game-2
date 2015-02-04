
public class Shyra extends Bruiser
{

	public Shyra()
	{
	Name = "Shyra";
	attack = 100;
	health = 350;
	
	
	}
	public void ability()
	{
		System.out.println("Shyra's small size allows her to hide from her foe's gaze, escaping harm for one turn");
	}
	
	public void name()
		{
		System.out.println("This character's name is Shyra");
		}
	
	public static void fill()
		{
		characterData.character.add(new characterData ("Shyra", 100, 350, true, 4, false));
		}
	
	public void attack()
		{
		System.out.println("This character's attack is " + 100);
		}


}
