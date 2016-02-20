import java.util. Scanner;

public class portfolioClass {
	public static Scanner portFolioScanner = new Scanner(System.in);
	static // declare variables here
	
	String nameVariable;
	static boolean letterVariable;
	static int intletterVariable;
	private char[] progress;
	// declare arrays here
	public final char[] possibleConsenants = {'B','C','D','F','G','H','J','L','M','N','O','P','Q','R','S','T','V','W','X','Z'};
	public final char[] possiblevowels = {'A','E','I','O','U',
	
	// declare objects here
	object1 = new portfolioObject()};
	public static void main(String args[]){
		
		portFolioGuess();
			
		
	}
	
	
	// methods
   public static void portFolioGuess(){
	   System.out.println("What is Your Name ");
		nameVariable = portFolioScanner.nextLine();
		
		System.out.println(" Think of a word that is 10 letters long and is an english word found in the dictionary");
		System.out.println("It can not have any apostraphys or contractions");

   
   }
}



