import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Queue {

	private static Queue instance;
	private BlockingQueue<Message> blockingQueue;
	
	private Queue(){
		blockingQueue = new ArrayBlockingQueue<>(10);
	}
	
	public static Queue getInstance()
	{
		if(instance == null)
		{
			instance = new Queue();
			return instance;
		}
		
		return instance;
	}
	
	public BlockingQueue<Message> getQueue()
	{
		return blockingQueue;
	}
	
}
