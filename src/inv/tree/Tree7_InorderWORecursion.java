package inv.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Wrapper{
	Node node;
	boolean leftTraversed;
	public Wrapper(Node node, boolean leftTraversed) {
		super();
		this.node = node;
		this.leftTraversed = leftTraversed;
	}
	
}

public class Tree7_InorderWORecursion {

	public static void main(String[] args) {
		Node node = new Node().getFirstTree();
		inOrderTraverse(new Wrapper(node, false));
		preOrderTraverse(new Wrapper(node, false));
	}
	
	public static void inOrderTraverse(Wrapper tree) {
		Deque<Wrapper> queue = new ArrayDeque<>();
		List<String> result = new ArrayList<>();
		queue.addFirst(tree);
		while(!queue.isEmpty()) {
			Wrapper node = queue.removeFirst();
			if(node.node != null) {
				if(node.leftTraversed) {
					result.add(node.node.name);
				}else {
					queue.addFirst(new Wrapper(node.node.right, false));
					queue.addFirst(new Wrapper(node.node, true));
					queue.addFirst(new Wrapper(node.node.left, false));
					
					
				}
			}
		}
		System.out.println(result);
	}
	
	public static void preOrderTraverse(Wrapper tree) {
		Deque<Wrapper> queue = new ArrayDeque<>();
		List<String> result = new ArrayList<>();
		queue.addFirst(tree);
		while(!queue.isEmpty()) {
			Wrapper node = queue.removeFirst();
			if(node.node != null) {
				if(node.leftTraversed) {
					result.add(node.node.name);
				}else {
					queue.addFirst(new Wrapper(node.node.right, false));
					
					queue.addFirst(new Wrapper(node.node.left, false));
					queue.addFirst(new Wrapper(node.node, true));
					
					
				}
			}
		}
		System.out.println(result);
	}
}
