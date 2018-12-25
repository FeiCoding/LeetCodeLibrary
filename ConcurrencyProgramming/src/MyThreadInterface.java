class MyThreadInterface implements Runnable {
	private int count = 0;
	private int time;

	public MyThreadInterface(int time) {
		this.time = time;
	}

	public void run() {
		synchronized (this) {
			while (count < 6) {
				try {
					Thread.sleep(time);
					System.out.println("Thread:" + Thread.currentThread().getName() + " " + count);
					count++;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			count = 0;
		}
	}
}
