/**
 * 实现代码文件
 * 
 * @author Evergreen
 * @since 2016-3-25
 * @version V2.0
 */
package com.routesearch.route;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public final class Route
{
	static int[][] matrix = null ;
	//开始和结束的节点
	static int start , end ;
	//要经过的节点
	static String[] conditionNodes = null ;
	//最小权值
	static DataList minCostDataList = null ;
	//边和权值信息
	static Map<String, String> edgesMap = new HashMap<String,String>();
	//条件顶点个数
	static int conditionSize = 0 ;
	//开始处理时间
	static long startTime = System.currentTimeMillis();
	//邻居结点集合
	static Map<Integer,Set<Node>> neighbers = new HashMap<Integer,Set<Node>>();
	//顶点个数
	static int nodeSize = 0 ;
	//访问过的结点标记数组
	//static int[][] visitedFlagArray = new int[600][8];
	
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
	}
	//结点数据结构
	static class Node{
		public int data ;
		public boolean visited = false;
		public Node(int data){
			this.data = data ;
		}
	}
	
    /**
     * 你需要完成功能的入口
     * 
     * @author Evergreen
     * @since 2016-3-25
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
    		
    		//设置邻居结点
    		if( neighbers.get(Integer.parseInt(items[1])) == null ){
    			Set<Node> tempSet = new HashSet<Node>();
    			tempSet.add(new Node(Integer.parseInt(items[2])));
    			neighbers.put(Integer.parseInt(items[1]), tempSet);
    		}else{
    			Set<Node> tempSet = neighbers.get(Integer.parseInt(items[1]));
    			tempSet.add(new Node(Integer.parseInt(items[2])));
    			neighbers.put(Integer.parseInt(items[1]), tempSet);
    		}
    	}
    	nodeSize = neighbers.size();
    	System.out.println(nodeSize);
    	/************************数据处理结束********************************/
    	findNodes();
    	/************************寻找路径结束********************************/
        return printFinalResult();
    }
    /**
     * 开始执行算法.使用栈实现。
     */
    public static void findNodes(){
    	Stack<Integer> stack = new Stack<Integer>();
      	stack.push(start);

    	while(!stack.isEmpty()){
    		
    		/*long nowTime = System.currentTimeMillis();
        	if( (nowTime - startTime) > 9400 ){
        		return ;
        	}*/
    		
    		//栈顶结点
    		Integer top = stack.peek();
    		Integer v = getReachableAndNotVisitedNode(top,stack) ;
    		if(v == -1){
				setPeakUnvisited(stack.peek());
    			stack.pop();
    		}else{
    			stack.push(v);
    		}
    		
    		if(!stack.isEmpty() && end == stack.peek()){//到达终点
    			//验证
    			DataList resultList = validatePath(stack);
    			if(resultList != null ){
    				findMinCostPath(resultList);
    			}
    			stack.pop();
    		}
    	}
	}
    /**
     * 判断两个点之间是否联通。用于剪枝。
     * @param start
     * @param end
     * @return
     */
    private boolean ifConnectable(int start, int end) { 
        /*ArrayList<Integer> queue = new ArrayList<Integer>();  
        ArrayList<Integer> visited = new ArrayList<Integer>();  
        queue.add(start);  
        while (!queue.isEmpty()) {  
            for (int j = 0; j < n; j++) {  
                if (graph.getAdjMat()[start][j] == 1 && !visited.contains(j)) {  
                    queue.add(j);  
                }  
            }  
            if (queue.contains(end)) {  
                return true;  
            } else {  
                visited.add(queue.get(0));  
                queue.remove(0);  
                if (!queue.isEmpty()) {  
                    start = queue.get(0);  
                }  
            }  
        }*/
        return false;  
    }  
    /**
     * 设置未访问标记
     * @param peak
     */
    public static void setPeakUnvisited(Integer peak){
    	if( neighbers.get(peak) != null ){
    		for( Node node : neighbers.get(peak)){
    			node.visited = false;
    		}
    	}
    }
    /**
     * 查看栈顶节点V在图中，有没有可以到达、且没有入栈、且没有从这个节点V出发访问过的节点
     * @param top
     * @return
     */
    public static Integer getReachableAndNotVisitedNode(Integer top, Stack<Integer> stack){
    	if( neighbers.get(top) != null ){
	    	for(Node nodeData : neighbers.get(top)){//邻接结点
	    		if(nodeData.visited == false && !stack.contains(nodeData.data)){
	    			nodeData.visited = true ;
	    			return nodeData.data ;
	    		}
	    	}
    	}
    	return -1 ;
    }

    /**
     * 判断是否经过所有要求的节点
     * @return
     */
    public static DataList validatePath(Stack<Integer> stack){
		if( conditionSize > stack.size())//顶点个数必须大于等于条件个数
			return null;
		
		DataList dataList = new DataList(start);
    	for(int i = 0 ; i < conditionNodes.length; i ++){
    		
       		Integer integer = Integer.parseInt(conditionNodes[i].trim()) ;
    		if(stack.contains(integer) == false)
    			return null;
    	}
    	
    	int i = 0 ;
    	for(Integer item : stack){
    		if( i > 0)
    			dataList.add(item);
    		i ++ ;
    		System.out.print(item + "->");
    	}
    	System.out.println();
    	
    	return dataList;
    }
    
    /**
     * 寻找最小权值路径
     */
    public static void findMinCostPath(DataList dataList){
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