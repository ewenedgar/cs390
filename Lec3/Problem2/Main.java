package Problem2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
		LocalDate birthday= LocalDate.now();
	    String firstName=null, lastName=null;
	    HeartRates heartRate;
		Scanner scanner = new Scanner(System.in);
       
        
        	 System.out.println("Please enter your first name: ");
        	 firstName = scanner.nextLine();
        	 
             
             System.out.println("Please enter your last name: ");
             lastName = scanner.nextLine();
             
             
            System.out.println("Please enter your birthday "
                    + "in yyyy-MM-dd format (e.g. 1989-4-14): ");
            String input = scanner.nextLine();
            try {
                birthday = LocalDate.parse(input, formatter);
                //System.out.println(LocalDate.now());
                heartRate = new HeartRates(firstName, lastName, birthday);
                
               System.out.println(heartRate.MHR());
               System.out.println(heartRate.THR());
               System.out.println(heartRate.toString());
                
               
            } catch(DateTimeParseException e) {
                System.out.println("Error! Please try again");
            
            scanner.close();
        }
        
	}

}
