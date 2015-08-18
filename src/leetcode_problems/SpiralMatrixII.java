package leetcode_problems;

public class SpiralMatrixII {
   
    public static int[][] generateMatrix(int n) {
	int[][] result = new int[n][n];
	int direction = 1, index_x = 0 , index_y = -1 ; //   1:right   2:down     3:left    4:up
	
	for( int i = 1 ; i <= n * n ; i ++){
	    if( direction == 1){//右
               if( index_y + 1 != n  && result[index_x][index_y + 1]  == 0 ){  //遇到边界，或者已经走过的地方。
		    index_y ++ ;
		    result[index_x][index_y] = i ;
		}else{
		    i -- ;
		    direction = 2 ;
		    continue ;
		}
	    }else if( direction == 2){//下
		if( index_x + 1 != n && result[index_x + 1][index_y]  == 0){
		    index_x ++ ;
		    result[index_x][index_y] = i ;
		}else{
		    i -- ;
		    direction = 3 ;
		    continue ;
		}
	    }else if( direction == 3){//左
		if( index_y - 1 >=0 && result[index_x][index_y - 1] == 0 ){
		    index_y -- ;
		    result[index_x][index_y] = i ;
		}else{
		    i -- ;
		    direction = 4 ;
		    continue ;
		}
	    }else if( direction == 4){//上
		if( index_x - 1 >= 0 && result[index_x - 1][index_y] == 0 ){
		    index_x -- ;
		    result[index_x][index_y] = i ;
		}else{
		    i -- ;
		    direction = 1 ;
		    continue ;
		}
	    }
	}
	
        return result ;
    }

    public static void main(String[] args) {
	
	int n = 5 ;
	int[][] res = generateMatrix(n);

	for( int i = 0 ; i < n; i ++){
	    for( int j = 0 ; j < n; j ++){
		System.out.print(res[i][j] + ",");
	    }
	    System.out.println();
	}
    }

}
