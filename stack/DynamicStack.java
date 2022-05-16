package ds;

public class DynamicStack extends Stack_using_array{

	public DynamicStack() throws Exception{
		// TODO Auto-generated constructor stub
		this (5);
		
	}
	public DynamicStack(int capacity) throws Exception{
		// TODO Auto-generated constructor stub
		super(capacity);
		
		
	}
	public void push(int item) throws Exception {
		if(this.size()==this.data.length) {
			int[] arr=new int[this.data.length*2];
			for(int i=0;i<this.size();i++) {
				arr[i]=this.data[i];
				
			}
			this.data=arr;
			
		}
		super.push(item);
		
	}

	

}
