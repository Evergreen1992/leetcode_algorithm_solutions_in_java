package company.网易;

import java.util.Scanner;
//
/*
3 
2 3 5

1 5 5 9
 */
//
public class 堆砖块 {
	public static void handle(int[] arr){
		int height = 0;
		for(int it : arr)
			height += it;
		if( height % 2 == 1)
			System.out.println("-1");
		else
			height /= 2 ;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n; i ++){
			arr[i] = sc.nextInt();
		}
		handle(arr);
		sc.close();
	}
}