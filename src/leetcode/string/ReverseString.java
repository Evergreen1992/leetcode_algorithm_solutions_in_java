package leetcode.string;

public class ReverseString {
	
	public static String reverseString(String s) {
		if( s == null)
			return null ;
		if( s.length() == 1 || s.equals(""))
			return s ;
		char[] items = s.toCharArray();
		char temp ;
		for( int i = 0 , j = s.length() - 1; i <= j ; i ++ , j --){
			temp = items[i];
			items[i] = items[j];
			items[j] = temp ;
		}
        return new String(items) ;
    }

	public static void main(String[] args) {
		System.out.println(reverseString("hello"));
	}

}
