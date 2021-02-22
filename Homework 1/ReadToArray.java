import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadToArray {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Files that will contain ints that will be sorted.
		File file = new File("C:\\Users\\jason\\eclipse-workspace\\Homework 1\\src\\arr1.txt");
		File file2 = new File("C:\\Users\\jason\\eclipse-workspace\\Homework 1\\src\\arr2.txt");
		Scanner input = new Scanner(file);
		Scanner input2 = new Scanner(file2);
		int[] arr1;
		int[] arr2;
		// Each file contains 50 numbers, so the arrays are set to have 50 elements
		arr1 = new int[50];
		arr2 = new int[50];
		int i = 0;
		while (input.hasNextInt()) { 
			// This while loop will put the ints into the array from the file.
			arr1[i] = input.nextInt();
			i++;
		}
		int n = arr1.length;
		for (i = 0; i < n - 1; i++) {// These nested for loops will use bubble sort for arr1.
			for (int j = 0; j < n - i - 1; j++) {
				if (arr1[j] > arr1[j + 1]) {

					int temp = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = temp;
				}
			}
		}
		i = 0;
		while (input2.hasNextInt()) {// This while loop will fill arr2 with numbers from file2.
			arr2[i] = input2.nextInt();
			i++;
		}

		int f = arr2.length;

		for (i = 0; i < f - 1; i++) {
// These nested for loops will use selection sort to sort arr2.
			int min = i;
			for (int j = i + 1; j < f; j++)
				if (arr2[j] < arr2[min])
					min = j;

			int temp = arr2[min];
			arr2[min] = arr2[i];
			arr2[i] = temp;
		}

		int[] arr3;
		arr3 = new int[100];
		// arr3 is going to be an array with values from arr1 and arr2,
		// the following for loops will fill arr3 with the appropriate values.
		for (i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		for (i = 50; i < arr3.length; i++) {
			arr3[i] = arr2[i - 50];
		}

		f = arr3.length;

		for (i = 0; i < f - 1; i++) {// The following for loops will sort arr3 using insertion sort.

			int min = i;
			for (int j = i + 1; j < f; j++)
				if (arr3[j] < arr3[min])
					min = j;

			int temp = arr3[min];
			arr3[min] = arr3[i];
			arr3[i] = temp;
		}
		System.out.println("Array 1 Sorted:");
		for (i = 0; i < arr1.length; i++)
			System.out.println(arr1[i]);
		System.out.println("Array 2 Sorted:");
		for (i = 0; i < arr2.length; i++)
			System.out.println(arr2[i]);
		System.out.println("Array 3 Sorted:");
		for (i = 0; i < arr3.length; i++)
			System.out.println(arr3[i]);
	}

}
