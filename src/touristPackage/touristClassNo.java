package touristPackage;

import java.util.Scanner;

	public class touristClassNo {
		
		private static Scanner totalTouristScanner = new Scanner(System.in);

		public static void main(String args[]){
			int touristNumber;
			
			
			System.out.println(" How many Tourists are there ");
			touristNumber = 0;
			try {
				touristNumber = Integer.parseInt(totalTouristScanner.nextLine());
			} catch (NumberFormatException e) {
			    e.printStackTrace();
			}
				
			for(int i = 0; i < touristNumber; i++){
				System.out.println("CHECKPOINT 2"); // TODO checkpoint
				Name();
				System.out.println("CHECKPOINT 1"); // TODO checkpoint
				Title();
			}
			totalTouristScanner.close();
		}
		
		public static void Name(){
			System.out.println("Hello visitor, what is your name");
			String touristName = totalTouristScanner.nextLine();
			System.out.println("... And your title?");
			String touristTitle = totalTouristScanner.nextLine();
			System.out.println(" Thank you, " +touristName+ " the " +touristTitle+ "" );
		}
		
		public static void Title(){
			System.out.println("What is your gender (Male/Female)");
			String genderQuestion = totalTouristScanner.nextLine().trim();
			System.out.println("You are of the " +genderQuestion+ " gender ");
			System.out.println("CHECKPOINT 3");  // TODO checkpoint
			if(genderQuestion.equalsIgnoreCase("Male")){
				System.out.println(" How old are you ");
				int ageQuestion = 0;
				try {
					ageQuestion = Integer.parseInt(totalTouristScanner.nextLine());
				} catch (NumberFormatException e) {
				    e.printStackTrace();
				}
				System.out.println(" You are " +ageQuestion+ " Years old");
				System.out.println(" Have an exellent stay");
			}
			else{
				System.out.println(" Have an exellent stay");
			}
		}
	}