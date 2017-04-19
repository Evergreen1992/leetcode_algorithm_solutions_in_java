package company.网易;

import java.util.Scanner;

/**
3
BWW
BBB
BWB

8
BBWWBBWW
BBWWBBWW
WWBBWWBB
WWBBWWBB
BBWWBBWW
BBWWBBWW
WWBBWWBB
WWBBWWBB

 * @author Evergreen
 *
 */
public class 棋盘涂色 {
	public static void paint(String[] str){
		int max = 0, len = str.length, bCount = 0, wCount = 0 , pre = 0;
		for(int j = 0; j < len; j ++){
			bCount = 0;
			wCount = 0;
			for(int i = 0; i < len; i ++){
				if( str[i].charAt(j) == 'B'){//B
					if( pre == 1){
						bCount ++ ;
						if( bCount >= max)
							max = bCount ;
					}else{
						bCount = 1;
					}
					pre = 1;
				}else{//W
					if( pre == 2){
						wCount ++ ;
						if( wCount >= max)
							max = wCount ;
					}else{
						wCount = 1;
					}
					pre = 2;
				}
			}
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		for(int i = 0 ; i < n; i ++){
			arr[i] = sc.next();
		}
		paint(arr);
		sc.close();
	}
}