/**
 * 实现代码文件
 * 
 * @author Evergreen
 * @since 2016-3-4
 * @version V1.0
 */
package com.routesearch.route;

import java.util.HashMap;
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
    	matrix = new int[graphContent.split("\n").length][4];
    	start = Integer.parseInt(condition.split(",")[0]);
    	end = Integer.parseInt(condition.split(",")[1]);
    	conditionNodes = (condition.split(",")[2]).split("\\|");
    	
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
    	
    	runAlgorithm();
    	
        return "hello world!";
    }

    /**
     * 开始执行算法
     */
    public static void runAlgorithm(){
    	String path ;//节点路径
    }
}