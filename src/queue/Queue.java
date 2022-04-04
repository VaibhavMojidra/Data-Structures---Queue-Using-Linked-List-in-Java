package queue;

import queue.queueexceptions.QueueUnderFlowException;

public class Queue {
	
	private Node front;
	private Node rear;
	private int count;
	
	public Queue() {
		front=null;
		rear=null;
		count=0;
	}

	public boolean enqueue(int data) { //O(1)
		Node newNode=new Node();
		newNode.setData(data);
		if(count==0) {
			front=newNode;
			rear=newNode;
		}else {
			rear.setNext(newNode);
			rear=newNode;
		}
		count++;
		return true;
	}
	
	public boolean dequeue() throws QueueUnderFlowException { //O(1)
		if(isEmpty()) {
			throw new QueueUnderFlowException("Queue is empty");
		}else {
			front=front.getNext();
			count--;
		}
		return true;
	}
	
	public int peek() throws QueueUnderFlowException { //O(1)
		if(isEmpty()) {
			throw new QueueUnderFlowException("Queue is empty");
		}else {
			return front.getData();
		}
	}
	
	public boolean isEmpty() { //O(1)
		return count==0;
	}
	
	public void displayAll() { //O(n)
		Node temp=front;
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println("");
	}
}
