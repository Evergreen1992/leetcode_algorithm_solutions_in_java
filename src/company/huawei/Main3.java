package company.huawei;

import java.util.Scanner;

public class Main3 {
	public static void run(int a, int b){
		int[][] dist = {
				{0,2,10,5,3,-1},
				{-1,0,12,-1,-1,10},
				{-1,-1,0,-17,-1},
				{2,-1,-1,0,2,-1},
				{4,-1,-1,1,0,-1},
				{3,-1,1,-1,2,0}
		};
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int a = in.nextInt();
			int b = in.nextInt() ;
			run(a,b);
		}
	}
}