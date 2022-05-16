package ds;

public class BST {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		BinarySearchTree bst=new BinarySearchTree(arr);
		bst.Display();
		System.out.println(bst.find(77));
		System.out.println(bst.max());
		bst.remove(10);
		bst.Display();
	}
	

}
