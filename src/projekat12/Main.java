package projekat12;

public class Main {

	public static void main(String[] args) {
		ConsoleColoring.printInColor("Test", textColors.ANSI_CYAN);
		ConsoleColoring.printInColor("Something else", textColors.ANSI_PURPLE, backgroundColors.ANSI_BLACK_BACKGROUND);
		ConsoleColoring.printInColor("Anything else", textColors.ANSI_GREEN, backgroundColors.ANSI_RED_BACKGROUND);
		/*ConsoleColoring.printInColor("Some exception", null);
		ConsoleColoring.printInColor("Some other exception", null, null);*/
	}

}
