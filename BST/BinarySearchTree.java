package ds;

public class BinarySearchTree {
	/*
	 * BST is a binary tree in which for every node: 1. Left subtree contains the
	 * value less then the node value 2. right subtree contains the value greater
	 * then the node value
	 * 
	 * 60 40 80
	 * 
	 * 30 50 70 75
	 * 
	 * 43 52
	 *
	 *
	 */
	// Property of BST:-
	// inorder traversal-sorted in asceding order
	// left skewed BST,Right Skewed BST so in this case complexity of Height 0(N).
	// balanced BST (no of node in left subtree=no of node in right subtree) Height
	// is in term of O(log N)
	// Balanced BST NO OF NODES AT EACH LEVEL

	// 60 --- 2^0
	// * 40 80 --- 2^1
	// *
	// * 30 50 70 75 --- 2^2
	// * "
	// SO ON
	// 2^N

	// 60
	// 50
	// 40 height = O(N)
	// 30
	// 20
	/*
	 * Complexity of search in binary tree is O(N) Complexity of searching a element
	 * in BST is O(Height) CASE: 1.If BST is balanced so O(log N) 2.If skewed BST so
	 * O(N)
	 */
	class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BinarySearchTree(int[] arr) {

		/*
		 * We need to make a balanced BST so that complexity of searching is not O(N)
		 * but it should be O(logN)
		 */
		/*
		 * [10,20,30,40,50,60,70]
		 * 
		 */
		this.root = construct(arr, 0, arr.length - 1);

	}

	private Node construct(int[] arr, int lo, int hi) {

		// Base case
		if (lo > hi) {
			return null;
		}

		// mid index
		int mid = (lo + hi) / 2;

		// create a new node
		Node nn = new Node();
		nn.data = arr[mid];
		nn.left = construct(arr, lo, mid - 1);
		nn.right = construct(arr, mid + 1, hi);
		return nn;

	}

	public void Display() {
		this.Display(this.root);
	}

	private void Display(Node nn) {
		// TODO Auto-generated method stub
		if(nn==null) {
			return;
		}
		String Str="";
		//Str=Str+nn.left.data+"->"+nn.data+"<-"+nn.right.data;
		if(nn.left!=null) {
			Str=Str+nn.left.data+"->";
		}
		else {
			Str=Str+"END ->";
			
		}
		Str=Str+nn.data;
		
		if(nn.right!=null) {
			Str=Str+"<-"+nn.right.data;
		}
		else {
			Str=Str+"<- END";
			
		}
		System.out.println(Str);
		Display(nn.left);
		Display(nn.right);
		

	}
	public boolean find(int data) {
		return find(this.root,data);
		}
	private boolean find(Node nn,int data) {
		if(nn==null) 
		{
			return false;
		}
		if (nn.data<data) 
		{
			return find(nn.right,data);
		}
		else if(nn.data>data)
		{
			return  find(nn.left,data);
		}
		else 
		{
		return true;
		}
		
	}

	public int max() {
		return max(this.root);
		
		
	}

	private int max(Node nn) {
		if(nn.right==null) {
			return nn.data;
		}
		return max(nn.right);
	}
	
	public void add(int item) {
		add(this.root,item);
		
	}

	private Node add(Node nn,int item) {
		// TODO Auto-generated method stub
		if(nn==null) {
			Node n=new Node();
			n.data=item;
			return n;
		}
		if(nn.data<item) {
			nn.right=this.add(nn.right,item);
		}
		else {
			nn.left=this.add(nn.left, item);// add equal element to the left of the node i.e.
			//50(Node)=50(item)then item is attached to left to node 50
		}
		return nn;
		
		
	}
	
	public void remove(int item) {
		remove(this.root,null,item);// remove(Node node, Node parent, int item)-> parent is parent 
									// of the node given in root case it is null
		}

	
	private void remove(Node node, Node parent, int item) {
		
		if(node.data>item) {
			// item is smaller then node data so we need to search the element to be deleted in left
			this.remove(node.left, node, item);
			
		}
		else if(node.data<item) {
			// item is larger then node data so we need to search the element to be deleted in right
			this.remove(node.right, node, item);
			
		}
		else {
	// if we found the element to be deleted so now we have 3 cases to delete the element from bst
			
			/*
			 * 1. Node with no child:simply remove the node
			 */
			if(node.left==null && node.right==null) {
				// chk if it is a left node or right node of the parent node
				if(parent.data>=node.data) {
					// means node is left child of parent
					parent.left=null;
				}
				else {
					parent.right=null;
				}
			}
			/*
			 * 2. Node with one child: remove the node and replace it will its child
			 */
			// if node has left child
			else if(node.left!=null &&node.right==null) {
				// chk whether node is left child or right child of parent
				if(node.data>parent.data) {
					// right child
					parent.right=node.left;
					
				}
				else {
					parent.left=node.left;
				}
			}
			// if node has right child
						else if(node.left==null &&node.right!=null) {
							// chk whether node is left child or right child of parent
							if(node.data>parent.data) {
								// right child
								parent.right=node.right;
								
							}
							else {
								parent.left=node.right;
							}
						}
			/*
			 * 3. Both child is present of the node: in this case replace node with data of max of 
			 * 	left subtree or mini of right subtree in our case we are replacing it with max of 
			 * 	left subtree
			 */else {
				int temp=max(node.left);
				this.remove(node.left, node, temp);
				node.data=temp;
			}

		}
		
		
	}
}
