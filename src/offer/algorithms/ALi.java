package offer.algorithms;

import java.util.ArrayList;
import java.util.HashMap;

public class ALi {
	public static int resolve(int[] A) {
		int sum = 0 ;
		HashMap<String,ArrayList<Integer>> nodes = new HashMap<String, ArrayList<Integer>>();
		//每层结点放入map
		for(int i = 0 ; i < A.length; i ++){
			String key = (A[i]/10)%10 + "";//层数
			if( nodes.get(key) == null ){
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(A[i]%10);
				nodes.put(key, list );
			}else{
				nodes.get(key).add(A[i]%10);
			}
		}
		
		int layer = (A[A.length - 1]/10)%10;//最大层数
		//计算路径和
		for(int i = 1; i <=4; i ++){
			int curLayer = (A[i]/10)%10;//当前层
			int layerSum = 0 ;//每一层的和
			if( nodes.get(i + "") != null ){
				for(Integer item : nodes.get(i + "")){
					layerSum += item ;
				}
			}
			layerSum = layerSum *( layer/curLayer);
			sum += layerSum;
		}
		
		return sum;
    }

	public static void main(String[] args) {

	}

}
