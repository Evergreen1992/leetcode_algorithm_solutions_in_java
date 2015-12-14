package leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	public static boolean wordPattern(String pattern, String str) {
		Map<Character, String> map = new HashMap<Character, String>();
		Map<String, Character> map2 = new HashMap<String, Character>();
		String[] strs = str.split(" ");
		if( strs.length != pattern.length())
			return false ;
		for( int i = 0 ; i < pattern.length(); i ++){
			if( !map.containsKey(pattern.charAt(i))){
				map.put(pattern.charAt(i), strs[i]);
			}else{
				if( !map.get(pattern.charAt(i)).equals(strs[i]))
					return false ;
			}
		}
		for(int i = 0 ; i < strs.length; i ++){
			if( !map2.containsKey(strs[i]))
				map2.put(strs[i], pattern.charAt(i));
			else{
				if( map2.get(strs[i]) != pattern.charAt(i))
					return false ;
			}
		}
        return true ;
    }

	public static void main(String[] args) {
		System.out.println(wordPattern("abba", "dogs cat cat dog"));
	}

}
