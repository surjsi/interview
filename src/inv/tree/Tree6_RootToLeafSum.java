package inv.tree;

class Result{
	Node node;
	boolean hasPath;
	public Result(Node node, boolean hasPath) {
		super();
		this.node = node;
		this.hasPath = hasPath;
	}
	
}

public class Tree6_RootToLeafSum {

	public static void main(String[] arges) {
		Node root = new Node();
		Result node = findRootToLeafSum(root.getFirstTree(), 592);
		System.out.println(node.node.name+" --- "+ node.hasPath);
		hasPath(root.getFirstTree(), 592);
	}
	
	public static Result findRootToLeafSum(Node root, int sum) {
		
		if(root == null) return new Result(root, false);
		if(root.value == sum && root.left == null && root.right == null) return new Result(root, true);
		int val = sum - root.value;
		Result left = findRootToLeafSum(root.left, val);
		if(left.hasPath) return left;
		//if(left != null && left.value == val && (left.left == null && left.right == null)) return left;
		
		Result right = findRootToLeafSum(root.right, val);
		if(right.hasPath) return right;
		//if(right != null && right.value == val && (right.left == null && right.right == null)) return right;
		
		return new Result(root, false);
	}
	
	public static boolean hasPath(Node tree, int sum) {
		if(tree == null) return false;
		if(tree.left == null && tree.right == null ) {
			boolean st = sum == tree.value;
			if(st) {System.out.println(tree.name);}
			return st;
		}
		return hasPath(tree.left, sum - tree.value) || hasPath(tree.right, sum - tree.value);
	}
}
