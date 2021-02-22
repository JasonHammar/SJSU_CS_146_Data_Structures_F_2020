import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuickSort_Jason_Hammar_14609 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int listArr[] = new int[70];
		String filename = "MyList.txt";
		File file = new File(filename);
		Scanner input = new Scanner(file);
		int i = 0;
		while(input.hasNextLine()) {
			listArr[i] = input.nextInt();
			i++;
		}
		quickSort(listArr, 0, 69);
		for(i = 0; i < 70; i++) {
			System.out.println(listArr[i]);
		}
	}

	public static void quickSort(int arr[], int low, int high){
	    if (low < high)
	    {
	        /* pi is partitioning index, arr[pi] is now
	           at right place */
	        int pi = partition(arr, low, high);

	        quickSort(arr, low, pi - 1);  // Before pi
	        quickSort(arr, pi + 1, high); // After pi
	    }
	}
	public static int partition (int arr[], int low, int high)
	{
	    // pivot (Element to be placed at right position)
	    int pivot = arr[high];  
	 
	    int i = (low - 1);  // Index of smaller element

	    for (int j = low; j <= high- 1; j++)
	    {
	        // If current element is smaller than the pivot
	        if (arr[j] < pivot)
	        {
	            i++;    // increment index of smaller element
	            //swap arr[i] and arr[j]
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	            
	        }
	    }
	    //swap arr[i + 1] and arr[high])
	    int temp = arr[i + 1];
	    arr[i + 1] = arr[high];
	    arr[high] = temp;
	    return (i + 1);
	}

}
