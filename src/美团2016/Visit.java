package 美团2016;

/**
现在有一个城市销售经理，需要从公司出发，去拜访市内的商家，已知他的位置以及商家的位置，但是由于城市道路交通的原因，他只能在左右中选择一个方向，在上下中选择一个方向，现在问他有多少种方案到达商家地址。
给定一个地图map及它的长宽n和m，其中1代表经理位置，2代表商家位置，-1代表不能经过的地区，0代表可以经过的地区，请返回方案数，保证一定存在合法路径。保证矩阵的长宽都小于等于10。
测试样例：
[[0,1,0],[2,0,0]],2,3
返回：2
 */
public class Visit {
    
    public static int countPath(int[][] map, int n, int m){
	return 0 ;
    }
    
    public static void main(String[] args) {
	int[][] map = {{0,1,0},{2,0,0}};
	System.out.println(countPath(map, 2, 3));
    }

}
