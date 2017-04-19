package company.huawei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveAndSort {
	public static void sort(int[] arr){
		Arrays.sort(arr);
		List<Integer> list = new ArrayList<Integer>();
		for(int item : arr){
			if( list.contains(item) == false){
				list.add(item);
				System.out.println(item);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int size = sc.nextInt();
			int[] arr = new int[size];
			for(int i = 0 ; i < size; i ++){
				arr[i] = sc.nextInt();
			}
			sort(arr);
		}
		sc.close();
	}
}