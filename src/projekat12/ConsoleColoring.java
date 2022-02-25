package projekat12;

public class ConsoleColoring implements textColors, backgroundColors {
	
	public static void printInColor(String outputText, String textColor) {
		//if(textColor.equals(null)) throw new UnknownColorException("Null");
		System.out.println(textColor + outputText + textColors.ANSI_RESET);
	}
	
	public static void printInColor(String outputText, String textColor, String backgroundColor) {
		//if(textColor.equals(null) || backgroundColor.equals(null)) throw new UnknownColorException("Null");
		System.out.println(textColor + backgroundColor + outputText + textColors.ANSI_RESET + backgroundColors.ANSI_WHITE_BACKGROUND);
	}
}
