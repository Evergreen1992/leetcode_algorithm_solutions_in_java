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

public final class Route
{
	static int[][] matrix = null ;
	//开始和结束的节点
	static int start , end ;
	//要经过的节点
	static String[] conditionNodes = null ;
	//最小权值
	static DataList minCostDataList = null ;
	static Map<String, String> edgesMap = new HashMap<String,String>();
	//用于存放一条满足条件的路径的权值和结点信息的数据结构。
	static class DataList{
		List<Integer> listNodes = new ArrayList<Integer>();//顶点集
		int cost = 0 ;//权值
		public DataList(int start){
			listNodes.add(start);
		}
		//添加一个结点，并更新权值
		public void add(int data){
			//更新权值
			cost += matrix[listNodes.get(listNodes.size() - 1)][data];
			listNodes.add(data);
		}
		//复制结点和权值
		public void copy(DataList dataList){
			listNodes = new ArrayList<Integer>(dataList.listNodes);
			cost = dataList.cost;
		}
	}
	
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
    	String[] conditionArray = condition.split(",");
    	matrix = new int[600][600];//最多600个顶点
    	start = Integer.parseInt(conditionArray[0]);
    	end = Integer.parseInt(conditionArray[1]);
    	conditionNodes = (conditionArray[2]).split("\\|");
    	for(String item : graphContent.split("\n")){
    		items = item.split(",");
    		edgesMap.put(items[1] + "," + items[2], items[0]);
    		matrix[Integer.parseInt(items[1])][Integer.parseInt(items[2])] = Integer.parseInt(items[3]);
    	}
    	/************************数据处理结束********************************/
    	DataList dataList = new DataList(start);
    	findNodes(start, dataList);
    	/************************寻找路径结束********************************/
        return printFinalResult();
    }

    /**
     * 开始执行算法
     */
    public static void findNodes(int nodeIndex, DataList dataList){
    	//遍历访问当前行。
    	for( int index = 0 ; index < matrix[nodeIndex].length; index ++){
    		if( matrix[nodeIndex][index] >= 1 && !dataList.listNodes.contains(index)){//存在邻接节点
    			//创建新的node
				DataList tempDataList = new DataList(start);
				tempDataList.copy(dataList);
				tempDataList.add(index);
				//System.out.println("访问:" + nodeIndex + "," + index);
				
				
    			//检测是否到达终点
    			if( index == end ){
    				if( validatePath(tempDataList.listNodes) == true){
    					findMinCostPath(tempDataList);
    				}
    			}else{
    				//递归调用
    				findNodes(index, tempDataList);
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
     * 寻找最小权值路径
     */
    public static void findMinCostPath(DataList dataList){
    	if( minCostDataList == null){
    		minCostDataList = dataList;
    	}
    	if( dataList.cost < minCostDataList.cost){
    		minCostDataList = dataList;
    	}
    	/**
    	System.out.println("一条满足条件的路径:");
    	for(int item : dataList.listNodes){
    		System.out.print(item + "->");
    	}
    	System.out.println();
    	System.out.println("此路径的权值为:" + dataList.cost);*/
    }
    /**
     * 最终处理结果
     */
    public static String printFinalResult(){
    	if( minCostDataList == null ){
    		return "NA";
    	}else{
    		String path = "";
    		System.out.println("最小权值:" + minCostDataList.cost);
    		for( int i = 0 ; i < minCostDataList.listNodes.size(); i ++){
    			System.out.print(minCostDataList.listNodes.get(i) + "->");
    			if( i >=1 ){
    				path += edgesMap.get(minCostDataList.listNodes.get(i - 1) + "," +
    						minCostDataList.listNodes.get(i));
    				if( i < minCostDataList.listNodes.size() - 1)
    					path += "|";
    			}
    		}
    		System.out.println();
    		System.out.println(path);
    		return path ;
    	}
    }
}