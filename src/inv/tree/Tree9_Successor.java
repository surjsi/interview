package inv.tree;

public class Tree9_Successor {

	public static void main(String[] args) {
		Node node = new Node().getFirstTree();
		//node = node.left.right.right;//G
		//node = node.left.left.left;//D
		//node = node.left.right.right.left;//H
		
		System.out.println(getSuccessor(node).name);
	}
	public static Node getSuccessor(Node tree) {
		Node iter = tree;
		if(iter.right != null) {
			iter = iter.right;
			while(iter.left != null) {
				iter = iter.left;
				
			}
			return iter;
		}
		while(iter.parent != null && iter.parent.right == iter) iter = iter.parent;
		return iter.parent;
	}
}
