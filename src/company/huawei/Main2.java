package company.huawei;

import java.util.Scanner;

public class Main2 {
	public static int[] rev(int[] init, char item){
		int[] newA = new int[6];
		if( item == 'L'  ){
			
			int t1 = init[0];
			int t2 = init[1];
			int t5 = init[4];
			int t6 = init[5];
			
			init[0] = t5;
			init[1] = t6;
			init[4] = t2;
			init[5] = t1;
		}else if(item == 'R'){
			int t1 = init[0];
			int t2 = init[1];
			int t5 = init[4];
			int t6 = init[5];
			init[0] = t6;
			init[1] = t5;
			init[4] = t1;
			init[5] = t2;
		}else if(item == 'F'){
			int t3 = init[2];
			int t4 = init[3];
			int t5 = init[4];
			int t6 = init[5];
			init[2]=t5;
			init[3]=t6;
			init[4]=t4;
			init[5]=t3;
		}else if(item == 'B'){
			int t3 = init[2];
			int t4 = init[3];
			int t5 = init[4];
			int t6 = init[5];
			init[2]=t6;
			init[3]=t5;
			init[4]=t3;
			init[5]=t4;
		}else if(item == 'C'){
			int t1 = init[0];
			int t2 = init[1];
			int t3 = init[2];
			int t4 = init[3];
			
			init[0]=t3;
			init[1]=t4;
			init[2]=t2;
			init[3]=t1;
		}else if(item == 'A'){
			int t1 = init[0];
			int t2 = init[1];
			int t3 = init[2];
			int t4 = init[3];
			
			init[0]=t4;
			init[1]=t3;
			init[2]=t1;
			init[3]=t2;
		}
		for(int i = 0 ; i <6; i ++){
			newA[i] = init[i];
		}
		return newA;
	}
	//L.R向左。右旋转
	//F.B 前后翻转
	//A.C逆时针   顺时针
	public static String reverse(String cmd){
		if( cmd == null || cmd.equals(""))
			return null;
		String result = "" ;
		int[] init = new int[]{1,2,3,4,5,6};
		for(int i = 0 ; i < cmd.length(); i ++){
			char item = cmd.charAt(i);
			init = rev(init, item);
		}
		for(int ii = 0; ii < 6; ii ++)
			result += init[ii] + "";
		return result ;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()){
			String str = in.next();
			System.out.println(reverse(str));
		}
	}

}
