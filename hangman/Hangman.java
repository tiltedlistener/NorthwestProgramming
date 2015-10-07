package Main;

/**
*	Prep Code
*/
// PICK A WORD

// LOOP
	// LET THE PLAYER GUESS
	
	// IF GUESS == TRUE
		// CHECK IF WORD IS COMPLETE
			// YOU WIN
	// ELSE
		// CHECK IF OUT OF GUESSES
			// YOU LOSE
		// ELSE
			// SUBTRACT A GUESS


public class Hangman {
	
	private String wordToGuess = "taco";
	private int guessCount = 4;
	private boolean gameRunning = true;		
	private GameHelper helper = new GameHelper();
	
	public void playGame() {
		
		while (gameRunning) {
			
			String guess = helper.getUserInpt("Enter Guess: ");
			System.out.println("Guessing " + guess);
			
			if (wordToGuess.indexOf(guess) != -1) {

				System.out.println("Guessed right!");
				wordToGuess = wordToGuess.replace(guess, "");
				
				if (wordToGuess.length() == 0) {
					System.out.println("YOU WON");
					break;
				}
				
			} else {
				guessCount--;
				System.out.println("Guessed Wrong!");
				
				if (guessCount == 0) {
					System.out.println("YOU LOSE :(");
					break;
				}
			}
		}

	}	

}
