import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;


public class Kostka {

//	private static final SecureRandom randomNumbers = new SecureRandom();
	private static final Random randomNumbers = new Random();
	private enum Status {CONTINUE, WON, LOST};
	
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 3;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	
	public static void main(String[] args) {
		int myPoints = 0;
		Status gameStatus; 
		
		Scanner someInput = new Scanner(System.in);
		
		while (true) {
			rollDice();
			someInput.nextLine();
		}
		
		// TODO Auto-generated method stub
		

	}

	private static void rollDice() {
		// TODO Auto-generated method stub
		int singleRoll = 1+randomNumbers.nextInt(6); 
		System.out.printf("%n%s%d%n", "Rolling result: ", singleRoll);
		System.console();
		//return singleRoll;
	}

}
