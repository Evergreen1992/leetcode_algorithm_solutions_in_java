package offer.datastucture;
//使用递归或者栈（如果列表过程，递归可能栈溢出）
class Node{
	public int data ;
	public Node next = null ;
	public Node(int data){this.data = data;}
}
public class ReverseList {
	public static void reverse(Node node){
		if( node.next != null ){
			reverse(node.next);
		}
		System.out.println(node.data);
	}
	public static void main(String[] args) {
		Node h = new Node(1);
		Node h1 = new Node(2);
		Node h2 = new Node(3);
		Node h3 = new Node(4);
		h.next = h1 ;
		h1.next = h2 ;
		h2.next = h3 ;
		reverse(h);
	}

}
