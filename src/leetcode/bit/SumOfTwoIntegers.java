package leetcode.bit;

public class SumOfTwoIntegers {
	public static int getSum(int a, int b) {
		while (b != 0) {
            int c = a ^ b;//加法即是异或运算。
            b = (a & b) << 1;// a & b为进位;然后左移。
            a = c;
        }
        return a;
    }

	public static void main(String[] args) {
		System.out.println(getSum(11,22));
		
	}
}