/**
 * 实现代码文件
 * 
 * @author Evergreen
 * @since 2016-3-4
 * @version V1.0
 */
package com.routesearch.route;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Administrator
 * 顶点
 */
class Node{
	String index ;//顶点号
	int status = 0 ;//状态
	Node next ;//下一节点
	public Node(String index, int status){
		this.index = index ;
		this.status = status ;
	}
}

public final class Route
{
	//所有节点
	static Map<Integer, Node> allNodes = new HashMap<Integer,Node>();
	//邻接节点表
	static Map<Integer, Node> neighbors = new HashMap<Integer, Node>();
	//邻接矩阵
	static int[][] matrix = null ;
	//开始和结束的节点
	static int start , end ;
	//要经过的节点
	static String[] conditionNodes = null ;
	
	static List<Integer> visitedNodes = new ArrayList<Integer>();//访问过的节点
    /**
     * 你需要完成功能的入口
     * 
     * @author Evergreen
     * @since 2016-3-4
     * @version V1
     */
    public static String searchRoute(String graphContent, String condition)
    {
    	String[] items ;
    	Node node = null ;
    	matrix = new int[graphContent.split("\n").length][graphContent.split("\n").length];
    	start = Integer.parseInt(condition.split(",")[0]);
    	end = Integer.parseInt(condition.split(",")[1]);
    	conditionNodes = (condition.split(",")[2]).split("\\|");
    	System.out.println(matrix.length + "," + matrix[0].length);
    	for(String item : graphContent.split("\n")){
    		items = item.split(",");
    		matrix[Integer.parseInt(items[1])][Integer.parseInt(items[2])] = Integer.parseInt(items[3]);
    		
    		//源节点
    		if( allNodes.get(items[1]) == null ){
    			node = new Node(items[1], 0);
    			allNodes.put(Integer.parseInt(items[1]), node);
    		}
    		//目标节点
    		if( allNodes.get(items[2]) == null ){
    			node = new Node(items[2], 0);
    			allNodes.put(Integer.parseInt(items[2]), node);
    		}
    	}
    	
    	
    	
    	
    	System.out.println("访问节点:" + start);
    	
    	visitedNodes.add(start);
    	findNodes(start);
        return "hello world!";
    }

    /**
     * 开始执行算法
     */
    public static void findNodes(int nodeIndex){
    	//遍历访问当前行。
    	int emptySize = 0 ;
    	for( int index = 0 ; index < matrix[nodeIndex].length; index ++){
    		if( matrix[nodeIndex][index] >= 1){//存在邻接节点
    			System.out.println("访问节点:" + nodeIndex + ":" + index);
    			
    			//检测节点是否已经访问过
    			if(visitedNodes.contains(index) == true){
    				continue;
    			}
    			
    			//检测是否到达终点
    			if( index == end ){
    				if( throughNodes() == true){
    					visitedNodes.add(end);
	    				System.out.println("访问结束~~~~~~~~~~~到达终点");
	    				handleResult();
	    				return ;
    				}else{
    					//无效的节点，移除
    					visitedNodes.remove(visitedNodes.size() - 1);
    					System.out.println("~~~~~~~~~~~到达终点，但不满足经过节点条件" + index);
    					continue;
    				}
    			}else{
    				visitedNodes.add(index);
    				findNodes(index);
    			}
    		}else{
    			emptySize ++ ;
    		}
    	}
    	
    	if( emptySize == 4){
    		System.out.println("节点->" + nodeIndex + " 无效");
    		//不可达路径
    		visitedNodes.remove(visitedNodes.size() - 1);
    	}
    }
    /**
     * 判断是否经过所有要求的节点
     * @return
     */
    public static boolean throughNodes(){
    	//System.out.println("-----------------------------------------");
    	for( int ii : visitedNodes){
    		System.out.print(ii + "->");
    	}
    	//System.out.println("------------------------------------------");
    	for(String nodeIndex : conditionNodes){
    		if( visitedNodes.contains(Integer.parseInt(nodeIndex.trim())) == false)
    			return false;
    	}
    	return true;
    }
    
    /**
     * 处理最终结果
     */
    public static void handleResult(){
    	System.out.println("*****************-********************");
    	for(int item : visitedNodes){
    		System.out.print(item + "->");
    	}
    	System.out.println();
    }
}