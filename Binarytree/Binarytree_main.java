package ds;

public class Binarytree_main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree=new BinaryTree();
		tree.display();
		System.out.print("Height of the tree "+tree.height());
		System.out.println();
		System.out.println("IN_ORDER");
		tree.inOrder();
		System.out.println();
		System.out.println("POST_ORDER");
		tree.postOrder();
		System.out.println();
		System.out.println("PRE_ORDER");
		tree.preOrder();
		System.out.println();
		System.out.println("LEVEL_ORDER");
		tree.LevelOrder();
		
	}
//50 true 25 true 38 false false true 48 true 18 false false false true 45 false false 
}
