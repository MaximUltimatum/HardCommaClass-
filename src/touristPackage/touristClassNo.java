package touristPackage;

import java.util.Scanner;

	public class touristClassNo {
		
		public static void main(String args[]){
			String touristName;
			int touristNumber;
			
			Scanner touristScanner = new Scanner(System.in);
			
			System.out.println(" How many Tourists are there ");
			touristNumber = touristScanner.nextInt();
				
			for(int i = 0; i < touristNumber; i++){
				Name();
				Title();
			}
		}
		
		public static void Name(){
			Scanner nameScanner = new Scanner(System.in);
			System.out.println("Hello visitor, what is your name and your title");
			String touristName = nameScanner.nextLine();
			String touristTitle = nameScanner.nextLine();
					System.out.println(" Hello " +touristName+ " The" +touristTitle+ "" );
		}
		
		public static void Title(){
			Scanner nameScanner = new Scanner(System.in);
			boolean genderQuestion = nameScanner.nextBoolean();
			System.out.println(" What is your gender");
			System.out.println(" I am of " +genderQuestion+ " gender ");
			Scanner ageScanner = new Scanner(System.in);
			
			if( genderQuestion = true){
				System.out.println(" How old are you ");
				int ageQuestion = ageScanner.nextInt();
				System.out.println(" You are " +ageQuestion+ " Years old");
				System.out.println(" Have an exellent stay");
			}
			else{
				System.out.println(" Have an exellent stay");
			}
		}
		}