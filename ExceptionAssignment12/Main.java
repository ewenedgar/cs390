package ExceptionAssignment12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        boolean flag = false;
        while(!flag) {
        try {
            System.out.println("Enter the score (0 - 100): ");
            score = scanner.nextInt();

            if (score < 0 || score > 100) {
                throw new UnsupportedOperationException("Score must be in the range of 0-100.");
            }

            System.out.println("Entered score: " + score);
            flag = true;
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer value.");
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
        }
        
        scanner.close();
    }
}
