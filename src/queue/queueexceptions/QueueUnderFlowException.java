package queue.queueexceptions;

public class QueueUnderFlowException extends Exception{
	
	public QueueUnderFlowException(String message) {
		super(message);
	}
}
