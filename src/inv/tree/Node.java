package inv.tree;

public class Node {

	public String name;
	public Integer value;
	public Node left;
	public Node right;
	public Node parent;
	public int noOfSubNodes = 0;
	public Node() {}
	public Node(String name, Integer value, Node left, Node right) {
		this.name = name;
		this.value = value;
		this.left = left;
		this.right = right;
	}
	
	public Node(String name, Integer value, Node left, Node right, Node parent) {
		this.name = name;
		this.value = value;
		this.left = left;
		this.right = right;
		this.parent = parent;
	}

	public Node getFirstTree() {
		
		/*
		                     A(314)
		                  /         \    
		               /               \
		            /                     \
		         B(6)                       I(6)
		       /     \                         /  \ 
		     /         \                     /      \
		   C(271)        F(561)          J(2)       O(271)
		 /   \             \              \            \
	   /       \             \              \            \
	 D(28)     E(0)          G(3)            K(1)        P(28)
	                        /               /  \
	                      /               /      \
	                     H(17)          L(401)   N(257)
	                     			     \
	                     			       \
	                     			      M(641) 
	                     			     /
	                     			   /
	                     			  Q(23)
	   

	      [D, C, E, B, F, H, G, A, J, L, Q, M, K, N, I, O, P]

		 */
		
		Node Q = new Node("Q", 23, null, null);
		
		Node M = new Node("M", 641, Q, null);
		
		Node H = new Node("H", 17, null, null);
		//Node L = new Node("L", 401, null, null);
		Node L = new Node("L", 401, null, M);
		Node N = new Node("N", 257, null, null);
		Node P = new Node("P", 28, null, null);
		
		
		Node D = new Node("D", 28, null, null);
		Node E = new Node("E", 0, null, null);
		Node G = new Node("G", 3, H, null);
		Node K = new Node("K", 1, L, N);
		
		Node C = new Node("C", 271, D, E);
		Node F = new Node("F", 561, null, G);
		Node J = new Node("J", 2, null, K);
		Node O = new Node("O", 271, null, P);
		Node B = new Node("B", 6, C, F);
		Node I = new Node("I", 6, J, O);
		Node root = new Node("A", 314, B, I);
		
		root.noOfSubNodes = 16;
		B.noOfSubNodes = 6;
		C.noOfSubNodes = 2;
		F.noOfSubNodes = 2;
		G.noOfSubNodes = 1;
		I.noOfSubNodes = 8;
		O.noOfSubNodes = 1;
		J.noOfSubNodes = 5;
		K.noOfSubNodes = 4;
		L.noOfSubNodes = 2;
		M.noOfSubNodes = 1;
		
		I.parent = root;
		J.parent = I;
		O.parent = I;
		K.parent = J;
		L.parent = K;
		N.parent = K;
		M.parent = L;
		P.parent = O;
		
		
		B.parent = root;
		C.parent = B;
		F.parent = B;
		D.parent = C;
		E.parent = C;
		G.parent = F;
		H.parent = G;
		Q.parent = M;
		return root;
	}
}
