package leetcode.math;

public class AddStrings {
	public static String addStrings(String num1, String num2) {
		String result = "";
		int carry = 0;
		for( int i = num1.length() - 1, j = num2.length() - 1; i >=0 || j >= 0; i --, j --){
			int item = 0 ;
			if( i >= 0){
				item += (num1.charAt(i) - '0')  ;
			}if( j >= 0){
				item += (num2.charAt(j) - '0')  ;
			}
			item += carry ;
			result = item % 10 + result  ;
			carry = item / 10 ;
		}
		if( carry > 0)
			result = carry + result ;
		return result;
    }
	public static void main(String[] args) {
		System.out.println(addStrings("6913259244", "71103343"));
	}

}
