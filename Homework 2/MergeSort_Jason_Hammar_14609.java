import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MergeSort_Jason_Hammar_14609 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int listArr[] = new int[70];
		String filename = "MyList.txt";
		File file = new File(filename);
		Scanner input = new Scanner(file);
		int i = 0;
		while (input.hasNextLine()) {
			listArr[i] = input.nextInt();
			i++;
		}
		
		mergeSort(listArr, 70);
		for(i = 0; i < 70; i++) {
			System.out.println(listArr[i]);
		}
	}

	public static void mergeSort(int[] a, int n) {
		if (n < 2) {
			return;
		}
		int mid = n / 2;
		int[] l = new int[mid];
		int[] r = new int[n - mid];

		for (int i = 0; i < mid; i++) {
			l[i] = a[i];
		}
		for (int i = mid; i < n; i++) {
			r[i - mid] = a[i];
		}
		mergeSort(l, mid);
		mergeSort(r, n - mid);

		merge(a, l, r, mid, n - mid);
	}

	public static void merge(int[] a, int[] l, int[] r, int left, int right) {

		int i = 0, j = 0, k = 0;
		while (i < left && j < right) {
			if (l[i] <= r[j]) {
				a[k++] = l[i++];
			} else {
				a[k++] = r[j++];
			}
		}
		while (i < left) {
			a[k++] = l[i++];
		}
		while (j < right) {
			a[k++] = r[j++];
		}
	}

}
