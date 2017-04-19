package offer.algorithms;

public class FindNumsAppearOnce {
	//
	public static void FindNumsAppearOnce_(int [] array,int num1[] , int num2[]) {
        int temp = 0 ;
        for(int item : array){
        	temp ^= item ;
        }
        int count = 0;
        for(count = 0; ; count ++){
        	if( (temp & 1) == 1)
        		break;
        	temp = temp >> 1;
        }
        num1[0] = num2[0] = 0 ;
        for(int item : array){
        	if( ((item >> count)&1) == 0 ){
        		num1[0] ^= item ;
        	}else{
        		num2[0] ^= item ;
        	}
        }
        System.out.println(num1[0] + "," + num2[0]);
    }
	public static void main(String[] args) {
		FindNumsAppearOnce_(new int[]{2,4,3,6,3,2,5,5}, new int[1], new int[1]);
	}

}
