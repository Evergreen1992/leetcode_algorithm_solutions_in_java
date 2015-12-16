package leetcode.string;

public class MultiplyStrings {
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static String multiply(String num1, String num2) {
		if( num1 == null || num1.length() == 0 || num2 == null || num2.length() == 0)
			return "0";
		if( num1.equals("0") || num2.equals("0"))
			return "0";
		String result = "";
		String[] strs = new String[num2.length()];//保存中间结果
		int curr = 0 , addIn = 0 ;//每次运算结果和进位
		String zeros = "";
		for( int i = num2.length() - 1 ; i >= 0 ; i --){
			String temp = "";//每次运算的结果
			int b = num2.charAt(i) - 48;
			//addIn = 0 ;//进位
			
			//遍历num1进行运算
			for( int j = num1.length() - 1 ; j >= 0 ; j --){
				curr = addIn + (num1.charAt(j) - 48) * b ;
				addIn = curr / 10 ;
				temp = curr % 10 + temp;
			}
			temp += zeros ;
			if( addIn > 0  )
				temp = addIn + temp ;
			strs[num2.length() - 1 - i] = temp ;
			addIn /= 10 ;
			zeros += "0";
		}
		
		addIn = 0 ;//进位
		//将中间结果加起来
		for(int i = 0 ; i < strs[strs.length - 1].length() ; i ++){
			int sum = 0 ;//每次加法的和
			for( int j = 0 ; j < strs.length; j ++){
				if( (strs[j].length() - 1 - i) >= 0 ){
					sum += (strs[j].charAt(strs[j].length() - 1 - i) - 48);
				}else{
					sum += 0 ;
				}
			}
			sum = sum + addIn ;
			result = sum % 10 + result ;
			addIn = sum / 10 ;
		}
		if( addIn > 0 )
			result = addIn + result ;
		
		return result ;
    }

	
	public static void main(String[] args) {
		System.out.println(999 * 999);
		//   222
		//  3330
		// 11100
		//
		System.out.println(multiply("999", "999"));
		
	}
}
