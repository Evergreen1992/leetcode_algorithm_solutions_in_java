package company.网易;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//记单词
/**
3 4
apple orange strawberry
strawberry orange grapefruit watermelon
 * @author Evergreen
 *
 */
public class RememWords {
	public static void count(String[] str1, String[] str2){
		
		Set<String> set = new HashSet<String>();
		for(String item : str1)
			set.add(item);
		
		Set<String> set2 = new HashSet<String>();
		for(String item : str2)
			set2.add(item);
		
		int result = 0;
		for(String item : set2){
			if( set.contains(item))
				result += item.length() * item.length();
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			String[] str1 = new String[n];
			for(int i = 0 ; i < n; i ++){
				str1[i] = sc.next();
			}
			String[] str2 = new String[m];
			for(int i = 0; i < m; i ++){
				str2[i] = sc.next();
			}
			count(str1, str2);
		}
		sc.close();
	}
}