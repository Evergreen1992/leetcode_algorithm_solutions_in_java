package leetcode.array;

public class ThirdMaximumNumber {
	public static int thirdMax(int[] nums) {
		Integer first = null;
	    Integer second = null;
	    Integer third = null;
	    for (int n: nums) {
	        if (first == null || n > first) {
	            third = second; second = first; first = n;
	        } else if (second == null || (n < first && n > second)) {
	            third = second; second = n;
	        } else if (third == null || (n < second && n > third)) {
	            third = n;
	        }
	    }
	    return third == null? first: third;
    }
	public static void main(String[] args) {
		System.out.println(thirdMax(new int[]{2,2,3,1}));
	}

}
