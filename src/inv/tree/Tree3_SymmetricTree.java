package inv.tree;

public class Tree3_SymmetricTree {

	public static void main(String[] args) {
		testPositive();
		testNegative();
	}
	
	public static boolean checkSymmetry(Node root) {
		if(root == null) return true;
		
		return checkSymmetry(root.left, root.right);
	}
	
	public static boolean checkSymmetry(Node left, Node right) {
		if(left == null && right == null) return true;
		if(left != null && right != null) return (left.value == right.value) && checkSymmetry(left.left, right.right) && 
				checkSymmetry(left.right, right.left);
		return false;
	}
	
	public static void testPositive() {
		Node G = new Node("G", 1, null, null);
		Node F = new Node("F", 2,  G, null);
		Node D = new Node("J", 1, null, null);
		Node C = new Node("C", 2, null, D);
		Node B = new Node("B", 6, null, C);
		Node E = new Node("E", 6, F, null);
		Node node = new Node("A", 314, B, E);	
		
		System.out.println("testPositive : "+checkSymmetry(node));
		
	}
	
	public static void testNegative() {
		Node F = new Node("F", 2,  null, null);
		Node D = new Node("J", 1, null, null);
		Node C = new Node("C", 2, null, D);
		Node B = new Node("B", 6, null, C);
		Node E = new Node("E", 6, F, null);
		Node node = new Node("A", 314, B, E);
		
		System.out.println("testNegative : "+checkSymmetry(node));
	}
}
