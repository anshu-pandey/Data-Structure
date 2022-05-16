package ds;

import java.util.*;
import java.lang.reflect.Array;

public class generic_queue<T> {
	

	

		/*
		 *  Simple Queue
			Circular Queue
			Priority Queue
			Double Ended Queue
		 */
		/*
		 * ****************** Circular Queue *******************
						 * Linear Data Structure
						 * FIFO Principle
						 * Data Members:
						 * 1. Data- it is an array
						 * 2. Front-Variable to keep track of index from where the next element is removed
						 * 3. Size-Number of element present in the queue
						 * 
						 * Functions:
						 * 1. Enqueue: to add the element
						 * 2. dequeue:to Delete the element
						 * 3. getfront: to get the front element
						 * 4. Size: to get the number of element present in queue
						 * 5. isEmpty: weather queue is empty or not (boolean)
						 * 6. Display: display item of queue
		 */
		private T[] data;
		private int front;
		private int size;
		
		/*
		 * The time complexity of enqueue(), dequeue(), peek(), isEmpty() and size() functions is constant, i.e., O(1).
		 */

		
		public generic_queue() {
			this (5);
		}
		

		@SuppressWarnings("unchecked")
		public generic_queue(int capacity) {
			// TODO Auto-generated constructor stub
			
			this.data=(T[]) new Object[capacity];
			this.front=0;
			this.size=0;
		}


		public void enqueue(T item)throws Exception {
			
			if(this.size()==this.data.length) {
				throw new Exception("Queue is full");
				
			}
			int rear=(this.front+this.size)%this.data.length;
			this.data[rear]=item;
			this.size++;
			
		}
		public T dequeue()throws Exception{
			if(this.size==0) {
				throw new Exception("Queue is empty");
				
			}
			T element=this.data[this.front];
			this.data[this.front]=null;
			this.front=(this.front+1)%this.data.length;
			this.size--;
			return element;
		}

		public T getFront()throws Exception{
			if(this.size==0) {
				throw new Exception("Queue is empty");
				
			}
			T element=this.data[this.front];
			return element;
			
		}
		public boolean isEmpty(){
			return this.size==0;
		}
		
		@Override
		public String toString() {
			return "Generic Queue [data=" + Arrays.toString(data) + "]";
		}


		private int size() {
			// TODO Auto-generated method stub
			return this.size;
		}
	}

