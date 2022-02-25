package projekat12;

public class ConsoleColoring implements textColors, backgroundColors {
	
	public static void printInColor(String outputText, String textColor) {
		if(!textColor.matches("\u001B\\[[;\\d]*[ -/]*[@-~]")) throw new UnknownColorException(textColor + " is not valid console text color!"); //\u001B\\[[;\\d]*[ -/]*[@-~]
		System.out.println(textColor + outputText + textColors.ANSI_RESET);
	}
	
	public static void printInColor(String outputText, String textColor, String backgroundColor) {
		if(!textColor.matches("\u001B\\[[;\\d]*[ -/]*[@-~]")) throw new UnknownColorException(textColor + " is not valid console text color!"); //\u001B\\[[;\\d]*[ -/]*[@-~]
		if(!backgroundColor.matches("\u001B\\[[;\\d]*[ -/]*[@-~]")) throw new UnknownColorException(backgroundColor + " is not valid console background color!"); //\u001B\\[[;\\d]*[ -/]*[@-~]
		System.out.println(textColor + backgroundColor + outputText + textColors.ANSI_RESET + backgroundColors.ANSI_WHITE_BACKGROUND);
	}
}
