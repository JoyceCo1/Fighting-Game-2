public class fighterRunner
	{
	public static void main(String[] args)
		{
		Fighter [] fighter = new Fighter [6];
		fighter[0] = new Sahira();
		fighter[1] = new Lucaror();
		fighter[2] = new Bruce();
		fighter[3] = new Golomech();
		fighter[4] = new Shyra();
		fighter[5] = new Auriel();
		
		for (int i = 0; i < fighter.length; i++)
			{	
			fighter[i].fight();
			fighter[i].counter();
			fighter[i].ability();
			fighter[i].myFinisher.finalStrike();
			System.out.println();
			}
		}
	}