
public class Shyra extends Bruiser
{
	String Name = "Shyra";
	int attack = 100;
	int health = 350;
	
	public Shyra()
	{
		myFinisher = (finisher) new yesFinisher();
	}
	public void ability()
	{
		System.out.println("Shyra's small size allows her to hide from her foe's gaze, escaping harm for one turn");
	}
	
	public void name()
		{
		System.out.println("This character's name is Shyra");
		}

}
