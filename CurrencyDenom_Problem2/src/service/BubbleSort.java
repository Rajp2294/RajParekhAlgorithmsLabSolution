package service;

	public class BubbleSort {
		
	public int[] performBubbleSort(int[] arr) { //sorting the array in descending order 
			int size=arr.length;
			int temp=0; 	
			for(int i=0; i < size-1; i++) {
											
				for(int j=0; j < (size-i-1); j++) { 
					if(arr[j] < arr[j+1]) {
						//swap elements
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			return arr;
		}
}
