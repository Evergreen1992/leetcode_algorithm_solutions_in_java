package leetcode_problems;

/**
    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
 * @author Administrator
 *
 */

public class ExcelSheetColumnNumber {
    public static int titleToNumber(String s) {
	int num = 0 , range = 1 ;
	for( int i =  s.length() - 1;  i >= 0 ; i --){
	    num += ((int)s.charAt(i) - 64) * range ;
	    range *= 26 ;
	}
        return num ;
    }

    public static void main(String[] args) {
	System.out.println(titleToNumber("Z"));
    }

}
