package Main;

import java.util.Random;

public class Hangman {

	private String chosenWord = null;
	private int guessesLeft;
	private boolean testingState = true;
	
	private String[] wordList = {"taco", "java"};
	
	public void playGame() {
		if (chooseWordAtStart()) {
			testingState = false;
			setGuess(chosenWord.length() + 2);
			startGame();
		} else {
			System.out.println("Game started with an Error. Terminating.");
		}		
	}
	
	public boolean chooseWordAtStart() {
		// Choose a random number based on the size of our array
		Random dice = new Random(); 
		int n = dice.nextInt(wordList.length); 
		
		setWord(wordList[n]);
		
		// Make sure a word was correctly set
		if (chosenWord != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void setWord(String word) {
		chosenWord = word;
	}
	
	public void setGuess(int guesses) {
		guessesLeft = guesses;
	}	
	
	public void startGame() {
		GameHelper helper = new GameHelper();
		boolean running = true;
		while(running) {
			String result = helper.getUserInpt("Enter guess: ");
			String answerState = processGuess(result);
			if (answerState == "win" || answerState == "lost") {
				running = false;
			}
		}
	}
	
	public String processGuess(String input) {
		
		// Make sure string is only one character
		if (input.length() > 1) {
			input = input.substring(0, 1);
		}
		
		if (checkGuess(input)) {
			if (didWeWin()) {
				alertWin();
				return "win";
			}
			System.out.println("Correct Answer");
			return "correct";
		} else {
			if (didWeLose()) {
				alertLost();
				return "lost";
			}
			System.out.println("Incorrect Answer");
			return "incorrect";
		}
		
	}
	
	public boolean checkGuess(String letter) {
		if (chosenWord.indexOf(letter) >= 0) {
			removeCharactersFromString(letter);
			return true;
		} else {
			guessesLeft--;
			return false;
		}		
	}
	
	public void removeCharactersFromString(String letter) {
		chosenWord = chosenWord.replace(letter, "");
	}
	
	public boolean checkForEmptyString() {		
		if (chosenWord.length() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkIfGuessesLeft() {
		if (guessesLeft > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public boolean didWeWin() {
		if (checkForEmptyString()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean didWeLose() {
		if (!checkIfGuessesLeft()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void alertWin() {
		if (!testingState) {
			System.out.println("GAME WON!!!");
		}		
	}
	
	public void alertLost() {
		if (!testingState) {
			System.out.println("You died. :(");
		}			
	}
	
}
