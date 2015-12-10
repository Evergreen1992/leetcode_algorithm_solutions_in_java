package leetcode.string;


public class BasicCalculatorII {
	//1+3+12*2*1+2
	public static int calculate(String s) {
		String tempStr = ""  ;
		int result = 0 ;
		StringBuffer sb = new StringBuffer();
		//去除空格
		for( int i = 0 ; i < s.length(); i ++){
			if( s.charAt(i) == ' '){
				continue;
			}else if( s.charAt(i) == '-'){
				sb.append("*-");
			}else if( s.charAt(i) == '/'){
				sb.append("*/");
			}else{
				sb.append(s.charAt(i));
			}
		}
		tempStr = sb.toString();
		for( String subString : tempStr.split("\\+")){
			result += divideAndCount(subString);
		}
		
        return result ;
    }
	
	public static int divideAndCount(String str){
		System.out.println("计算" + str);
		if( str.charAt(0) == '-')
			return -Integer.parseInt(str);
		
		if( str.charAt(0) == '/')
			return 1 / Integer.parseInt(str);
		
		return  0;
	}
	
	public static void main(String[] args) {
		System.out.println(calculate("1-14/3*2"));
	}
}