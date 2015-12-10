package leetcode.others;

public class NimGame {
	public static boolean canWinNim(int n) {
		return n % 4 == 0 ? false : true ;
	}

	public static void main(String[] args) {
		System.out.println(canWinNim(6));
	}

}