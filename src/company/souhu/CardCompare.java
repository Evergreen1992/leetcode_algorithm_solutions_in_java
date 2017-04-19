package company.souhu;
/**
KQ3 3Q9
10QA 6102
5810 7KK
632 74J
10102 K77
JKJ 926
68K 27A
*/
import java.util.Scanner;
//豹子>顺子>对子>普通
public class CardCompare {//2 3 4 5 6 7 8 9 10 J Q K A
	public static int convertToNum(char item){
		return 0;
	}
	// 1 -1 -2
	public static void compare(String str1, String str2){
		int[] items1 = new int[3], items2 = new int[3];
		int count = 0;
		for(int i = 0 ; i < str1.length(); i ++){
			if( str1.charAt(i) == '0')
				continue;
			else{
				//items1[count++] = str1.charAt(i);
				//.
			}
		}
		count = 0;
		for(int i = 0 ; i < str2.length(); i ++){
			if( str2.charAt(i) == '0')
				continue;
			else{
				//items2[count++] = str2.charAt(i);
				//.
			}
		}
		//比较大类
		int type1 =0, type2 = 0;
		if( items1[0] == items1[1] && items1[0] == items1[2] && items1[1] == items1[2]){
			type1 = 3;
		}//else if(){
		//	type1 = 2;
		//}else
		//	type1 = 1;
		//比较小类
		int num1 = 0, num2 = 0;
		
		System.out.println(str1 + " -" + str2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while( sc.hasNext()){
			compare(sc.next(), sc.next());
		}
		sc.close();
	}
}
