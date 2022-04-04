import queue.Queue;
import queue.queueexceptions.QueueUnderFlowException;

public class MainClass {

	public static void main(String[] args) {
		try {
			Queue queue=new Queue();
			queue.enqueue(1);
			queue.enqueue(201);
			queue.enqueue(3401);
			queue.displayAll();
			queue.dequeue();
			queue.displayAll();
			queue.dequeue();
			queue.displayAll();
			queue.dequeue();
			queue.displayAll();
			queue.dequeue();//Throws error
		} catch (QueueUnderFlowException e) {
			e.printStackTrace();
		}

	}

}
