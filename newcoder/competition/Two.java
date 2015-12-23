package competition;

public class Two {
	
	public static int NumberOf1(int n) {
		int num = 0 ;
		while( n != 0 ){
			n = (n & (n - 1));
			num ++ ;
		}
		return num ;
    }

	public static void main(String[] args) {
		System.out.println(NumberOf1(7));
		//100
		//011
	}

}
