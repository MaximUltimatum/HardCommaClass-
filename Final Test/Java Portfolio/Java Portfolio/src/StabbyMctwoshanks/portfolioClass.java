package StabbyMctwoshanks;

import java.util.Scanner;

public class portfolioClass {
		public static Scanner portFolioScanner = new Scanner(System.in);
		// declare variables here
		static boolean intVariable;
        static String nameVariable;
		static boolean letterVariable;
		static int intletterVariable;
		static int intVowel;
		static boolean didIGuessWord = false;
		static int wordLength;
		static boolean stopAsk = false;
		static boolean getallVowels;
		static int numberLocation;
		static boolean stopAsk2 = false;
		static int intConsenant;
		static boolean stopAskC;
		// declare arrays here
		public final static char[] possibleConsenants = {'B','C','D','F','G','H','J','L','M','N','O','P','Q','R','S','T','V','W','X','Z'};
		public final static char[] possibleVowels = {'A','E','I','O','U','Y'};
		public static char[] theWord = {'*','*','*','*','*','*','*','*','*'};
		static portfolioObject object1 = new portfolioObject();
		
		public static void main(String args[]){
			System.out.println("What is Your Name ");
			nameVariable = portFolioScanner.nextLine();
			boolean letYouGo = false;
			while(letYouGo = false){
				System.out.println(" Think of a word that is less than 10 letters long and is an english word found in the dictionary");
				System.out.println("It can not have any apostraphys or contractions");
				
				System.out.println("How long is the word?");
				wordLength = portFolioScanner.nextInt();
				
				portFolioGuessVowels();
				portFolioGuessConsenants();
				
				System.out.println("Will you come again some time, " + nameVariable);
				letYouGo = portFolioScanner.nextBoolean();
				System.out.println("All right then");
			}
			
		}
		
		
		// methods


	public static void portFolioGuessVowels(){
		while (stopAsk == false){
			char rememberTheCharacter =  possibleVowels[(int) Math.round(Math.random() * 5)];
			
			System.out.println("Does the word have a/an " + rememberTheCharacter + " (true/false) ");
			intVariable = portFolioScanner.nextBoolean();
			
			if(intVariable == false ){
				System.out.println("I will guess again");
				printWord();
			}
			else{
				System.out.println(" How many of those letters does it have?");
				intVowel = portFolioScanner.nextInt();
				for (int v = 0; v < intVowel; v++){
					System.out.println("What space is your letter or letters on?");
					numberLocation = portFolioScanner.nextInt();
					numberLocation--;
					theWord[numberLocation] = rememberTheCharacter;
				}
				System.out.println("Did I guess all the vowels? true/false");
				stopAsk = portFolioScanner.nextBoolean();
			}
				
			if ( stopAsk == true){
				System.out.println(" Moving on to consanants");
			}
			printWord();

		}			
	}

	 public static void portFolioGuessConsenants() {
			System.out.println(" Checkpoint 1");
		 while (stopAsk2 == false){
			 
			 char rememberTheCharacter =  possibleConsenants[(int) Math.round(Math.random() * 19)];
		 		 
		 System.out.println("Does the word have a/an " + rememberTheCharacter + " (true/false) ");
			intVariable = portFolioScanner.nextBoolean();
			if(intVariable == false ){
				System.out.println("I will guess again");
				System.out.println(" Checkpoint 2");
				printWord();
			}
		
			else{
				intVariable = true;
				System.out.println(" How many of those letters does it have?");
				intConsenant = portFolioScanner.nextInt();
				int worldLength = 1;
				for (int v = 0; v < intVowel; v++){
					System.out.println("What space is your letter or letters on?");
					numberLocation = portFolioScanner.nextInt();
					numberLocation--;
					printWord();
					theWord [ numberLocation ] = rememberTheCharacter;
				}
				System.out.println("Did I guess all the consenants?");
				stopAskC = portFolioScanner.nextBoolean();
				if(stopAskC == true  ){
					stopAsk2 = true;
					System.out.println();
					System.out.println("You may go now, please come again" + nameVariable);
				}
				
					}
			
				}
			
	 }
	 			
	 public static void printWord(){
		 System.out.println();
		 for (int i = 0; i < wordLength; i++){
			 char returnedChar = returnABlastedCharacter(i);
			 System.out.print(returnedChar);
		 }
	 }
	 public static char returnABlastedCharacter(int k){
		 char t = theWord[k];
		 return t;
	 }
		}  // end class portfolioClass;