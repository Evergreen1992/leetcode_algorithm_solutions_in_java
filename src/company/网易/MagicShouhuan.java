package company.网易;

import java.util.Scanner;
// 1 2 3
// 3 5 4
// 8 9 7
//魔力手环
public class MagicShouhuan {
	public static void handle(int[] arr, int k){
		for(int i = 1; i <= k; i ++){
			int first = arr[0];
			for(int j = 0; j < arr.length; j ++){
				if( j != arr.length - 1){
					arr[j] = (arr[j] + arr[j + 1] )%100;
				}else{
					arr[j] = (arr[j] + first) % 100;
				}
			}
		}
		for(int i = 0 ; i < arr.length; i ++){
			System.out.print(arr[i]);
			if( i != arr.length - 1)
				System.out.print(" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; i ++){
				arr[i] = sc.nextInt();
			}
			handle(arr, k);
		}
		sc.close();
	}
}