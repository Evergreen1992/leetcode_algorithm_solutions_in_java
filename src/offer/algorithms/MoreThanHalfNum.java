package offer.algorithms;

//  1 1 1 1 0
public class MoreThanHalfNum {
	public static int MoreThanHalfNum_Solution(int [] array) {
		if( array.length == 1)
			return array[0];
		int times = 1, num = array[0];
		for(int j = 1; j < array.length; j ++){
			if( times == 0){
				num = array[j];
				times = 1 ;
			}else{
				if( array[j] == num)
					times ++ ;
				else
					times -- ;
			}
		}
		//check if exist
		int count = 0;
		for(int i = 0 ; i < array.length; i ++){
			if( array[i] == num)
				count ++ ;
		}
		if( count <= array.length / 2)
			num = 0;
        return num;
    }
	public static void main(String[] args) {
		System.out.println(MoreThanHalfNum_Solution(new int[]{1,2,3,2,4,2,5,2,3}));
	}
}
