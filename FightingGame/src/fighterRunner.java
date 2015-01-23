import java.util.*;
public class fighterRunner
	{
	public static void main(String[] args)
		{
		Scanner input = new Scanner(System.in);
		Fighter [] fighter = new Fighter [6];
		fighter[0] = new Sahira();
		fighter[1] = new Lucaror();
		fighter[2] = new Bruce();
		fighter[3] = new Golomech();
		fighter[4] = new Shyra();
		fighter[5] = new Auriel();

	System.out.println("Which fighter would you like?");
	System.out.println("1. Sahira");
	System.out.println("2. Lucaror");
	System.out.println("3. Bruce");
	System.out.println("4. Golomech");
	System.out.println("5. Shyra");
	System.out.println("6. Auriel");
	int choice = input.nextInt();	
	fighter[choice - 1].identity();
	fighter[choice - 1].fight();
	fighter[choice - 1].counter();
	fighter[choice - 1].ability();
	fighter[choice - 1].myFinisher.finalStrike();
	fighter[choice - 1].superChecker();
		
			
		}
	}