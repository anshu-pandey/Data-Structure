package ds;

import java.util.ArrayList;

public class Heaps {
	ArrayList<Integer>data;
	public Heaps() {
		// TODO Auto-generated constructor stub
		this.data=new ArrayList<>();
		
	}
	public void add(int item) {
		this.data.add(item);
		upheapify(data.size()-1);
	}
	private void upheapify(int ci) {
		int pi=(ci-1)/2;
		if(this.data.get(pi)>this.data.get(ci)) {
			swap(ci,pi);
			upheapify(pi);
		}
		
		
		
	}
	private void swap(int ci, int pi) {
		// TODO Auto-generated method stub
		int ith=data.get(ci);
		int jth=data.get(pi);
		data.set(ci,jth);
		data.set(pi,ith);
	}
	
	public  void Display() {
		System.out.print(this.data);
	}
	public int size() {
		return this.data.size();
	}

	public boolean isEmpty() {
		return size()==0;
	}
	/* 
	 * when we remove the element it will remove the smallest element as small element
	 * has higher priyoties.
	*/
	public int remove() {
		swap(0,this.data.size()-1);
		int rv=this.data.remove(this.data.size()-1);
		downheapify(0);// to validate the property of the heap after removing the min element
		return rv;
	}
	private void downheapify(int pi) {
		int left_index=2*pi+1;
		int right_index=2*pi+2;
		int mini=pi;
		if(left_index<data.size()&&this.data.get(left_index)<this.data.get(pi)) {
			mini=left_index;
		}
		if(right_index<data.size()&&this.data.get(right_index)<this.data.get(mini)) {
			mini=right_index;
		}
		if(mini!=pi) {
			swap(mini,pi);
			downheapify(mini);
			
		}
		
	}
}
