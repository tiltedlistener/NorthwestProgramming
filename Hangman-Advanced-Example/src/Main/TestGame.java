package Main;

public class TestGame {

	public static void main(String[] args) {
		
		Hangman game = new Hangman();
		
		// Check that letters are correctly identified
		game.setWord("taco");
		if (game.checkGuess("t")) {
			System.out.println("Letter is correctly present");
		} else {
			System.out.println("Fail");
		}
		
		if (!game.checkGuess("z")) {
			System.out.println("Letter is correctly absent");
		} else {
			System.out.println("Fail");
		}
		
		// Remove letters and check for empty length
		game.setWord("t");
		game.removeCharactersFromString("t");
		if (game.checkForEmptyString()) {
			System.out.println("String is correctly empty");
		} else {
			System.out.println("Fail");
		}
		
		// Check for guesses left for incorrect
		game.setGuess(1);
		game.setWord("taco");
		game.checkGuess("z");
		
		if (game.checkIfGuessesLeft()) {
			System.out.println("Fail");
		} else {
			System.out.println("Guesses left is correctly zero");
		}
		
		// Check guesses left of correct
		game.setGuess(1);
		game.setWord("taco");
		game.checkGuess("t");
		
		if (game.checkIfGuessesLeft()) {
			System.out.println("Guesses left is correctly more than zero");
		} else {
			System.out.println("Fail");
		}
		
		// Check for Win
		game.setWord("t");
		game.setGuess(2);
		game.checkGuess("t");
		if (game.didWeWin()) {
			System.out.println("You correctly WON");
		} else {
			System.out.println("Fail");
		}
		
		// Check for loss
		game.setWord("t");
		game.setGuess(1);
		game.checkGuess("z");
		if (game.didWeLose()) {
			System.out.println("You correctly LOST");
		} else {
			System.out.println("Fail");
		}		
		
		
		// Check word is chosen at start
		game = new Hangman();
		if (game.chooseWordAtStart()) {
			System.out.println("Word Succesfully chosen");
		} else {
			System.out.println("FAIL");
		}
		
		// Correctly Process a win
		game = new Hangman();
		game.setGuess(2);
		game.setWord("t");
		
		if (game.processGuess("t") == "win") {
			System.out.println("Correctly Won");
		} else {
			System.out.println("FAIL");
		}
		
		// Correctly process a loss
		game = new Hangman();
		game.setGuess(1);
		game.setWord("t");
		
		if (game.processGuess("z") == "lost") {
			System.out.println("Correctly Lost");
		} else {
			System.out.println("FAIL");
		}		
		
		// Correctly show multiple guesses with win
		game = new Hangman();
		game.setGuess(2);
		game.setWord("ta");
		
		if (game.processGuess("t") == "correct") {
			System.out.println("Correctly Guessed");
		} else {
			System.out.println("FAIL");
		}
		
		if (game.processGuess("a") == "win") {
			System.out.println("Correctly Won");
		} else {
			System.out.println("FAIL");
		}		
		
		// Correctly show multiple guesses with a Loss
		game = new Hangman();
		game.setGuess(2);
		game.setWord("ta");
		
		if (game.processGuess("b") == "incorrect") {
			System.out.println("Incorrectly Guessed");
		} else {
			System.out.println("FAIL");
		}	
		
		if (game.processGuess("z") == "lost") {
			System.out.println("Correctly Lost");
		} else {
			System.out.println("FAIL");
		}		
		
		
	}	
	
}
