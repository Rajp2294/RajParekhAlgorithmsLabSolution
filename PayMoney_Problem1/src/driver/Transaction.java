package driver;

import java.util.Scanner;

public class Transaction {
	
	public static void main(String[] args) { //main method
		
		Scanner sc = new Scanner(System.in); //creation of scanner object to take input.
		System.out.println("Enter the size of transaction array");		
		int size = sc.nextInt();
		
		int arr[] = new int[size]; 	//Initializing an array of the input size
		System.out.println("Enter the values of array"); 		
		for (int i = 0;i < size; i++) {
			arr[i]=sc.nextInt(); 
		}
	
		System.out.println("Enter the total number of targets that needs to be achieved");
		int targetNumber = sc.nextInt();
		
		while(targetNumber-- != 0) { //logic block
			int flag = 0;
			long target;
			System.out.println("Enter the value of the target");
			target = sc.nextInt();
			long sum = 0;
			for (int i = 0; i < size; i++) { //linear iteration, linear searching
				sum += arr[i];
				if (sum >= target) {
					System.out.println("Target achieved after " + (i+1) + " transactions ");
					flag = 1;
					break;
				}
			} //MergeSort was a suggestion from Mentor but using Merge sort, sorts the array values and gives
			 //different output than required in the test case so avoided.
			
			if (flag == 0) {
				System.out.println("Given target not achieved");
			}		
		}
		sc.close();
		}
	
	}
	

