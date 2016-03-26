
public class HomeTask2 {
	
	public static void main (String[] args) {
		
		int[] arr = {2, 0, 1, 23, 17, 5, 4, 7, 6};
		int i = 0;
		
		while (i < arr.length -1) {
				
			int a;
			if (arr[i] > arr[i+1]) {
				a = arr[i+1];
				arr[i+1] = arr[i];
				arr[i] = a;
				i = 0;
			} else {
				i++;
			   }		
		}
		for (int elem:arr) {
			System.out.print(elem + " ");	
		}	
	}
}
