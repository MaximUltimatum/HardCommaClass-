package StabbyMctwoshanks;

import java.util.Scanner;

public class portfolioClass {
		public static Scanner portFolioScanner = new Scanner(System.in);
		static // declare variables here
		boolean intVariable;
		double mathArray;
        static String nameVariable;
		static boolean letterVariable;
		static int intletterVariable;
		static int intVowel;
		static boolean didIGuessWord = false;
		static int wordLength;
		static boolean stopAsk;
		static boolean getallVowels;
		// declare arrays here
		public final static char[] possibleConsenants = {'B','C','D','F','G','H','J','L','M','N','O','P','Q','R','S','T','V','W','X','Z'};
		public final static char[] possibleVowels = {'A','E','I','O','U','Y'};
		public static char[] theWord;
		static portfolioObject object1 = new portfolioObject();
		
		public static void main(String args[]){
			System.out.println("What is Your Name ");
			nameVariable = portFolioScanner.nextLine();
			System.out.println(" Think of a word that is less than 10 letters long and is an english word found in the dictionary");
			System.out.println("It can not have any apostraphys or contractions");
			System.out.println("How long is your word?");
			wordLength = portFolioScanner.nextInt();
			
			
			
			
			for (int i = 0; i < wordLength; i++){
				
				
			}
			Integer num;
			num = new Integer(10);
			portFolioGuessVowels();
			portFolioGuessConsanants();
			theWord[0] = 'z';
		}
		
		
		// methods
	  


	public static void portFolioGuessVowels(){
			while (didIGuessWord == false){
				System.out.println("Does the word have a/an " + possibleVowels[(int) Math.round(Math.random() * 5)]+ " (true/false) ");
				intVariable = portFolioScanner.nextBoolean();
				if(intVariable == false ){
					System.out.println("I will guess again");
				}
				else{
					System.out.println(" How many of those letters does it have?");
					intVowel = portFolioScanner.nextInt();
					int worldLength = 1;
					for (int i = 0; i < worldLength; i++){
						
					}
					
					System.out.println("Did I guess all the vowels? true/false");
					stopAsk = portFolioScanner.nextBoolean();
					if ( getallVowels == true){
						System.out.println(" Moving on to consanants");
					
						}
					}
				}
			}
	 public static void portFolioGuessConsanants() {
		 System.out.println("Does the word have a/an " + possibleConsenants[(int) Math.round(Math.random() * 5)]+ " (true/false) ");
			intVariable = portFolioScanner.nextBoolean();
			if(intVariable == false ){
				System.out.println("I will guess again");
			}
			else{
				System.out.println(" How many of those letters does it have?");
				intVowel = portFolioScanner.nextInt();
				int worldLength = 1;
				for (int i = 0; i < worldLength; i++){
					System.out.println(theWord[i]);
				}
				System.out.println("Did I guess all the consanants?");
					}
				
				}

			
		}  // end class portfolioClass;





