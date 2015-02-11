
public class Lucaror extends Assassin
{
	public Lucaror()
	{
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
		System.out.println("Lucaror's mastery of stealth allows him to get next to a target and prevent them from using casts");
	}
	public void name()
		{
		System.out.println("This fighter's name is Lucaror");
		}
	
	public static void fill()
		{
		characterData.character.add(new characterData ("Lucaror", 200, 250, true, 1, false, 3, false, 1, 0));
		}
	
	public void attack()
		{
		System.out.println("This character's attack is " + 200);
		}
	public void ifFinisher()
		{
		System.out.println("Lucaror can channel his rage into one super attack");
		}
	public void health()
		{
		System.out.println("Lucaror's health is 250");
		}
	

}
