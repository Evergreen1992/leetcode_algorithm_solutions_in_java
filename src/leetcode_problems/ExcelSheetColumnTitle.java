package leetcode_problems;

/**
Given a positive integer, return its corresponding column title as appear in an Excel sheet.
For example:
    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
 * @author Administrator
 *
 */
public class ExcelSheetColumnTitle {//   123
    public static String convertToTitle(int n) {
	String str = "";
	while( n > 0 ){
	   str = (char)(65 + (n-1) % 26   ) + str ;
	   n = (n-1) / 26 ;
	}
        return str ;
    }

    public static void main(String[] args) {
	System.out.println("reuslt : " + convertToTitle(78));
    }
}