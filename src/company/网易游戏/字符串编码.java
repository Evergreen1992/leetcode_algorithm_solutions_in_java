package company.网易游戏;

import java.util.Scanner;

//AAAABCCDAA
//4A1B2C1D2A
public class 字符串编码 {
	public static void handle(String str){
		if( str == null || str.equals(""))
			return ;
		char curr = str.charAt(0);
		int count = 1;
		String result = "";
		for(int i = 1; i < str.length(); i ++){
			if( str.charAt(i) == curr){
				count ++ ;
			}else{
				result = result + count + curr ;
				curr = str.charAt(i);
				count = 1;
			}
		}
		result = result + count + curr ;
		System.out.println(result);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		handle(sc.next());
		sc.close();
	}
}