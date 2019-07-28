package inv.tree;

public class Tree8_KNode {

	public static void main(String[] args) {
		System.out.println("1 -> " + getKthNode(new Node().getFirstTree(),1));
		System.out.println("2 -> " + getKthNode(new Node().getFirstTree(),2));
		System.out.println("3 -> " + getKthNode(new Node().getFirstTree(),3));
		System.out.println("4 -> " + getKthNode(new Node().getFirstTree(),4));
		System.out.println("5 -> " + getKthNode(new Node().getFirstTree(),5));
		System.out.println("6 -> " + getKthNode(new Node().getFirstTree(),6));
		System.out.println("7 -> " + getKthNode(new Node().getFirstTree(),7));
		System.out.println("8 -> " + getKthNode(new Node().getFirstTree(),8));
		System.out.println("9 -> " + getKthNode(new Node().getFirstTree(),9));
		System.out.println("10 -> " + getKthNode(new Node().getFirstTree(),10));
		System.out.println("11 -> " + getKthNode(new Node().getFirstTree(),11));
		System.out.println("12 -> " + getKthNode(new Node().getFirstTree(),12));
		System.out.println("13 -> " + getKthNode(new Node().getFirstTree(),13));
		System.out.println("14 -> " + getKthNode(new Node().getFirstTree(),14));
		System.out.println("15 -> " + getKthNode(new Node().getFirstTree(),15));
		System.out.println("16 -> " + getKthNode(new Node().getFirstTree(),16));
		System.out.println("17 -> " + getKthNode(new Node().getFirstTree(),17));
		System.out.println("18 -> " + getKthNode(new Node().getFirstTree(),18));
	}
	
	public static String getKthNode(Node tree, int k) {
		if(tree == null) return null;
		
		int leftSize = tree.left != null ? tree.left.noOfSubNodes + 1 : 0;
		if(k == leftSize + 1) return tree.name;
		if( k > leftSize) {
			return(getKthNode(tree.right, k - (leftSize+1)));
		}else {
			return(getKthNode(tree.left, k));
		}
		
	}
}
