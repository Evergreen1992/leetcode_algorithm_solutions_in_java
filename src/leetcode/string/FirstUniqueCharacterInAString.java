package leetcode.string;

public class FirstUniqueCharacterInAString {
	public static int firstUniqChar(String s) {
		if( s == null || s.equals(""))
			return -1;
		int[] index = new int[26];
		int result = 0, j = 0 ;
		for(int i = 0 ; i < s.length(); i ++){
			index[s.charAt(i) - 'a'] ++ ;
		}
		for(j = 0 ; j < s.length(); j ++){
			if( index[s.charAt(j) - 'a'] == 1){
				result = j ;
				break;
			}
		}
		if( j == s.length())
			result = -1;
        return result;
    }

	public static void main(String[] args) {
		System.out.println(firstUniqChar("aadadaad"));
	}
}