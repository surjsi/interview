package inv.tree;

public class RootToLeafSum6 {

	public static void main(String[] arges) {
		Node root = new Node();
		Node node = findRootToLeafSum(root.getFirstTree(), 591);
		System.out.println(node.name);
	}
	
	public static Node findRootToLeafSum(Node root, int sum) {
		
		if(root == null) return null;
		if(root.value == sum) return root;
		int val = sum - root.value;
		Node left = findRootToLeafSum(root.left, val);
		if(left.value == val && (left.left != null && left.right != null)) return left;
		
		Node right = findRootToLeafSum(root.right, val);
		if(right.value == val && (right.left != null && right.right != null)) return right;
		
		return null;
	}
}
