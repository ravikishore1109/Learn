import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
	public static void main(String[] args) {
		Random random=new Random();
		int number=random.nextInt(100)+1;
		int guessCount=0;
		System.out.println("Guess the number between 1-100");
		while(true) {
			guessCount++;
			@SuppressWarnings("resource")
			Scanner scanner=new Scanner(System.in);
			int guess=scanner.nextInt();
			if(guess==number) {
				System.out.println("Correct! You have found in "+guessCount+" Guesses");
				break;
			} if (guess>number) {
				System.out.println("Wrong guess. Your guess is Large. Guess Again");
			} else {
				System.out.println("Wrong guess. Your guess is Small. Guess Again");	
			}
		}
	}
}
