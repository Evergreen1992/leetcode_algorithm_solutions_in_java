package company.网易;

import java.util.Scanner;

//位置交换
public class SetsReplace {
	public static void handle(String sc){
		char[] arr = sc.toCharArray();
		int count1 = 0 ;
		for(int i = 0; i < arr.length; i ++){
			if( arr[i] == 'B'){//第一个B
				for(int j = i + 1; j < arr.length; j ++){
					if( arr[j] == 'G'){//第一个G
						count1 += j - i ;
						arr[j] = 'B';
						arr[i] = 'G';
					}
				}
			}
		}
		
		int count2 = 0;
		arr = sc.toCharArray();
		for(int i = arr.length - 1; i >= 0; i --){
			if( arr[i] == 'B'){//第一个B
				for(int j = i - 1; j >= 0 ; j --){
					if( arr[j] == 'G'){//第一个G
						count2 += i - j ;
						arr[j] = 'B';
						arr[i] = 'G';
					}
				}
			}
		}
		
		System.out.println(count1 >= count2 ? count2 : count1);
	}
	public static void main(String[] args) {//BGBGBGBGGGBBGBGBGG
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			handle(sc.nextLine());
		}
		sc.close();
	}
}