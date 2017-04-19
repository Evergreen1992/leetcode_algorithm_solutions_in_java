package company.huawei;

import java.util.Scanner;

public class Solution {
	public static int convert(String str){
		int result = 0, flag = 1;
		for(int i = str.length() - 1; i >=0; i --){
			if( str.charAt(i) == 'x')
				break;
			char item = str.charAt(i);
			if( item >= '0' && item <= '9'){
				result += (item - '0') * flag ;
			}else{
				result += ((item - 'A') + 10)  * flag ;
			}
			flag *= 16;
		}
		System.out.println(result);
		return result;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = null ;
		while(sc.hasNextLine()){
			str = sc.nextLine();
			convert(str);
		}
		sc.close();
	}
}