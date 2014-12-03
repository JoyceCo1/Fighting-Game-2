
public abstract class Assassin extends Fighter
{
	public void dash()
	{
		System.out.println("Assassins can dash in close to do double damage");
	}
	
	public void superChecker()
	{
		super.superChecker();
	}
	
	public void identity()
	{
		System.out.println("This character is an assassin");
	}

}
