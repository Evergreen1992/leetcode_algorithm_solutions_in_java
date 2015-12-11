package leetcode.hashtable;

public class ValidAnagram {
	public static boolean isAnagram(String s, String t) {
		int[] size = new int[26];
		for(char c : s.toCharArray()){
			size[c - 'a'] ++ ;
		}
		for(char c : t.toCharArray()){
			size[c - 'a'] -- ;
		}
		for(int item : size)
			if( item != 0)
				return false ;
		return true;
    }
	
	public static void main(String[] args) {
		System.out.println(isAnagram("a", "ab"));
	}

}
