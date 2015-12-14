package leetcode.hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	public static List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> table = new HashMap<String, List<String>>();
		List<List<String>> lists = new ArrayList<List<String>>();
		for( String str : strs){
			char[] arr = str.toCharArray();
			Arrays.sort(arr);
			String currStr = String.valueOf(arr);
			if( !table.containsKey(currStr)){
				List<String> list = new ArrayList<String>();
				list.add(str);
				table.put(currStr, list);
				lists.add(list);
			}else{
				table.get(currStr).add(str);
			}
		}
		for( List<String> item : lists){
			Collections.sort(item);
		}
		
        return lists ;
    }

	public static void main(String[] args) {
		for(List<String> item : groupAnagrams(new String[]{"cab","tin","pew","duh","may","ill","buy","bar","max","doc"})){
			for(String str : item){
				System.out.print(str + " , ");
			}
			System.out.println();
		}
	}
}