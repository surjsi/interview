package inv.tree;

import java.util.ArrayList;
import java.util.List;

public class Tree14_ExteriorOfTree {

	public static void main(String[] args) {
		Node node = new Node().getFirstTree();
		List<String> lst = new ArrayList<>();
		if(node != null)
			lst.add(node.name);
		leftBoundary(node.left, lst);
		leaves(node, lst);
		rightBoundary(node.right, lst);
		System.out.println(lst);
	}
	public static void leaves(Node node, List<String> lst) {
		if(node != null ) {
			if(node.left == null && node.right == null) {
				lst.add(node.name);
			}else {
				leaves(node.left, lst);
				leaves(node.right, lst);
			}
		}
	}
	public static void leftBoundary(Node node, List<String> lst) {
		if(node != null ) {
			if(node.left != null) {
				lst.add(node.name);
				leftBoundary(node.left , lst);
			}else {
				leftBoundary(node.right , lst);
			}
		}
	}
	public static void rightBoundary(Node node, List<String> lst) {
		if(node != null ) {
			if(node.right != null) {
				lst.add(node.name);
				rightBoundary(node.right , lst);
			}else {
				rightBoundary(node.left , lst);
			}
		}
	}
}
