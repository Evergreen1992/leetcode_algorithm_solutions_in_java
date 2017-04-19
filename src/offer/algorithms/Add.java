package offer.algorithms;

//不使用加减乘除实现两个数的加法
public class Add {
	public static int add(int num1, int num2){
		int sum = 0, carray = 0 ;
		while( num2 != 0){
			sum = num1 ^ num2 ;
			carray = (num1 & num2 ) << 1;
			num1 = sum ;
			num2 = carray ;
		}
		return num1 ;
	}

	public static void main(String[] args) {
		System.out.println(add(-5, 17));
	}
}