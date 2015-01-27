import java.util.*;
public class fighterRunner
	{
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
		fighter[choice - 1].identity();
		fighter[choice - 1].fight();
		fighter[choice - 1].counter();
		fighter[choice - 1].ability();
		fighter[choice - 1].myFinisher.finalStrike();
		System.out.println("Are you sure you want to play as this fighter?");
		System.out.print("Y or N");
		String yesOrNo = input.next();
		if(yesOrNo.equals("N"));
			{
			characterChoice();
			}
		if(yesOrNo.equals("Y"))
			{
			fillPlayer1();
			}
		else
			{
			System.out.println("Please enter Y or N.");
			}
		}
	
	public static void fillPlayer1()
		{

		}
	}