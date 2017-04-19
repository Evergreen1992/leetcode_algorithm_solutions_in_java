package company.huawei;
import java.util.Scanner;
public class Main {
	 public static int reverseAdd(int a, int b){
			int result = 0;
			if( a < 1 || a > 70000)
				return -1;
			if( b <1 || b > 70000)
				return -1;
			//反转
			String str = a + "";
			int flag = 1 ;
			for(int i = 0; i < str.length(); i ++){
				result += Integer.parseInt(str.charAt(i) + "") * flag;
				flag *= 10;
			}
			flag = 1;
			str = b + "";
			for(int i = 0; i < str.length(); i ++){
				result += Integer.parseInt(str.charAt(i) + "") * flag;
				flag *= 10;
			}
			return result ;
		}
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int a = in.nextInt();
			int b = in.nextInt() ;
			System.out.println(reverseAdd(a,b));
		}
		in.close();
    }
}
/*import java.util.Scanner;
public class Main {//||
	 public static int reverseAdd(int a, int b){
		int result = 0;
		if( a < 1 || a > 70000)
			return -1;
		if( b <1 || b > 70000)
			return -1;
		//反转
		String str = a + "";
		int flag = 1 ;
		for(int i = 0; i < str.length(); i ++){
			result += Integer.parseInt(str.charAt(i) + "") * flag;
			flag *= 10;
		}
		flag = 1;
		str = b + "";
		for(int i = 0; i < str.length(); i ++){
			result += Integer.parseInt(str.charAt(i) + "") * flag;
			flag *= 10;
		}
		return result ;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int a = in.nextInt();
			int b = in.nextInt() ;
			System.out.println(reverseAdd(a,b));
		}
	}
}*/
