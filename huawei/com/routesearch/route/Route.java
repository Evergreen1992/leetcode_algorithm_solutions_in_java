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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class Route
{
	static int[][] matrix = null ;
	//开始和结束的节点
	static int start , end ;
	//要经过的节点
	static String[] conditionNodes = null ;
	//所有结点
	static Set<Integer> allNodes = new HashSet<Integer>();
	//最小权值
	static DataList minCostDataList = null ;
	static Map<String, String> edgesMap = new HashMap<String,String>();
	//条件顶点个数
	static int conditionSize = 0 ;
	//开始处理时间
	static long startTime = System.currentTimeMillis();
	//访问过的点对
	static int[][] visitedPair ;
	
	
	
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
    	conditionSize = conditionArray.length;
    	matrix = new int[600][600];//最多600个顶点
    	start = Integer.parseInt(conditionArray[0]);
    	end = Integer.parseInt(conditionArray[1]);
    	conditionNodes = (conditionArray[2]).split("\\|");
    	for(String item : graphContent.split("\n")){
    		items = item.split(",");
    		edgesMap.put(items[1] + "," + items[2], items[0]);
    		
    		matrix[Integer.parseInt(items[1])][Integer.parseInt(items[2])] = Integer.parseInt(items[3]);
    		
    		allNodes.add(Integer.parseInt(items[1]));
    		allNodes.add(Integer.parseInt(items[2]));
    	}
    	
    	
    	visitedPair = new int[allNodes.size()][allNodes.size()];
    	//数据预处理
    	//preOperation();
    	/************************数据处理结束********************************/
    	DataList dataList = new DataList(start);
    	findNodes(start, start, dataList);
    	
    	
    	//
    	System.out.println(".........................................................");
    	for( int[] array : visitedPair){
    		for( int iii : array){
    			System.out.printf("%3d",iii);
    		}
    		System.out.println();
    	}
    	System.out.println(".........................................................");
    	
    	/************************寻找路径结束********************************/
        return printFinalResult();
    }
    /**
     * 开始执行算法
     */
    public static void findNodes(int preNode, int nodeIndex, DataList dataList){
    	if(visitedPair[preNode][nodeIndex] > 1 ){
    		return ;
    	}
    	/*long nowTime = System.currentTimeMillis();
    	if( (nowTime - startTime) > 9400 ){
    		return ;
    	}*/
    	//遍历访问当前行。
    	for( int index = 0 ; index < allNodes.size() + 1; index ++){
    		if( matrix[nodeIndex][index] >= 1 && !dataList.listNodes.contains(index)){//存在邻接节点
    			//创建新的node
				DataList tempDataList = new DataList(start);
				tempDataList.copy(dataList);
				tempDataList.add(index);
				
				visitedPair[nodeIndex][index] = visitedPair[nodeIndex][index] + 1 ;
				
    			//检测是否到达终点
    			if( index == end ){
    				//顶点个数必须大于等于条件个数
    				if( conditionSize > tempDataList.listNodes.size())
    					continue;
    				
    				if( validatePath(tempDataList.listNodes) == true){//满足条件的路径
    					findMinCostPath(tempDataList);
    				}
    			}else{
    				findNodes(nodeIndex, index, tempDataList);
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
    		if( visitedNodes.contains(Integer.parseInt(nodeIndex.trim())) == false){
    			return false;
    		}
    	}
    	return true;
    }
    
    /**
     * 寻找最小权值路径
     */
    public static void findMinCostPath(DataList dataList){
    	/*for(int item : dataList.listNodes){
    		System.out.print(item + "->");
    	}
    	System.out.println();*/
    	if( minCostDataList == null){
    		minCostDataList = dataList;
    	}else if( dataList.cost < minCostDataList.cost){
    		minCostDataList = dataList;
    	}
		System.out.println("cost : " + dataList.cost);
    }
    /**
     * 最终处理结果
     */
    public static String printFinalResult(){
    	if( minCostDataList == null ){
    		return "NA";
    	}else{
    		String path = "";
    		//System.out.println("最小权值:" + minCostDataList.cost);
    		for( int i = 0 ; i < minCostDataList.listNodes.size(); i ++){
    			//System.out.print(minCostDataList.listNodes.get(i) + "->");
    			if( i >=1 ){
    				path += edgesMap.get(minCostDataList.listNodes.get(i - 1) + "," +
    						minCostDataList.listNodes.get(i));
    				if( i < minCostDataList.listNodes.size() - 1)
    					path += "|";
    			}
    		}
    		//System.out.println();
    		//System.out.println(path);
    		return path ;
    	}
    }
}