package company.网易游戏;

import java.util.Scanner;

/**
4 2
87 98 79 61
10 27 95 70
20 64 73 29
71 65 15 0

193
 *
 */
public class 最大和 {
	public static void findMax(int[][] arr, int n){
		int max = 0, sum ;
		//横线
		for(int i = 0 ; i < arr.length; i ++){//   0 1 2 3 4 5
			for(int j = 0; j <= arr.length - n; j ++ ){
				sum = 0;
				for(int k = 0; k < n; k ++)
					sum += arr[i][j + k];
				if( sum >= max)
					max = sum ;
			}
		}
		//纵线
		for(int i = 0 ; i < arr.length; i ++){//   0 1 2 3 4 5
			for(int j = 0; j <= arr.length - n; j ++ ){
				sum = 0;
				for(int k = 0; k < n; k ++)
					sum += arr[j + k][i];
				if( sum >= max)
					max = sum ;
			}
		}
		//斜线1
		for(int i = 0; i <= arr.length - n; i ++){
			sum = 0;
			for(int k = 0; k < n; k ++)
				sum += arr[i + k][i + k];
			if( sum >= max)
				max = sum ;
		}
		//斜线2
		for( int i = 0, j = arr.length - 1; i <= arr.length - n; i ++, j --){
			sum = 0;
			for(int k = 0; k < n; k ++){
				sum += arr[i + k][j - k];
			}
			if( sum >= max)
				max = sum ;
		}
		
		System.out.println(max);
	}
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt() ;
		int[][] arr = new int[m][m];
		for(int i = 0; i < m; i ++){
			for(int j = 0; j < m; j ++){
				arr[i][j] = sc.nextInt();
			}
		}
		findMax(arr, n);
		sc.close();*/
		System.out.println("  ".split(" ").length);
		
	}
}