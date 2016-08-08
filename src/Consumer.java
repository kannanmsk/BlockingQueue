import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

private BlockingQueue<Message> consumerQueue;
	
	public Consumer(BlockingQueue<Message> queue)
	{
		this.consumerQueue = queue;
	}

	@Override
	public void run() {
		
		try {
            Message msg;
            
            while ((msg = consumerQueue.take()).getMessage() != "exit") {
                Thread.sleep(10);
                System.out.println("Consumer: Message - " + msg.getMessage() + " consumed.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
	}
	
	
}
