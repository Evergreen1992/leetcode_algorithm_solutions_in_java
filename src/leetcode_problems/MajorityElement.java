package leetcode_problems;

public class MajorityElement {
    
    public int majorityElement(int[] num) {
	int count;
	int i ;
	for(  i = 0 ; i < num.length ; i ++){
	    count = 0 ;
	    for( int j = i ; j < num.length; j ++){
		if( num[j] == num[i]){
		    count ++ ;
		    if( count > num.length/2)
			return num[i];
		}
	    }
	}
        return 0 ;
    }
  
    //寻找最长公共前缀
    public String longestCommonPrefix(String[] strs) {
	String result = "";
	int i = 0 , j = 0 ;
	
	if( strs == null || strs.length == 0)
	    return "" ;
	
	outer :
	for( i = 0 ; i <strs[0].length(); i ++ ){
	    for( j = 0  ; j < strs.length; j ++){
		if( strs[j].length() < i + 1 ||  strs[j].charAt(i) != strs[0].charAt(i))
		    break outer;
	    }
	    if( j == strs.length)
		result += strs[0].charAt(i);
	}
	
        return result;
    }

    public static void main(String[] args) {
	//String strs[] = new String[]{"aaabbcd", "aacdfd", "aaacc", "aabbbbbcddd"}; 
	System.out.println(new MajorityElement().longestCommonPrefix(null));
    }

}
