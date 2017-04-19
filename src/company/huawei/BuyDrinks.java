package company.huawei;

import java.util.Scanner;

public class BuyDrinks {
	public static int buy(int size){
		int result = 0;
		while(true){
			if( size == 2){
				result ++;
				break;
			}
			if( size == 1)
				break;
			result += size / 3;
			size = size / 3 + size % 3;
		}
		System.out.println(result);
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int size = sc.nextInt();
			if( size == 0)
				break;
			else
				buy(size);
		}
		sc.close();
	}
}