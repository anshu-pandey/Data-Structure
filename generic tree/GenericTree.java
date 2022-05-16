package ds;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree {

	class Node {
		int data; // Contains the value of parent node
		ArrayList<Node> children; // Pointing to the Nodes of children of that
		// present Node

		Node(int data) {
			/*
			 * we are making a constructor to init arraylist and insert the data in
			 * Node.data i.e. the parent and init the children so that we can point towards
			 * the children of the pesent node
			 */
			this.data = data;
			this.children = new ArrayList<>();
		}
	}

	private Node root;
	private int size;

	GenericTree() {
		Scanner s = new Scanner(System.in);
		/*
		 * In takeinput we are giving 3 parameters s i.e the scanner and parent which
		 * tells the parent of that node for root the parent is null and ithchild which
		 * tells about the present node is which no of child of its parent and for
		 * parent it is 0. 
		 * 
		 * 				|root| ----------------------- parent of root is null and so
		 */
	     //	it is not a child so in parent it is null but we need to make a recursive
		// fuction so we need to pass here 0 but we can handle this case using root condition
	
		
		/*|child 0| |child 1| |child2| .... |child n|----- parent is root and in*/
		// ithchild it will be there index resp
		
		this.root = takeinput(s, null, 0);
	}

	/*
	 * takeinput function will build the entire tree and return the top most node
	 * i.e. the parent node .and this.root will have the reference to that node.
	 */
	private Node takeinput(Scanner s, Node parent, int ithchild) {
		// so we need to take inputs to make the tree
		
		if(parent==null) {
			// we tree is not constructed i.e. there is no node in the tree then in start
			// parent is null
			// so we need to put the value for the parent node
			// parent---->null 
			System.out.println("Enter the data for the root node ");
	
		}
		else {
			System.out.println("Enter the data for the "+ithchild+"th child of "+parent.data);
		}
		int nodedata=s.nextInt();
		Node node=new Node(nodedata); // node --> [nodedata][children]  
		// node will point to the new node whos data is nodedata and arraylist will be init 
		// using constructor
		this.size++;
		System.out.println("Enter the number of children for "+node.data);
		// Execute according to the number of children
		int children=s.nextInt();
		for(int i=0;i<children;i++) {
			Node child=this.takeinput(s,node, i);
			node.children.add(child);
		}
		return node;

	}
	public void display() {
		this.display(this.root);
	}
	private void display(Node node) {
		String str=node.data+"=>";
		for(int i=0;i<node.children.size();i++) {
			str=str+node.children.get(i).data+", ";
		}
		str=str+"END";
		System.out.println(str);
		for(int i=0;i<node.children.size();i++) {
			this.display(node.children.get(i));
		}
	}

}
