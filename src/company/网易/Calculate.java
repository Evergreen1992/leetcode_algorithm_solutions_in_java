package company.网易;

import java.util.Scanner;
//表达式计算
//5 +3  * 7
public class Calculate {
	public static void cal(String str){
		if( str == null || str.equals("")){
			System.out.println(0);
			return;
		}
		int count = 0;
		int[] symbo = new int[str.length()];
		for(int i = 0 ; i < str.length(); i ++){
			if( str.charAt(i) == '+'){
				symbo[count++] = 1;
			}
			if( str.charAt(i) == '-'){
				symbo[count++] = 2;
			}
			if( str.charAt(i) == '*'){
				symbo[count++] = 3;
			}
		}
		
		int[] nums = new int[symbo.length + 1];
		count = 0;
		for(int i = 0; i < symbo.length; i ++){
			if( symbo[i] == 0)
				break;
			int num1 = 0 ;
			if( symbo[i] == 1){
				num1 = Integer.parseInt(str.split("\\+")[0]);
				str = str.split("\\+")[1];
			}else if(symbo[i] ==2){
				num1 = Integer.parseInt(str.split("\\-")[0]);
				str = str.split("\\-")[1];
			}else if( symbo[i] == 3){
				num1 = Integer.parseInt(str.split("\\*")[0]);
				str = str.split("\\*")[1];
			}
			
			nums[count++] = num1;
			
		}
		nums[count] = Integer.parseInt(str);
		
		int n1 = nums[0];
		count = 0;// 3 + 5 * 7
		for(int i = 1; i < nums.length; i ++){
			if( symbo[count] == 1){
				n1 = n1 + nums[i];
				count++;
			}else if( symbo[count] == 2){
				n1 = n1 - nums[i];
				count++;
			}else if( symbo[count] == 3){
				n1 = n1 * nums[i];
				count++;
			}
		}
		
		System.out.println(n1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while( sc.hasNext()){
			cal(sc.next());
		}
		sc.close();
	}
}