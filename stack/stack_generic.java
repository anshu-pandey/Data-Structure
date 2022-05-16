package ds;

import java.util.*;
public class stack_generic<T> {
/*
 * This is a generic stack implemented using arraylist with default capacity of 5;
 * 
 */
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
		
		private ArrayList<T> data;//if we create a array of type T then there is a compile error
		// so making array of object
		private int tos;
		private int sizeofstack;
		public stack_generic() {
			this (5);
			
		}
		
		public stack_generic(int capacity) {
			// TODO Auto-generated constructor stub
			this.data = new ArrayList<T>(capacity);
			this.tos=-1;
			this.sizeofstack=capacity;
			
		}
		
		public void push(T item) throws Exception
		{
			if(this.size()==this.sizeofstack) 
			{
				throw new Exception("Stack is Full");
				
			}
			this.tos++;
			this.data.add(item);
			
		}
		
		private int size() 
		{
			return this.tos+1;
		}
		
		public T pop() throws Exception
		{
			
			if(this.size()==0)
				throw new Exception("Stack is empty");
			
			T element=this.data.get(this.tos);
			this.tos--;
			return element;
		}
		
		public T peek() throws Exception{
			if(this.size()==0)
				throw new Exception("Stack is empty");
			T element=this.data.get(this.tos);
			return element;
		}
		
		public boolean isEmpty() {
			return this.size()==0;	
		}
		
		public void Display(){
			for (int i=0;i<=tos;i++) {
				System.out.println(this.data.get(i));
			}
		}
		
	}


