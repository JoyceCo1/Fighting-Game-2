
public class Bruce extends Tank
{
	public Bruce()
	{
	enemyFinisher = (finisher) new cantFinish();
	playerFinisher = (finisher) new cantFinish();
		
	}

	public void noFinalStrike()
		{
		
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
		characterData.character.add(new characterData ("Bruce", 50, 500, true, 2, false, 1, false, 1, 0));
		}
	
	public void attack()
		{
		System.out.println("This character's attack is " + 50);
		}
	
	public void health()
		{
		System.out.println("Bruce's health is 500");
		}
	
	public void ifFinisher()
		{
		System.out.println("Bruce can't channel his rage into one super attack");
		}
	

}
