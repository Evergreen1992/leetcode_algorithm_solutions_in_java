package leetcode.array;

public class ReverseWordsInAString {
	public static String reverseWords(String s) {
		String result = "", word = "";
		for( int i = 0 ; i < s.length(); i ++){
			if( s.charAt(i) == ' '){
				if( !word.trim().equals("")){
					result = word.trim() + ' ' + result;
				}
				word = "";
			}
			word += s.charAt(i);
		}
		result = word.trim() + ' ' + result ;
		return result.trim();
    }

	public static void main(String[] args) {
		System.out.println(reverseWords(" a b"));
	}
}