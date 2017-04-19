package BasicAlgorithms;

public class QuickSort {
	public static void sort(int left, int right, int[] arr){
		if( left >= right)
			return ;
		
		int i = left , j = right ,temp = arr[i];
		while(i != j){
			while(arr[j] >= temp && i < j)
				j -- ;
			while(arr[i] <= temp && i < j )
				i ++;
			if( i < j){
				int tt = arr[i];
				arr[i] = arr[j];
				arr[j] = tt ;
			}
		}
		arr[left] = arr[i];
		arr[i] = temp ;
		sort(left, i - 1, arr);
		sort(i + 1, right, arr);
	}

	public static void main(String[] args) {
		int[] arr = new int[]{2,4,6,8,1,3,5,7,10,9};
		sort(0, arr.length - 1, arr);
		for(int item : arr){
			System.out.print(item + ",");
		}
		System.out.println();
	}
}
