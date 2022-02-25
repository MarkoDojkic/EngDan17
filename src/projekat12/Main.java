package projekat12;

public class Main {

	public static void main(String[] args) {
		//For eclipse install this: https://marketplace.eclipse.org/content/ansi-escape-console
		ConsoleColoring.printInColor("Test", textColors.ANSI_RED);
		ConsoleColoring.printInColor("Something else", textColors.ANSI_PURPLE, backgroundColors.ANSI_BLACK_BACKGROUND);
		ConsoleColoring.printInColor("Anything else", textColors.ANSI_GREEN, backgroundColors.ANSI_RED_BACKGROUND);
		ConsoleColoring.printInColor("Some exception", "nista");
		ConsoleColoring.printInColor("Some other exception", textColors.ANSI_GREEN, "eerro");
	}

}
