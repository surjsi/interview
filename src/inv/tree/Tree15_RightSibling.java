package inv.tree;

import java.util.ArrayList;
import java.util.List;

public class Tree15_RightSibling {

	public static void main(String[] args) {
		Node node = new Node().getPerfectTree();
		List<String> lst = new ArrayList<>();
		if(node != null)
			lst.add(node.name);
		while(node != null) {
			setRightSibling(node);
			node = node.left;
		}
		inOrderTraverse(node);
	}
	public static void setRightSibling(Node node) {//A
		while(node != null) {
			if(node.right != null && node.left != null) {
				node.left.next = node.right;
				//node.right.next = node.next != null ? node.next.left : null;
			//else {
				node.right.next = node.next != null ? node.next.left : null;
			}
			node = node.right;
		}
		
	}
	
	public static void inOrderTraverse(Node tree) {
		if(tree != null) {
			inOrderTraverse(tree.left);
			System.out.print(tree.name+"( next -> "+tree.next != null ? tree.next.name : "" +")"+" --> ");
			inOrderTraverse(tree.right);
		}
	}
}
