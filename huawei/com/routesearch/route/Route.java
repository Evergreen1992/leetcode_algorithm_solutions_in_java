/**
 * 实现代码文件
 * 
 * @author Evergreen
 * @since 2016-3-4
 * @version V1.0
 */
package com.routesearch.route;

import java.util.ArrayList;
import java.util.List;

public final class Route
{
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
    	matrix = new int[graphContent.split("\n").length][graphContent.split("\n").length];
    	start = Integer.parseInt(condition.split(",")[0]);
    	end = Integer.parseInt(condition.split(",")[1]);
    	conditionNodes = (condition.split(",")[2]).split("\\|");
    	for(String item : graphContent.split("\n")){
    		items = item.split(",");
    		matrix[Integer.parseInt(items[1])][Integer.parseInt(items[2])] = Integer.parseInt(items[3]);
    	}
    	/************************数据处理结束********************************/
    	List<Integer> visitedNodes = new ArrayList<Integer>();
    	visitedNodes.add(start);
    	findNodes(start, visitedNodes);
        return "hello world!";
    }

    /**
     * 开始执行算法
     */
    public static void findNodes(int nodeIndex, List<Integer> visitedNodes){
    	//遍历访问当前行。
    	for( int index = 0 ; index < matrix[nodeIndex].length; index ++){
    		if( matrix[nodeIndex][index] >= 1){//存在邻接节点
    			//检测节点是否已经访6问过
    			if(visitedNodes.contains(index) == true){
    				continue;
    			}    			
    			//创建新的node
				List<Integer> tempNodes = new ArrayList<Integer>(visitedNodes);
				tempNodes.add(index);
    			//检测是否到达终点
    			if( index == end ){
    				if( validatePath(tempNodes) == true){
	    				System.out.println("一条满足条件的路径:");
	    				handleResult(tempNodes);
    				}
    			}else{
    				findNodes(index, tempNodes);
    			}
    		}
    	}
    }
    /**
     * 判断是否经过所有要求的节点
     * @return
     */
    public static boolean validatePath(List<Integer> visitedNodes){
    	for(String nodeIndex : conditionNodes){
    		if( visitedNodes.contains(Integer.parseInt(nodeIndex.trim())) == false)
    			return false;
    	}
    	return true;
    }
    
    /**
     * 处理最终结果
     */
    public static void handleResult(List<Integer> visitedNodes){
    	for(int item : visitedNodes){
    		System.out.print(item + "->");
    	}
    	System.out.println();
    	System.out.println("此路径的权值为:");
    }
}