package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		System.out.println("How much money did you start with?");
		int startAmount = in.nextInt();
		System.out.println("Win probability?");
		double winChance = in.nextDouble();
		System.out.println("What is the Win Limit?");
		double winLimit = in.nextDouble();
		System.out.println("How many days did you play?");
		int days = in.nextInt();
		
		
		
		for (int i=1;i<=days;i++)
		{
			int rounds = 0;
			int currentAmount = startAmount;
		while (currentAmount > 0 && currentAmount < winLimit){ {
			double x = Math.random	();
		if (x < winChance)
			{
			currentAmount--;
			}
		else 
			{
			currentAmount++;
			} 
		rounds++;
		}
		}

		}
		if (currentAmount == 0)
			System.out.println("Simulation" + i + ": " + rounds + " LOSE");
			else {
			System.out.println("Simulation" + i + ": " + rounds + " WIN");
		}
	}

}
