package inv.tree;

class BalancedTree{
	int height;
	boolean isBalanced;
	Node node;
	public BalancedTree(Node node, boolean isBalanced, int height) {
		super();
		this.node = node;
		this.height = height;
		this.isBalanced = isBalanced;
		
	}
	
}
public class Tree2_HeightBalanced {
	
	public static void main(String[] args) {
		Node node = new Node();
		Node root = node.getFirstTree();
		System.out.println(isBalanced(root));
	}
	
	public static boolean isBalanced(Node root) {
		BalancedTree bt = checkBalanced(root);
		System.out.println("Result node : "+ bt.node.name+" (Height : "+bt.height+" , isBalanced : "+bt.isBalanced+")");
		return bt.isBalanced;
	}
	
	public static BalancedTree checkBalanced(Node root) {
		if(root == null)
			return new BalancedTree(root, true, -1);
		else {
			//System.out.println("[ "+root.name+" ]");
			BalancedTree left = checkBalanced(root.left);
			
			if(!left.isBalanced) { return left; }
			 
			BalancedTree right = checkBalanced(root.right);
			
			if(!right.isBalanced) { return right; }
			
			boolean isBalanced = Math.abs(left.height - right.height) <= 1;
			int height = Math.max(left.height , right.height) + 1;
			System.out.println(root.name+"( Left height : "+(left.height+1)+" , Right Height : "+(right.height+1)+" ,isBalanced : "+isBalanced+")");
			return new BalancedTree(root, isBalanced, height);
		}
	}
	
}
