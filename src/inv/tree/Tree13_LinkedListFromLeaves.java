package inv.tree;

import java.util.ArrayList;
import java.util.List;

public class Tree13_LinkedListFromLeaves {

	public static void main(String[] args) {
		Node node = new Node();
		List<String> lst = new ArrayList<>();
		createLinkedList(node.getFirstTree(), lst);
		System.out.println(lst);
	}
	public static void createLinkedList(Node node, List<String> lst) {
		if(node != null ) {
			if(node.left == null && node.right == null) {
				lst.add(node.name);
			}else {
				createLinkedList(node.left, lst);
				createLinkedList(node.right, lst);
			}
		}
	}
}
