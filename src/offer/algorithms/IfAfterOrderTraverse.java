package offer.algorithms;
//输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。
//假设输入的数组的任意两个数字都互不相同。
//算法思想：序列最后一个结点为根节点。根据根节点，将树结点划分为左右子树结点。同样分别处理左右子树。
public class IfAfterOrderTraverse {
    public static boolean VerifySquenceOfBST(int [] sequence) {
    	return judgeSub(sequence, 0, sequence.length - 1);
    }
    public static boolean judgeSub(int[] a, int l, int r){
    	if( l >= r)
    		return true;
    	int i = r ;
    	while( i > l && a[i - 1] > a[r])
    		-- i;
    	System.out.println(i);
    	for(int j = i - 1; j >= 1; --j)
    		if( a[j] > a[r]){
    			System.out.println(a[j] + " , " + a[r]);
    			return false;
    		}
    	return judgeSub(a, l, i - 1) && judgeSub(a, i, r - 1);
    	
    }
	public static void main(String[] args) {
		int[] arr = {7,4,6,5};//1,3,2,    11,15,14,10};
		// 1 2 3 10 11 14 15
		//10 2 1 3   14 11      15
		System.out.println(VerifySquenceOfBST(arr));
	}
}