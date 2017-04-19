package company.sougou;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	/*
	3
	1 1 2
	2 1 1
	3 2 1 2
	 */
	public static void cheat(HashMap<Integer, ArrayList<Integer>> mp){
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(Integer it : mp.keySet()){
			int count = 0;
			for(Integer ans : mp.get(it)){
				if( ans == it)
					continue;
				//条件一
				if( mp.keySet().contains(ans) && mp.get(ans).contains(it)){
					if( !result.contains(it))
						result.add(it);
					if( !result.contains(ans))
						result.add(ans);
				}
				//条件2
				if( result.contains(ans))
					count ++ ;
				if( count >= 2){
					if( !result.contains(it))
						result.add(it);
				}
			}
			
		}
		Collections.sort(result);
		
		System.out.println(result.size());
		for(int i = 0 ; i < result.size(); i ++){
			System.out.print(result.get(i));
			if( i != result.size() - 1)
				System.out.print(" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int count = sc.nextInt();
			HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
			for(int i = 0 ; i < count; i ++){
				int a = sc.nextInt();
				int size = sc.nextInt();
				ArrayList<Integer> list = new ArrayList<Integer>();
				for(int j = 0 ; j < size; j ++){
					int c = sc.nextInt();
					list.add(c);
				}
				if( map.keySet().contains(a)){
					map.get(a).addAll(list);
				}else
					map.put(a, list);
			}
			cheat(map);
		}
		sc.close();
	}
}