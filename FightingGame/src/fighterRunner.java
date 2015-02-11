import java.util.*;
import java.lang.*;
public class fighterRunner
	{
	static int player = 0;
	static int enemy = 1;
	static int playerOriginalAttack = 0; 
	static int enemyOriginalAttack = 0;
	static Fighter [] fighter = new Fighter [6];
	public static void main(String[] args)
		{
		characterFill();
		characterChoice();
		combat();
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
		if(input.hasNextInt())
			{
			int choice = input.nextInt();
			if((choice < 7) || (choice > 0))
				{
				fighter[choice - 1].name();
				fighter[choice - 1].attack();
				fighter[choice - 1].health();
				fighter[choice - 1].ifFinisher();
				fighter[choice - 1].fight();
				fighter[choice - 1].counter();
				System.out.println("Are you sure you want to play as this fighter?");
				System.out.println("Y or N");
				if(input.hasNext())
					{
					String yesOrNo = input.next();
					if(yesOrNo.equals("N") || yesOrNo.equals("n"))
						{
						characterChoice();
						}
					else if(yesOrNo.equals("Y") || yesOrNo.equals("y"))
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
					else
						{
						System.out.println("Please answer Y or N.");
						characterChoice();
						}
				}
			}
		else
			{
			System.out.println("Please enter an int");
			characterFill();
			characterChoice();
			combat();
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
		playerOriginalAttack = characterData.character.get(player).getAttack();
		enemyOriginalAttack = characterData.character.get(enemy).getAttack();
		if(characterData.character.get(enemy).getSpeed() > characterData.character.get(player).getSpeed())
			{
			characterData.character.get(enemy).setTurn(true);
			}
		else
			{
			characterData.character.get(player).setTurn(true);
			}
		}
	
	public static void combat()
		{
		int playerTurnCheck = characterData.character.get(player).getTurnChecker();
		int enemyTurnCheck = characterData.character.get(enemy).getTurnChecker();
		int playerHealth = characterData.character.get(player).getHealth();
		int playerAttack = characterData.character.get(player).getAttack();
		String playerName = characterData.character.get(player).getName();
		int compHealth = characterData.character.get(enemy).getHealth();
		int compAttack = characterData.character.get(enemy).getAttack();
		String compName = characterData.character.get(enemy).getName();
		boolean compHittable = characterData.character.get(enemy).getHittable();
		boolean playerHittable = characterData.character.get(player).getHittable();
		boolean playerTurn = characterData.character.get(player).getTurn();
		boolean compTurn = characterData.character.get(enemy).getTurn();
		boolean compCounter = characterData.character.get(enemy).getCounter();
		boolean playerCounter = characterData.character.get(player).getCounter();
		int enemyChoice = (int)(Math.random()*3+1);
		int playerEnergy = characterData.character.get(player).getEnergy();
		int compEnergy = characterData.character.get(enemy).getEnergy();
		boolean exit = false;
		int playerCheckerAdd = 0; 
		int enemyCheckerAdd = 0; 
		if(playerTurn == true)
			{
			Scanner input = new Scanner(System.in);
			System.out.println("What would you like to do? \n(1) Attack \n(2) Attempt to Counter  \n(3) Special Ability");
			int choice = input.nextInt();
			switch(choice)
			{
			case 1:
				{
				if(compCounter == false)
					{
					compHealth = enemyHealthLoss(compHealth, playerAttack);
					characterData.character.get(enemy).setHealth(compHealth);
					System.out.println(playerName + " has hit " + compName + " for " + playerAttack + " health " + compName + " now has " + compHealth + " health left!");
					characterData.character.get(0).setTurn(false);
					characterData.character.get(1).setTurn(true);
					}
				else if(compCounter == true)
					{
					playerHealth = playerGotCountered(playerHealth, playerAttack, compAttack);
					characterData.character.get(player).setHealth(playerHealth);
					System.out.println("The enemy has countered your attack, dealing your own damage, and theirs back onto you \nYou now have " + playerHealth + " health.");
					characterData.character.get(enemy).setCounter(false);
					characterData.character.get(enemy).setHittable(true);
					characterData.character.get(0).setTurn(false);
					characterData.character.get(1).setTurn(true);
					}
				break;
				}
			case 2: 
				{
				characterData.character.get(0).setCounter(true);
				System.out.println("You prepare to counter the opponent's attack");
				characterData.character.get(0).setTurn(false);
				characterData.character.get(1).setTurn(true);
				break;
				}
			case 3: 
				{
				if(playerEnergy == 0)
					{
					System.out.println("I'm sorry you don't have enough energy to cast your ability again.");
					characterData.character.get(0).setTurn(false);
					characterData.character.get(1).setTurn(true);
					}
				else
					{
					fighter[characterData.character.get(player).getLocation()].playerFinisher.finisher();
					characterData.character.get(player).setEnergy(playerEnergy - 1);
					characterData.character.get(0).setTurn(false);
					characterData.character.get(1).setTurn(true);
					playerCheckerAdd++;
					}
				break;
				}
			}
			if((playerHealth > 0) && (compHealth > 0))
				{
				if(characterData.character.get(0).getTurnChecker() != 0)
					{
					characterData.character.get(0).setTurnChecker(0);
					System.out.println("Your attack has been reset, and is now back to " + playerOriginalAttack);
					characterData.character.get(0).setAttack(playerOriginalAttack);
					}
				if(playerCheckerAdd != 0)
					{
					characterData.character.get(0).setTurnChecker(1);
					}
				combat();
				}
			else if(playerHealth <= 0)
				{
				while(exit == false)
					{
					System.out.println("YOU HAVE BEEN DEFEATED");
					System.out.println("WOULD YOU LIKE TO PLAY AGAIN? \n(1) TO PLAY AGAIN \n(2) TO EXIT THE GAME");
					Scanner keyboard = new Scanner(System.in);
					int playAgain = keyboard.nextInt();
					if(playAgain == 1)
						{
						characterClear();
						characterFill();
						characterChoice();
						combat();
						}
					else if(playAgain == 2)
						{
						System.out.println("THANK YOU FOR PLAYING");
						exit = true;
						}
					else
						{
						System.out.println("PLEASE SELECT 1 OR 2");
						}
					}
				}
			else if(compHealth <= 0)
				{
				while(exit == false)
					{
					System.out.println("YOU HAVE BEATEN YOUR ENEMY");
					System.out.println("WOULD YOU LIKE TO PLAY AGAIN? \n(1) TO PLAY AGAIN \n(2) TO EXIT THE GAME");
					Scanner keyboard = new Scanner(System.in);
					int playAgain = keyboard.nextInt();
					if(playAgain == 1)
						{
	                    characterClear();
						characterFill();
						characterChoice();
						combat();
						}
					else if(playAgain == 2)
						{
						System.out.println("THANK YOU FOR PLAYING");
						exit = true;
						}
					else
						{
						System.out.println("PLEASE SELECT 1 OR 2");
						}
					}
				}
			}
		else
			{
			switch(enemyChoice)
			{
			case 1:
				{
				if(playerCounter == false)
					{
					playerHealth = playerHealthLoss(playerHealth, compAttack);
					characterData.character.get(player).setHealth(playerHealth);
					System.out.println(compName + " has hit " + playerName + " for " + compAttack + " health " + playerName + " now has " + playerHealth + " health left!");
					characterData.character.get(1).setTurn(false);
					characterData.character.get(0).setTurn(true);
					}
				else if(playerCounter == true)
					{
					compHealth = enemyGotCountered(compHealth, compAttack, playerAttack);
					characterData.character.get(enemy).setHealth(compHealth);
					System.out.println("You have countered the enemy attack, dealing their own damage and yours back to them \nThey now have " + compHealth + " health.");
					characterData.character.get(player).setCounter(false);
					characterData.character.get(player).setHittable(true);
					characterData.character.get(1).setTurn(false);
					characterData.character.get(0).setTurn(true);
					}
				break;
				}
			case 2: 
				{
				characterData.character.get(enemy).setCounter(true);
				System.out.println("The opponent takes a defensive stance");
				characterData.character.get(1).setTurn(false);
				characterData.character.get(0).setTurn(true);
				break;
				}
			case 3: 
				{
				if(compEnergy == 0)
					{
					System.out.println("The enemy tried to channel their rage again, but failed");
					characterData.character.get(1).setTurn(false);
					characterData.character.get(0).setTurn(true);
					}
				else
					{
					fighter[characterData.character.get(enemy).getLocation()].enemyFinisher.finisher();
					characterData.character.get(enemy).setEnergy(compEnergy - 1);
					characterData.character.get(1).setTurn(false);
					characterData.character.get(0).setTurn(true);
					enemyCheckerAdd++;
					}
				break;
				}
			}
			if((playerHealth > 0) && (compHealth > 0))
				{
				if(characterData.character.get(1).getTurnChecker() != 0)
					{
					characterData.character.get(1).setTurnChecker(0);
					System.out.println("The enemy's attack has been reset, and is now back to " + enemyOriginalAttack);
					characterData.character.get(1).setAttack(enemyOriginalAttack);
					}
				if(enemyCheckerAdd != 0)
					{
					characterData.character.get(1).setTurnChecker(1);
					}
				playerTurn = true;
				compTurn = false;
				combat();
				}
			else if(playerHealth <= 0)
				{
				while(exit == false)
					{
					System.out.println("YOU HAVE BEEN DEFEATED");
					System.out.println("WOULD YOU LIKE TO PLAY AGAIN? \n(1) TO PLAY AGAIN \n(2) TO EXIT THE GAME");
					Scanner keyboard = new Scanner(System.in);
					int playAgain = keyboard.nextInt();
					if(playAgain == 1)
						{
						characterClear();
						characterFill();
						characterChoice();
						combat();
						}
					else if(playAgain == 2)
						{
						System.out.println("THANK YOU FOR PLAYING");
						exit = true;
						}
					else
						{
						System.out.println("PLEASE SELECT 1 OR 2");
						}
					}
				}
			else if(compHealth <= 0)
				{
				while(exit == false)
					{
					System.out.println("YOU HAVE BEATEN YOUR ENEMY");
					System.out.println("WOULD YOU LIKE TO PLAY AGAIN? \n(1) TO PLAY AGAIN \n(2) TO EXIT THE GAME");
					Scanner keyboard = new Scanner(System.in);
					if(keyboard.hasNextInt())
						{
						int playAgain = keyboard.nextInt();
						if(playAgain == 1)
							{
		                    characterClear();
							characterFill();
							characterChoice();
							combat();
							}
						else if(playAgain == 2)
							{
							System.out.println("THANK YOU FOR PLAYING");
							exit = true;
							}
						else
							{
							System.out.println("PLEASE SELECT 1 OR 2");
							}
						}
					else
						{
						System.out.println("Please enter 1 or 2");
						}
					}
				}
			}
	}
	public static int playerHealthLoss(int playerHealth, int enemyDamage)
		{
		playerHealth = playerHealth - enemyDamage;
		return playerHealth;
		}
	
	public static int enemyHealthLoss(int enemyHealth, int playerDamage)
		{
		enemyHealth = enemyHealth - playerDamage;
		return enemyHealth;
		}
	
	public static int playerGotCountered(int playerHealth, int playerDamage, int enemyDamage)
		{
		playerHealth = playerHealth - (playerDamage + enemyDamage);
		return playerHealth;
		}
	
	public static int enemyGotCountered(int enemyHealth, int playerDamage, int enemyDamage)
		{
		enemyHealth = enemyHealth - (playerDamage + enemyDamage);
		return enemyHealth;
		}
	public static void characterClear()
		{
		characterData.character.remove(0);
		characterData.character.remove(0);
		}

}