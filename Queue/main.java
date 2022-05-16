package ds;

public class main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
	System.out.println("Queue of Int");
	Circular_Queue_using_array cq=new Circular_Queue_using_array();
	cq.enqueue(1);
	cq.enqueue(2);
	cq.enqueue(3);
	System.out.println(cq.toString());
	
	System.out.println("Generic Queue");
	generic_queue<String> gq=new generic_queue<>();
	gq.enqueue("Anshu");
	gq.enqueue("Ama");
	gq.enqueue("Nik");
	gq.enqueue("Ahu");
	gq.enqueue("Inshu");
	
	System.out.println(gq.isEmpty());

	System.out.print(gq.toString());
	
	gq.dequeue();
	gq.dequeue();
	gq.dequeue();
	
	System.out.println(gq.toString());
	gq.enqueue("Anshu");
	gq.enqueue("Ama");
	gq.enqueue("Nik");
	System.out.println(gq.toString());
	System.out.println(gq.dequeue());
	System.out.println(gq.toString());
	System.out.println(gq.dequeue());
	
	
	System.out.println("Dynamic Queue");
	
	
	DyamicQueue dq=new DyamicQueue();
	dq.enqueue(123);
	dq.enqueue(345);
	dq.enqueue(123);
	dq.enqueue(345);
	dq.enqueue(123);
	System.out.println(dq.toString());
	dq.dequeue();
	dq.enqueue(221);
	dq.enqueue(245);
	System.out.println(dq.toString());
	
	System.out.println("Priority Queue");
	
	PriorityQueue pq=new PriorityQueue();
	pq.enqueue(2,5);
	
	}
	

}
