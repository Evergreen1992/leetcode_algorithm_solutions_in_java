package leetcode.string;

public class ReverseWordsInAString {
	public static String reverseWords(String s) {
		StringBuilder sb = new StringBuilder();
		String[] strs = s.split(" ");
		for( int i = 0 ; i < strs.length; i ++){
			if( !strs[i].trim().equals("")){
				sb.insert(0, strs[i] + " ");
			}
		}
		return sb.toString().trim();
    }

	public static void main(String[] args) {//
		System.out.println(reverseWords("b c d a e"));
	}
}