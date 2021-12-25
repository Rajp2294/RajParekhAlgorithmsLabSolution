package driver;
import service.CountTheNotes;
import service.BubbleSort;
import java.util.Scanner;

public class CurrencyDenomRunner {
	public static void main(String[] args) {
		
		BubbleSort bubbleSortImplementation = new BubbleSort();
		CountTheNotes notesCount = new CountTheNotes();
		
		System.out.println("Enter the size of currency denominations");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();		
		int[] notes = new int[size]; 
		System.out.println("Enter the currency denominations value");
		for(int i = 0;i < size; i++) {
			notes[i]=sc.nextInt();
		}		
		System.out.println("Enter the amount you want to pay: ");
		int amount = sc.nextInt();
		bubbleSortImplementation.performBubbleSort(notes); 
		notesCount.notesCountImplementation(notes, amount);	
		sc.close();
	}
}
