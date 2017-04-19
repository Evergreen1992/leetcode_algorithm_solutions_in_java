package leetcode.math;

public class ReconstructOriginalDigitsFromEnglish {
	public static String originalDigits(String s) {
        String result = "";
        int[] count = new int[10];
        for(char item : s.toCharArray()){
        	if( item == 'z')//0
        		count[0] ++ ;
        	if( item == 'w')//2
        		count[2] ++ ;
        	if( item == 'x')//6
        		count[6] ++ ;
        	if( item == 'g')//8
        		count[8] ++ ;
        	if( item == 'u')//4
        		count[4] ++ ;
        	if( item == 's')//7,6
        		count[7] ++ ;
        	if( item == 'f')//5,4
        		count[5] ++ ;
        	if( item == 'h')//3,8
        		count[3] ++ ;
        	if( item == 'i')//5,6,8,9
        		count[9] ++ ;
        	if( item == 'o')//0,1,2,4
        		count[1] ++ ;
        }
        count[7] -= count[6];
        count[5] -= count[4];
        count[3] -= count[8];
        count[9] = count[9] - count[8] - count[5] - count[6];
        count[1] = count[1] - count[0] - count[2] - count[4];
        for(int i = 0 ; i < 10; i ++){
        	for(int j = 0 ; j < count[i]; j ++){
        		result += i;
        	}
        }
        return result ;
    }
	public static void main(String[] args) {
		System.out.println(originalDigits("owoztneoerzero"));
	}
}