package company.sougou;

import java.util.Scanner;
/*
3 5
5 1 8 5 2
1 3 10 3 3
7 8 5 5 16
 */
public class MatMax {
	public static int get(int[][] mat, int m, int n){
		int re = 1;
		for(int j = 0; j < mat[m].length; j ++){
			if( j != n)
				re *= mat[m][j];
		}
		for(int j = 0; j < mat.length; j ++){
			if( j != m)
				re *= mat[j][n];
		}
		return re;
	}
	public static void max(int[][] mat){
		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i < mat.length; i ++){
			for(int j = 0 ; j < mat[i].length; j ++){
				int re = get(mat,i,j);
				if( re > max)
					max = re ;
			}
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while( sc.hasNext()){
			int m = sc.nextInt();
			int n = sc.nextInt();
			int[][] mat = new int[m][n];
			for(int i = 0 ; i < m; i ++){
				for(int j = 0 ; j < n; j ++){
					mat[i][j] = sc.nextInt();
				}
			}
			max(mat);
		}
		sc.close();
	}
}