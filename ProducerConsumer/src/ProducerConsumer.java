
public class ProducerConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		new Thread(new Consumer("c1", p)).start();
		new Thread(new Consumer("c2", p)).start();
		new Thread(new Producer("p1", p)).start();
		new Thread(new Producer("p2", p)).start();
	}

}


