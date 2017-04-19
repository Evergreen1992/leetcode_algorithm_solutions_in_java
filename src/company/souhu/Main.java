package company.souhu;

import java.util.Scanner;

public class Main {
	public static void count(int[] arr){
		int result = 0 , before = 1, curr = 0;
		if( arr[0] > arr[1])
			before  = 2;
		if( arr[0] <= arr[1])
			before = 1;
		result += before ;
		
		for(int i = 1 ; i < arr.length; i ++){
			if( arr[i] < arr[i - 1]){
				curr = 1;
			}else if( arr[i] > arr[i - 1]){
				curr = before + 1;
			}else{
				curr = before ;
			}
			result += curr ;
			before = curr ;
		}
		
		System.out.println(result);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int size = sc.nextInt();
			int[] arr = new int[size];
			for(int i = 0 ; i < size; i ++){
				arr[i] = sc.nextInt();
			}
			count(arr);
		}
		sc.close();
	}
}