
public class enemyCanFinish implements finisher
	{
	public void finisher()
		{
		characterData.character.get(1).setAttack(1000);
		System.out.println(characterData.character.get(1).getName() + " channels their anger into one last attack. \nTheir attack is now 1000 for one turn.");
		}
	}
