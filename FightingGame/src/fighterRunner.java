import java.util.*;
public class fighterRunner
	{
	static Fighter player = characterChoice();
	static Fighter [] fighter = new Fighter [6];
	public static void main(String[] args)
		{
		characterFill();
		characterChoice();
		System.out.println(player.getName());
		}
	
	
	public static void characterFill()
		{
		fighter[0] = new Sahira();
		fighter[1] = new Lucaror();
		fighter[2] = new Bruce();
		fighter[3] = new Golomech();
		fighter[4] = new Shyra();
		fighter[5] = new Auriel();
		}
	
	public static Fighter characterChoice()
		{
		Fighter player = new Sahira();
		Scanner input = new Scanner(System.in);
		System.out.println("Which fighter would you like?");
		System.out.println("(1) Sahira   - an Assassin");
		System.out.println("(2) Lucaror  - an Assassin");
		System.out.println("(3) Bruce    - a Tank");
		System.out.println("(4) Golomech - a Tank");
		System.out.println("(5) Shyra    - a Bruiser");
		System.out.println("(6) Auriel   - a Bruiser");
		int choice = input.nextInt();
		if(choice>6)
			{
			System.out.println("Please select one of the fighters");
			characterChoice();
			}
		fighter[choice - 1].name();
		fighter[choice - 1].identity();
		fighter[choice - 1].fight();
		fighter[choice - 1].counter();
		fighter[choice - 1].ability();
		System.out.println("Are you sure you want to play as this fighter?");
		System.out.print("Y or N");
		String yesOrNo = input.next();
		if(yesOrNo.equals("N"))
			{
			characterChoice();
			}
		if(yesOrNo.equals("Y"))
			{
			int playerCheck = choice - 1;
			switch(playerCheck)
				{
				case 1: 
					{
					player = new Sahira();
					break;
					}
				case 2: 
					{
					player = new Lucaror();
					break;
					}
				case 3: 
					{
					player = new Bruce();
					break;
					}
				case 4: 
					{
					player = new Golomech();
					break;
					}
				case 5: 
					{
					player = new Shyra();
					break;
					}
				case 6: 
					{
					player = new Auriel();
					break;
					}
				}
			}
		else
			{
			System.out.println("Please select a character");
			characterChoice();
			}
		return player;
		}
	
	public static void fillPlayer1()
		{

		}
	}