package company.网易;

import java.math.BigInteger;
import java.util.Scanner;
//9999999X
public class 分饼干 {
	public static void handle(String src, int n){
		 
		int count = 0;
		BigInteger bg = BigInteger.valueOf(n);
		for(int i = 0 ; i < 9; i ++){
			if( new BigInteger(src.replace("X", i + "")).mod(bg).intValue() == 0)
				count ++ ;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//while( sc.hasNext()){
			handle(sc.next(), sc.nextInt());
		//}
		sc.close();
	}

}