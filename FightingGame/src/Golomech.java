
public class Golomech extends Tank implements finisher
{
	public Golomech()
	{
	playerFinisher = (finisher) new playerCanFinish();
	enemyFinisher = (finisher) new enemyCanFinish();

	}
	
	public void ability()
	{
		System.out.println("Golomech's ancient pride of his half machine race allows him to hit twice in one turn");
	}
	public void name()
		{
		System.out.println("This fighter's name is Golomech");
		}
	
	public static void fill()
		{
		characterData.character.add(new characterData ("Golomech", 50, 500, true, 3, false, 1, false, 1));
		}
	
	public void attack()
		{
		System.out.println("This character's attack is " + 50);
		}

	@Override
	public void finisher()
		{
		// TODO Auto-generated method stub
		
		}
	

}
