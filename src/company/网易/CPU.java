package company.网易;

import java.util.ArrayList;
import java.util.Scanner;

public class CPU {
	public static void process(ArrayList<Integer> list){
		if( list.size() == 0)
			System.out.println(0);
		int lenA = 0, lenB = 0  ;
		//Collections.sort(list);
		for(int i = list.size() - 1; i >= 0; i --){
			if( lenA <= lenB){
				lenA += list.get(i);
			}else
				lenB += list.get(i);
		}
		System.out.println(lenA >= lenB ? lenA * 1024 : lenB * 1024);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while( sc.hasNext()){
			ArrayList<Integer> list = new ArrayList<Integer>();
			int size = sc.nextInt();
			for(int i = 0 ; i < size; i ++){
				list.add(sc.nextInt()/1024);
			}
			process(list);
		}
		sc.close();
	}
}