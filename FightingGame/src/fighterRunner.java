import java.util.*;
public class fighterRunner
	{
	static int player = 0;
	static int enemy = 1;
	static Fighter [] fighter = new Fighter [6];
	public static void main(String[] args)
		{
		characterFill();
		characterChoice();
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
	
	public static void characterChoice()
		{
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
		fighter[choice - 1].attack();
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
			int playerCheck = choice;
			switch(playerCheck)
				{
				case 1: 
					{
					Sahira.fill();
					break;
					}
				case 2: 
					{
					Lucaror.fill();
					break;
					}
				case 3: 
					{
					Bruce.fill();
					break;
					}
				case 4: 
					{
					Golomech.fill();
					break;
					}
				case 5: 
					{
					Shyra.fill();
					break;
					}
				case 6: 
					{
					Auriel.fill();
					break;
					}
				}
			System.out.println("You are playing " + characterData.character.get(player).getName());
			enemyFill();
			}
		else
			{
			System.out.println("Please select a character");
			characterChoice();
			}

		}
	public static void enemyFill()
		{
		int enemyChoice = (int)(Math.random()*6 + 1);
		int playerCheck = enemyChoice;
		switch(playerCheck)
			{
			case 1: 
				{
				Sahira.fill();
				break;
				}
			case 2: 
				{
				Lucaror.fill();
				break;
				}
			case 3: 
				{
				Bruce.fill();
				break;
				}
			case 4: 
				{
				Golomech.fill();
				break;
				}
			case 5: 
				{
				Shyra.fill();
				break;
				}
			case 6: 
				{
				Auriel.fill();
				break;
				}
			}
		System.out.println("Your opponent will be " + characterData.character.get(enemy).getName());
		}
	
	public static void combat()
		{
		int playerHealth = characterData.character.get(player).getHealth();
		int playerAttack = characterData.character.get(player).getAttack();
		String playerName = characterData.character.get(player).getName();
		int compHealth = characterData.character.get(enemy).getHealth();
		int compAttack = characterData.character.get(enemy).getHealth();
		String compName = characterData.character.get(enemy).getName();
		boolean compHittable = characterData.character.get(enemy).getHittable();
		boolean playerHittable = characterData.character.get(player).getHittable();
		boolean compCounter = false;
		boolean playerCounter = false;
		int playerEnergy = 3;
		int compEnergy = 3;
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		System.out.println("What would you like to do? \n(1) Attack \n(2) Attempt to Counter  \n(3) Special Ability");
		switch(choice)
		{
		case 1:
			{
			if(compHittable == true)
				{
				compHealth = compHealth - playerAttack;
				System.out.println(playerName + " has hit " + compName + " for " + playerAttack + " health " + compName + " now has " + compHealth + " health left!");
				}
			else if(compCounter == true)
				{
				playerHealth = playerHealth - playerAttack - compAttack;
				System.out.println("The enemy has countered your attack, dealing your own damage, and theirs back onto you");
				compCounter = false;
				compHittable = true;
				}
			break;
			}
		case 2: 
			{
			playerCounter = true;
			System.out.println("You prepare to counter the opponent's attack");
			break;
			}
		case 3: 
			{
			if(playerEnergy == 0)
				{
				System.out.println("I'm sorry you don't have enough energy to cast your ability again.");
				}
			else
				{
				fighter[characterData.character.get(0).getLocation()].ability();
				}
			}
		}
	}
}