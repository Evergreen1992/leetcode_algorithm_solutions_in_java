package huawei.campus2016;

import java.util.HashMap;
//比较扑克牌大小
//输入:  单张   对子   顺子   三个     炸弹    对王
// 3 4 5 6 7 8 9 10 J Q K A 2 joker JOKER
public class Poker {
	public static boolean ifBigger(String a, String b){
		return Integer.parseInt(a) > Integer.parseInt(b) ? true : false;
	}
	public static String getBigger(String str){
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("J", "11");
		map.put("Q", "12");
		map.put("K", "13");
		map.put("A", "14");
		map.put("2", "15");
		
		String left, right;
		left = str.split("-")[0];
		right = str.split("-")[1];
				
		//对王
		if( left.equals("joker JOKER") || right.equals("joker JOKER"))
			return "joker JOKER";
		String firstLeft = null, firstRight = null ;
		//炸弹、顺子、三个
		if( left.length() == 7 || left.length() == 9 || left.length() == 5 || left.length() == 3){
			firstLeft = left.split(" ")[0];
			firstRight = right.split(" ")[0] ;		
		}else{//单张
			firstLeft = left ;
			firstRight = right ;		
		}
		
		if( map.get(firstLeft) != null )
			firstLeft = map.get(firstLeft);
		if( map.get(firstRight) != null )
			firstRight = map.get(firstRight);
		
		return ifBigger(firstLeft, firstRight) == true ?  left : right ;
	}
	public static void main(String[] args) {//1-2
		System.out.println(getBigger("J J J-Q Q Q"));
	}
}