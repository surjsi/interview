package inv.tree;

import java.util.ArrayList;
import java.util.List;

public class Tree10_TraversalConstantSpace {

	public static void main(String[] args) {
		Node node = new Node().getFirstTree();
		inorderTraverse(node);
	}
	
	public static void inorderTraverse(Node tree) {
		Node curr = tree;
		Node prev = null;
		
		List<String> result = new ArrayList<>();
		while(curr != null) {
			Node next = new Node();
			
			if(curr.parent == prev) {
				if(curr.left != null) {
					next = curr.left;
				}else {
					result.add(curr.name);
					next = curr.right != null ? curr.right : curr.parent; 
				}
			}else if(curr.left == prev ) {
				result.add(curr.name);
				next = curr.right != null ? curr.right : curr.parent; 
			}else {
				next = curr.parent;
			}
			
			prev = curr;
			
			curr = next;
			
		}
		
		System.out.println("In : "+result);
	}
	public static void preorderTraverse(Node tree) {
		Node curr = tree;
		Node prev = null;
		
		List<String> result = new ArrayList<>();
		while(curr != null) {
			Node next = new Node();
			if(curr != null) {
				result.add(curr.name);
			}
			
			if(curr.parent == prev) {
				if(curr.left != null) {
					next = curr.left;
				}else {
					result.add(curr.name);
					next = curr.right != null ? curr.right : curr.parent; 
				}
			}else if(curr.left == prev ) {
				result.add(curr.name);
				next = curr.right != null ? curr.right : curr.parent; 
			}else {
				next = curr.parent;
			}
			
			prev = curr;
			
			curr = next;
			
		}
		
		System.out.println("Pre : "+result);
	}
}
