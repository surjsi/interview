package inv.tree;

public class Tree1_Traverse {
	
	public static void main(String[] args) {
		Node node = new Node();
		Node root = node.getFirstTree();
		System.out.println("");
		System.out.println("Pre-Order starts");
		System.out.println("");
		preOrderTraverse(root);
		System.out.println("");
		System.out.println("");
		System.out.println("In-Order starts");
		System.out.println("");
		inOrderTraverse(root);
		System.out.println("");
		System.out.println("");
		System.out.println("Post-Order starts");
		System.out.println("");
		postOrderTraverse(root);
		
	}
	
	public static void inOrderTraverse(Node tree) {
		if(tree != null) {
			inOrderTraverse(tree.left);
			System.out.print(tree.name+"("+tree.value+")"+" --> ");
			inOrderTraverse(tree.right);
		}
	}
	
	public static void preOrderTraverse(Node tree) {
		if(tree != null) {
			System.out.print(tree.name+"("+tree.value+")"+" --> ");
			preOrderTraverse(tree.left);
			
			preOrderTraverse(tree.right);
		}
	}

	public static void postOrderTraverse(Node tree) {
		if(tree != null) {
			postOrderTraverse(tree.left);
			
			postOrderTraverse(tree.right);
			System.out.print(tree.name+"("+tree.value+")"+" --> ");
		}
	}

}
