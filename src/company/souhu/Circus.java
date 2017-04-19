package company.souhu;

import java.util.HashMap;
import java.util.Scanner;
//马戏团问题。（最长递增子序列问题的变形）
/*
6
1 65 100
2 75 80
3 80 100
4 60 95
5 82 101
6 81 70
 */
public class Circus {
	public static void proc(HashMap<Integer, Integer> map){
		System.out.println("map size : " + map.size());
		int[] dp = new int[map.size()];
		dp[0] = 1;
		Object[] keys = map.keySet().toArray();
		
		for(int i = 1; i < keys.length; i ++){// 1 
			int max = 1 ;
			Integer keyI = Integer.parseInt(keys[i].toString());
			for(int j = 0; j < i; j ++){
				Integer keyJ = Integer.parseInt(keys[j].toString());
				if( map.get(keyI) >= map.get(keyJ)){
					if(dp[j] + 1 > max)
						max = dp[j] + 1 ;
				}
			}
			dp[i] = max ;
		}
		
		int max = -1 ;
		for(int item : dp){
			if( item > max)
				max = item;
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0 ; i < n; i ++){
			sc.nextInt();
			map.put(sc.nextInt(), sc.nextInt());
		}
		proc(map);
		sc.close();
	}
}