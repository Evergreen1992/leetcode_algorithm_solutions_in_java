package leetcode.sort;

public class ValidAnagram {
    
    public static boolean isAnagram(String s, String t) {
        if( t != null )
            return s.contains(t) ? true : false ;
        else
            return false ;
    }

    public static void main(String[] args) {
	System.out.println(isAnagram("aaabb", "bb"));
    }

}
