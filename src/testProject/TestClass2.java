package testProject;
import java.util.Scanner;
public class TestClass2 {
	public static void main(String args[]){
		Scanner surveyScanner = new Scanner(System.in);
		System.out.println(" Do you like bacon ? True/False ");
		testClass1.foodQuestion = surveyScanner.nextBoolean();
		
		if (testClass1.foodQuestion){
			System.out.println(" You like bacon ");	
		}	
		else{
			System.out.println("You do not like bacon");
		}
		
		System.out.println("Do you like chocolate? True/False ");
		testClass1.candyQuestion = surveyScanner.nextBoolean();
		
		if (testClass1.candyQuestion){
			System.out.println(" You like chocolate");
		}
		else{
			System.out.println("You do not like chocolate"); 
		}
		
		System.out.println("Do you like eggs. True/False");
		testClass1.eggQuestion = surveyScanner.nextBoolean();
		
		if (testClass1.eggQuestion){
			System.out.println("You like eggs");
		}
		else{
			System.out.println(" You do not like eggs ");    
		}
			
	}
}
