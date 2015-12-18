package leetcode.string;

public class CountandSay {
	public static String countAndSay(int n) {
		String startStr = "1" , result = "1";
		char start = ' ';
		int count = 0 ;
		for( int i = 1 ; i < n; i ++){
			count = 0 ;
			result = "";
			for( int index = 0 ; index < startStr.length(); index ++){
				if(index == 0){
					start = startStr.charAt(0);
					count ++ ;
				}else{
					if( startStr.charAt(index) == start)
						count ++ ;
					else{
						result = result + count + "" + (start - 48) ;
						start = startStr.charAt(index);
						count = 1 ;
					}
				}
			}
			if( count > 0)
				result = result + count + "" + (start - 48) ;
			startStr = result ;
			
		}
        return result ;
    }

	public static void main(String[] args) {
		System.out.println(countAndSay(10));
	}
}