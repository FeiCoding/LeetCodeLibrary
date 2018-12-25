
class Consumer implements Runnable {

	private String name;
	private Person person;

	public Consumer(String name, Person person) {
		this.name = name;
		this.person = person;
	}

	public void run() {
		while (true) {
			try {
				person.consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
