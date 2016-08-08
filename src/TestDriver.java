
public class TestDriver {

	public static void main(String[] args) {
		
		Queue blockQueue = Queue.getInstance();
		
		Producer prod = new Producer(blockQueue.getQueue());
		Consumer cons = new Consumer(blockQueue.getQueue());
		
		new Thread(prod).start();
        new Thread(cons).start();
        
        System.out.println("Producer / Consumer Test Started.\n");
	}

}
