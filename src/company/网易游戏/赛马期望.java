package company.网易游戏;

import java.util.Scanner;

public class 赛马期望 {
	public static void handle(int n){
		double result = 0;
		for(int i = 1 ; i <= n; i ++){
			result += (double)1/i;
		}
		System.out.printf("%.4f\n",result);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while( sc.hasNext()){
			handle(sc.nextInt());
		}
		sc.close();
	}

}