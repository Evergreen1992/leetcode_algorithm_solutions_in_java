package offer.algorithms;

public class StrToInt {
	public static int StrToInt1(String str) {
		if( str == null || str.equals(""))
			return 0;
        char[] ch = str.toCharArray();
        int result = 0, n = 1;
        for(int i = ch.length - 1; i > 0 ; i --){
        	if( ch[i] >= '0' && ch[i] <= '9'){
        		result += (ch[i] - '0') * n;
        		n *= 10;
        	}else
        		return 0;
        }
        if( ch[0] == '+'){
        	
        }else if( ch[0] == '-'){
        	result = 0 - result;
        }else if(ch[0] >= '0' && ch[0] <= '9'){
        	result += (ch[0] - '0') * n;
        }else{
        	return 0;
        }
        	
        return result;
    }
	public static void main(String[] args) {
		System.out.println(StrToInt1("123"));
	}
}