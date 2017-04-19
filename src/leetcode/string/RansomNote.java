package leetcode.string;

import java.util.HashMap;

public class RansomNote {
	public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> from = new HashMap<Character,Integer>();
        for(int i = 0 ; i < ransomNote.length(); i ++){
        	if( from.get(ransomNote.charAt(i)) == null){
        		from.put(ransomNote.charAt(i), 1);
        	}else{
        		from.put(ransomNote.charAt(i), 1 + from.get(ransomNote.charAt(i)));
        	}
        }
        
        HashMap<Character,Integer> des = new HashMap<Character,Integer>();
        for(int i = 0 ; i < magazine.length(); i ++){
        	if( des.get(magazine.charAt(i)) == null){
        		des.put(magazine.charAt(i), 1);
        	}else{
        		des.put(magazine.charAt(i), 1 + des.get(magazine.charAt(i)));
        	}
        }
        
        for(Character item : from.keySet()){
        	if( des.get(item) == null || des.get(item) < from.get(item))
        		return false;
        }
		return true;
    }

	public static void main(String[] args) {
		System.out.println(canConstruct("aabbcd", "abbdcaabbeecd"));
	}

}
