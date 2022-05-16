package ds;

public class main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	Stack_using_array stack=new Stack_using_array();
	stack.push(5);
	stack.push(10);
	stack.push(15);
	stack.Display();
	System.out.println(stack.peek());
	stack.pop();
	System.out.println(stack.pop());
	stack.pop();
	System.out.println(stack.isEmpty());
	
	System.out.println("generci array of string");
	/// generic array
	
	stack_generic<String>stack1=new stack_generic<>();

	stack1.push("anshu");
	System.out.println(stack1.peek());
	stack1.push("N");
	System.out.println(stack1.pop());
	System.out.println(stack1.isEmpty());
	
	System.out.println("generci array of Int");
	stack_generic<Integer>stack2=new stack_generic<>();
	stack2.push(1);
	System.out.println(stack2.peek());
	stack2.push(2);
	System.out.println(stack2.pop());
	System.out.println(stack2.isEmpty());
	
	
	}
	

}
