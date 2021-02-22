import java.util.Scanner;
public class SortArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		arr = new int[10];// Initializes all elements in the array to chosen numbers.
		arr[0] = 12;
		arr[1] = 21;
		arr[2] = 34;
		arr[3] = 2;
		arr[4] = 5;
		arr[5] = 67;
		arr[6] = 31;
		arr[7] = 9;
		arr[8] = 87;
		arr[9] = 94;
		int f = arr.length;

		for (int i = 0; i < f - 1; i++) {// This is the selection sort algorithm used to sort the array.

			int min = i;
			for (int j = i + 1; j < f; j++)
				if (arr[j] < arr[min])
					min = j;

			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		// The below code will allow the user to search for a value in the array by typing in what they want to find,
		// and will use binary search to find it. Binary search is its own function.
		Scanner inp = new Scanner(System.in);
		System.out.println("Which number do you want to look for?");
		int lookNum = inp.nextInt();
		
		if(binarySearch(arr, 0, arr.length - 1, lookNum) != -1) {
			System.out.println("Number Found");
		} else {
			System.out.println("Number not found!");
		}
		
	}
	
	static int binarySearch(int arr[], int l, int r, int x) { 
		// Binary search will help find the number in the array that the user is searcing for.
		// It will start in the middle then work its way up or down the list, depending on where the number is.
        if (r >= l) { 
            int mid = l + (r - l) / 2;  
            if (arr[mid] == x) 
                return mid; 
  
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
  
            
            return binarySearch(arr, mid + 1, r, x); 
        } 
  
        
        return -1; 
    }
	
	

}
