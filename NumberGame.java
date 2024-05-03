import java.util.Scanner;
import java.util.Random;

public class NumberGame 
{
    public static void main(String[] args) 
	{
        Scanner s1 = new Scanner(System.in);
        Random r1 = new Random();

        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 7;
        int score = 0;
        boolean playAgain = true;
		
		System.out.println("");
        System.out.println("                        Welcome to the Number Game!                ");
		System.out.println("");
        System.out.println("Try to guess the number between " + minRange + " and " + maxRange + ".");

        while (playAgain) 
		{
            int randomNumber = r1.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean guessedCorrectly = false;

            while (attempts < maxAttempts && !guessedCorrectly) 
			{
                System.out.print("Enter your guess (attempt " + (attempts + 1) + "/" + maxAttempts + "): ");
                int guess = s1.nextInt();

                if (guess == randomNumber) 
				{
                    System.out.println("Congratulations! You guessed the correct number " + randomNumber + "!");
                    guessedCorrectly = true;
                } 
				else if (guess < randomNumber) 
				{
                    System.out.println("Too low. Try again.");
                } 
				else 
				{
                    System.out.println("Too high. Try again.");
                }

                attempts++;
            }

            if (!guessedCorrectly) 
			{
                System.out.println("Sorry, you've used all your attempts. The correct number was: " + randomNumber);
            } 
			else 
			{
                score++;
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = s1.next().toLowerCase();
            if (!playAgainInput.equals("y")) 
			{
                playAgain = false;
            }
        }

        System.out.println("Game over Buddy! Your score is: " + score);
        s1.close(); 
    }
}
