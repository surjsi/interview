package inv.tree;

class LCaStatus{
	int noOfFoundNodes;
	Node ancestor;
	public LCaStatus(int noOfFoundNodes, Node ancestor) {
		super();
		this.noOfFoundNodes = noOfFoundNodes;
		this.ancestor = ancestor;
	}
	
}
public class LowestCommonAncestor4 {
	
	public static void main(String[] args) {
		Node node = new Node();
		Node root = node.getFirstTree();
		Node M = root.right.left.right.left.right;
		Node N = root.right.left.right.right;
		Node L = root.right.left.right.left;
		LCaStatus status = findLCA(root, M, M);
		if(status.ancestor != null)
		System.out.println(status.ancestor.name);
		status = findLCA(root, N, L);
		if(status.ancestor != null)
		System.out.println(status.ancestor.name);
		System.out.println("M and M : "+ findLCAWithParent(M, M).name);
		System.out.println("N and L : "+ findLCAWithParent(N, L).name);
		System.out.println("N and M : "+ findLCAWithParent(N, M).name);
		System.out.println("L and M : "+ findLCAWithParent(L, M).name);
	}
	
	public static LCaStatus findLCA(Node root, Node node0, Node node1) {
		if(root == null) return new LCaStatus(0, null);
		LCaStatus leftStatus = findLCA(root.left, node0, node1);
		if(leftStatus.noOfFoundNodes == 2) return leftStatus;
		
		LCaStatus rightStatus = findLCA(root.right, node0, node1);
		if(rightStatus.noOfFoundNodes == 2) return rightStatus;
		
		int noOfFoundNodes = leftStatus.noOfFoundNodes + rightStatus.noOfFoundNodes 
				+ (root.left == node0 ? 1 : 0) + (root.left == node1 ? 1 : 0)
				+ (root.right == node0 ? 1 : 0) + (root.right == node1 ? 1 : 0);
		Node ancestor = noOfFoundNodes == 2 ? root : null;
		return new LCaStatus(noOfFoundNodes, ancestor);
	}
	
	public static Node findLCAWithParent(Node node0, Node node1) {
		
		int d0 = getDepth(node0), d1 = getDepth(node1) ;
		if(d1 > d0) {
			Node tmp = node0;
			node0 = node1;
			node1 = tmp;
		}
		int diff = Math.abs(d0 - d1);
		while(diff-- > 0) {
			node0 = node0.parent;
		}
		if(node0 == node1) {
			return node0.parent;
		}
		
		while(node0 != node1) {
			node0 = node0.parent;
			node1 = node1.parent;
		}
		
		return node0;
	}
	
	public static int getDepth(Node node) {
		int depth = 0;
		while(node.parent != null) {
			
			node = node.parent;
			depth++;
		}
		return depth;
	}
}
