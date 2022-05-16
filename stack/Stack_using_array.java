package ds;

public class Stack_using_array{
/*
 * Implementing stack using array
 * Default capacity is of 5 
 * Principle of Last in first out
 * We are using array of name data to store item
 * And a variable tos-i.e. top of stack which points to the index of the top most element in the stack
 * Initially the tos is at -1; 
 * Functions made:
 * 1. stack_using_array()-Default constructor
 * 2. stack_using_array(Capacity)-Parameterized constructor
 * 3. push(item)-add item on top of stack
 * 4. pop()-remove top most element and return it
 * 5. peek()-return the top most element 
 * 6. size()-return the size of the stack
 * 7. isempty()-return boolean value wheather stack is empty or not
 * 8. display()-display the item in the stack
 */
	
	private int[]data;
	private int tos;
	public Stack_using_array() {
		this (5);
		
	}
	public Stack_using_array(int capacity) {
		// TODO Auto-generated constructor stub
		this.data=new int[capacity];
		this.tos=-1;
		
	}
	public void push(int item) throws Exception
	{
		if(this.size()==this.data.length) 
		{
			throw new Exception("Stack is Full");
			
		}
		this.tos++;
		this.data[this.tos]=item;
		
	}
	private int size() 
	{
		return this.tos+1;
	}
	public int pop() throws Exception
	{
		
		if(this.size()==0)
			throw new Exception("Stack is empty");
		
		int element=this.data[this.tos];
		this.data[this.tos]=0;
		this.tos--;
		return element;
	}
	public int peek() throws Exception{
		if(this.size()==0)
			throw new Exception("Stack is empty");
		int element=this.data[tos];
		return element;
	}
	public boolean isEmpty() {
		return this.size()==0;	
	}
	public void Display(){
		for (int i :data) {
			System.out.println(i);
		}
	}
	
}
