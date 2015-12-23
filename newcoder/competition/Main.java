package competition;

public class Main {
	static int num[] = new int[1000000];
	public static int Fibonacci(int n) {
		
		if( n <= 0 )
			return 0 ;
		if( n == 1)
			return 1 ;
		if( n == 2)
			return 1 ;
		else{
			if( num[n] != 0){
				return num[n];
			}else{
				int result = Fibonacci(n - 1) + Fibonacci(n - 2);
				num[n] = result ;
				return result;
			}
			
		}
    }

	public static void main(String[] args) {
		for( int i = 1; i < 10; i ++)
			System.out.println(Fibonacci(i));
	}

}
