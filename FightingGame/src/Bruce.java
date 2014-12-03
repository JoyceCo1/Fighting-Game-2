
public class Bruce extends Tank
{
	public Bruce()
	{
		myFinisher = (finisher) new noFinisher();
	}
	public void ability()
	{
		System.out.println("Bruce's massive size allows him to crush his opponents underneath him");
	}

}
