
public class Shyra extends Bruiser
{

	public Shyra()
	{
	Name = "Shyra";
	attack = 100;
	health = 350;
	playerFinisher = (finisher) new playerCanFinish();
	enemyFinisher = (finisher) new enemyCanFinish();
	
	
	}
	public void playerFinalStrike()
		{
		System.out.println("Golomech drops his entire body onto the enemy, dealing massive damage.");
		characterData.character.get(0).setAttack(900);
		}
	
	public void enemyFinalStrike()
		{
		System.out.println("Golomech uses his entire body to fight");
		characterData.character.get(1).setAttack(900);
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
		characterData.character.add(new characterData ("Shyra", 100, 350, true, 4, false, 2, false, 1, 0));
		}
	
	public void attack()
		{
		System.out.println("This character's attack is " + 100);
		}
	
	public void ifFinisher()
		{
		System.out.println("Shyra can channel her rage into one super attack");
		}
	
	public void health()
		{
		System.out.println("Shyra's health is 350");
		}


}
