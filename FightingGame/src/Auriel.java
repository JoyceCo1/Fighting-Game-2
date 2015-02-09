
public class Auriel extends Bruiser
{
	public Auriel()
	{
		enemyFinisher = (finisher) new cantFinish();
		playerFinisher = (finisher) new cantFinish();
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
		System.out.println("Auriel's mastery of combat allows her to equalize the fight by bringing both her and her foe's health to an equal amount");
	}
	
	public void name()
		{
		System.out.println("This fighter's name is Auriel");
		}
	
	public static void fill()
		{
		characterData.character.add(new characterData ("Auriel", 100, 350, true, 5, false, 2, false, 1));
		}
	
	public void attack()
		{
		System.out.println("This character's attack is " + 100);
		}
	
	

}
