package leetcode_problems;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    
    public static List<Integer> spiralOrder(int[][] matrix) {
	
        List<Integer> data = new ArrayList<Integer>();
        
        if( matrix == null || matrix.length == 0 )
	    return data ;
	int direction = 1, index_x = 0 , index_y = -1 , m  = matrix.length  , n = matrix[0].length ; //   1:right   2:down     3:left    4:up
	int[][] flags = new int[m][n];
	
	
	
	for( int i = 1 ; i <= m * n ; i ++){
	    if( direction == 1){//右
		if( index_y + 1 != n  && flags[index_x][index_y + 1]  == 0 ){  //遇到边界，或者已经走过的地方。
		    index_y ++ ;
		    flags[index_x][index_y] = 1 ;
		    data.add(matrix[index_x][index_y] ) ;
		}else{
		    i -- ;
		    direction = 2 ;
		    continue ;
		}
	    }else if( direction == 2){//下
		if( index_x + 1 != m && flags[index_x + 1][index_y]  == 0){
		    index_x ++ ;
		    flags[index_x][index_y] = 1 ;
		    data.add(matrix[index_x][index_y] ) ;
		}else{
		    i -- ;
		    direction = 3 ;
		    continue ;
		}
	    }else if( direction == 3){//左
		if( index_y - 1 >=0 && flags[index_x][index_y - 1] == 0 ){
		    index_y -- ;
		    flags[index_x][index_y] = 1 ;
		    data.add(matrix[index_x][index_y] ) ;
		}else{
		    i -- ;
		    direction = 4 ;
		    continue ;
		}
	    }else if( direction == 4){//上
		if( index_x - 1 >= 0 && flags[index_x - 1][index_y] == 0 ){
		    index_x -- ;
		    flags[index_x][index_y] = 1 ;
		    data.add(matrix[index_x][index_y] ) ;
		}else{
		    i -- ;
		    direction = 1 ;
		    continue ;
		}
	    }
	}
	
        
        return data ;
    }

    public static void main(String[] args) {
	int[][] array = new int[][]{
	};
	List<Integer> data  = spiralOrder(array);
	
	for(Integer i : data){
	    System.out.print(i + " , ");
	}
	System.out.println();
    }

}
