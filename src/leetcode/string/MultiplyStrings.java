package leetcode.string;


public class MultiplyStrings {
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static String multiply(String num1, String num2) {
		String result = "";
		String[] strs = new String[num2.length()];//保存中间结果
		int curr = 0 ;
		String zeros = "";
		for( int i = num2.length() - 1 ; i >= 0 ; i --){
			String temp = "";//每次运算的结果
			int b = num2.charAt(i) - 48;
			int addIn = 0 ;//进位
			
			//遍历num1进行运算
			for( int j = num1.length() - 1 ; j >= 0 ; j --){
				curr = addIn + (num1.charAt(j) - 48) * b ;
				addIn = curr / 10 ;
				temp += curr % 10 ;
			}
			temp += zeros ;
			strs[num2.length() - 1 - i] = temp ;
			
			zeros += "0";
		}
		//将中间结果加起来
		for(int i = 0 ; i < strs[strs.length - 1].length() ; i ++){
			int addIn = 0 ;//进位
			int sum = 0 ;//每次加法的和
			for( int j = 0 ; j < strs.length; j ++){
				if( (strs[j].length() - 1 - i) >= 0 )
					sum += (strs[j].charAt(strs[j].length() - 1 - i) - 48);
			}
			sum = (sum + addIn) % 10 ;
			addIn /= 10 ;
			result = sum + result ;
		}
		
		return result ;
    }

	
	public static void main(String[] args) {
		System.out.println(11345 * 111 );
		//   222
		//  3330
		// 11100
		//
		System.out.println(multiply("11345", "111"));
		
	}
}
