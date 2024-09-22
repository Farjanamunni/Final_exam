package take_home_exam;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Random_number {

	public static void main(String[] args) {
		
				Random random = new Random();
		        int[] numbers = new int[500];

		        
		        for (int i = 0; i < 500; i++) {
		           numbers[i] = random.nextInt(1000); // Random numbers between 0 and 1000
		       
		        
		        }
		        // Sort the array
		        Arrays.sort(numbers);
		        
		   
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the value of N to find the Nth smallest number: ");
		        int n = scanner.nextInt();
		        
		        // Check if N is valid
		        if (n >= 1 && n <= numbers.length) {
		            int nthSmallest = numbers[n - 1]; // Nth smallest is at index N-1
		            System.out.println("The " + n + "th smallest number is: " + nthSmallest);
		        } else {
		            System.out.println("Invalid input! Please enter a number between 1 and 500.");
		        }

		       scanner.close();
    
	}	
	}
