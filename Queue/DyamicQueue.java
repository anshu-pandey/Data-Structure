package ds;

public class DyamicQueue extends Circular_Queue_using_array {

	public DyamicQueue() throws Exception {
		// TODO Auto-generated constructor stub
		
		this(5);
	}

	public DyamicQueue(int capacity) {
		// TODO Auto-generated constructor stub
		super(capacity);
	}
	public void enqueue(int item)throws Exception {
		if(this.size==this.data.length) {
			int []arr=new int[2*this.data.length];
			for (int i=0;i<this.data.length;i++) {
				
			
			arr[i]=this.data[(this.front+i)%this.data.length];
			}
			this.data=arr;
			this.front=0;
			
		}
		super.enqueue(item);
	}
	

}
