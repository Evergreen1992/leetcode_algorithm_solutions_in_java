package leetcode_problems;

public class Number_of_bits {
    
    public static  int hammingWeight(int n) {
        int count = 0  ;
       
        while( (n / 2 ) != 0 ){
            count ++ ;
            n = n >> 1 ;
        }
        System.out.println(n);
        return count ;
    }

    public static void main(String[] args) {
	System.out.println(hammingWeight(11));
    }
}