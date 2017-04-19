package company.网易;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RemoveDuplicate {
	public static void remove(int[] arr){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = arr.length - 1; i >= 0; i --){
			if( map.get(arr[i]) == null){
				map.put(arr[i], 1);
				//System.out.print(arr[i] + " ");
			}else{
				map.put(arr[i], map.get(arr[i]) + 1);
			}
			
			if( map.get(arr[i]) == 1)
				list.add(arr[i]);
				//System.out.print(arr[i] + " ");
		}
		for(int i = list.size() - 1; i >= 0; i --){
			
			System.out.print(list.get(i));
			if( i != 0)
				System.out.print(" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while( sc.hasNext()){
			int size = sc.nextInt();
			int[] arr = new int[size];
			for(int i = 0 ; i < size; i ++){
				arr[i] = sc.nextInt();
			}
			remove(arr);
		}
		sc.close();
	}

}
