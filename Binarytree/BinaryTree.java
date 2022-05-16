package ds;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
// a tree is called binary tree if each node has 0 or atmost 2 nodes
	/*
	 * Each node of the binary tree is represented as a class of Node which has 3
	 * componment 1- data for type int in which we store int data of that node 2-
	 * left- of type node -it has the reference to the left child node of that
	 * present node 3-right-of type node -it has the reference to the right child
	 * node of that present node
	 */
	private class Node {

		int data;
		Node left;
		Node right;

		// constructor
		Node(int data, Node left, Node right) {

			this.data = data;
			this.left = left;
			this.right = right;
		}

	}

	private Node root = null;
	private int size = 0;

	BinaryTree() {
		// TODO Auto-generated constructor stub
		Scanner s = new Scanner(System.in);
		// as the root node does not have any parent and
		/*
		 * takeinput takes scanner object, parent node and boolean isleftorright which
		 * tells that the present node is left child or right child isleftorright is
		 * true if the present node is left child
		 */
		// as root does not have any parent so we put null in parent and false as it is
		// neither
		// left or right child
		this.root = takeInput(s, null, false);

	}

	private Node takeInput(Scanner s, Node parent, boolean isLeftorright) {
		// TODO Auto-generated method stub
		if (parent == null) {
			System.out.print("Enter the data for root node");
		} else {
			if (isLeftorright) {
				System.out.println("Enter the data for left child of " + parent.data);
			} else {
				System.out.println("Enter the data for right child of " + parent.data);
			}

		}
		int nodeData = s.nextInt();
		Node node = new Node(nodeData, null, null);
		this.size++;

		boolean choice = false;
		System.out.println("Do you have left child of " + node.data);
		choice = s.nextBoolean();
		if (choice) {
			node.left = takeInput(s, node, true);

		}
		choice = false;
		System.out.println("Do you have right child of " + node.data);
		choice = s.nextBoolean();
		if (choice) {
			node.right = takeInput(s, node, false);

		}
		return node;
	}

	public void display() {
		display(this.root);
	}

	private void display(Node node) {
		// TODO Auto-generated method stub
		String str = "";
		if (node.left != null) {
			str = str + node.left.data + "=>";

		} else {
			str = str + "END =>";
		}

		str = str + node.data;

		if (node.right != null) {
			str = str + "<=" + node.right.data;
		} else {
			str = str + "<= END";
		}

		System.out.println(str);

		if (node.left != null) {
			this.display(node.left);
		}
		if (node.right != null) {
			this.display(node.right);
		}
	}

	public int height() {
		return this.height(this.root);

	}

	private int height(Node node) {
		if (node == null) {
			return -1;
		}
		int lheight = this.height(node.left);
		int rheight = this.height(node.right);
		int height = Math.max(lheight, rheight) + 1;

		return height;
	}

	// preorder- node left right
	public void preOrder() {
		this.preOrder(this.root);
	}

	private void preOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + ",");
		preOrder(node.left);
		preOrder(node.right);

	}

	// postorder- left right node
	public void postOrder() {
		this.postOrder(this.root);
	}

	private void postOrder(Node node) {
		if (node == null) {
			return;
		}

		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + ",");

	}

	// inorder- left node right
	public void inOrder() {
		this.inOrder(this.root);
	}

	private void inOrder(Node node) {
		if (node == null) {
			return;
		}

		inOrder(node.left);
		System.out.print(node.data + ",");
		inOrder(node.right);

	}
	// level order
	/*
	 * each node is processed level by level from left to right before any nodes in
	 * their subtrees
	 */

	public void LevelOrder() {
		this.LevelOrder(this.root);
	}

	private void LevelOrder(Node node) {
		/*
		 * 
		 * Queue <Node>queue=new Queue<Node>(); 
		 * A Queue is an interface, which means you
		 * cannot construct a Queue directly. The best option is to construct off a
		 * class that already implements the Queue interface like LinkedList
		 * 
		 */
		
		Queue<Node>queue=new LinkedList<>();
		queue.add(this.root);
		while(!queue.isEmpty()) {
			Node rm=queue.remove();
			System.out.print(rm.data+",");
			if(rm.left!=null) {
				queue.add(rm.left);
				
			}
			
			if(rm.right!=null) {
				queue.add(rm.right);
				
			}
			
		}

	}
}
