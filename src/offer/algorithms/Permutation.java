package offer.algorithms;
// a b c
public class Permutation {
	public static void permu(char[] str, char first, int index){
		if( index == str.length - 1)
			return ;
		//首个字符
		//后面的交换
		//for(int i = )
	}

	public static void main(String[] args) {
		char[] str = {'a','b','c' };
		for(int i = 0 ; i < str.length; i ++)
			permu(str, str[i], 1);
	}
}