
public class Sahira extends Assassin
{
	public Sahira()
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
		characterData.character.add(new characterData ("Sahira", 200, 250, true, 0, false, 3, false, 1, 0));
		}
	
	public void attack()
		{
		System.out.println("This character's attack is " + 200);
		}
	
	public void health()
		{
		System.out.println("Sahira's health is 250");
		}
	
	public void ifFinisher()
		{
		System.out.println("Sahira can't channel her rage into one super attack");
		}
	

}
