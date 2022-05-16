package ds;

import java.util.ArrayList;

public class genericHeap<T extends Comparable <T>> {
	ArrayList<T>data;
	public genericHeap() {
		// TODO Auto-generated constructor stub
		this.data=new ArrayList<>();
		
	}
	public void add(T item) {
		this.data.add(item);
		upheapify(data.size()-1);
	}
	private void upheapify(int ci) {
		int pi=(ci-1)/2;
		if(isLarger(this.data.get(pi),this.data.get(ci))>0) {
			// if child priyority is > then parent then swap
			swap(ci,pi);
			upheapify(pi);
		}
		
		
		
	}
	private void swap(int ci, int pi) {
		// TODO Auto-generated method stub
		T ith=data.get(ci);
		T jth=data.get(pi);
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
	public T remove() {
		swap(0,this.data.size()-1);
		T rv=this.data.remove(this.data.size()-1);
		downheapify(0);// to validate the property of the heap after removing the min element
		return rv;
	}
	private void downheapify(int pi) {
		int left_index=2*pi+1;
		int right_index=2*pi+2;
		int mini=pi;
		if(left_index<data.size()&&isLarger(this.data.get(left_index),this.data.get(mini))>0) {
			mini=left_index;
		}
		if(right_index<data.size()&&isLarger(this.data.get(right_index),this.data.get(mini))>0) {
			mini=right_index;
		}
		if(mini!=pi) {
			swap(mini,pi);
			downheapify(mini);
			
		}
		
	}
	public int isLarger(T t ,T o) {
		return t.compareTo(o);// if t priyority is larger then o then Postive value is returned else
		// negitive value
	}
}