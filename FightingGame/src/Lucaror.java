
public class Lucaror extends Assassin
{
	public Lucaror()
	{
		myFinisher = (finisher) new noFinisher();
	}
	public void ability()
	{
		System.out.println("Lucaror's mastery of stealth allows him to get next to a target and prevent them from using casts");
	}

}
