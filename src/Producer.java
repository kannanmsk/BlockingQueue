import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	private BlockingQueue<Message> producerQueue;
	
	public Producer(BlockingQueue<Message> queue)
	{
		this.producerQueue = queue;
	}

	@Override
	public void run() {
		
		for (int i = 1; i <= 5; i++) {
            Message msg = new Message("Msg " + i);
            try {
                Thread.sleep(10);
                producerQueue.put(msg);
                System.out.println("Producer: Message - " + msg.getMessage() + " produced.");
                
            } catch (Exception e) {
                System.out.println("Exception:" + e);
            }
        }
		
		Message msg = new Message("exit");
        try {
        	producerQueue.put(msg);
            System.out.println("Producer: Exit Message - " + msg.getMessage());
        } catch (Exception e) {
            System.out.println("Exception:" + e);
        }
		
	}
	
	
}
