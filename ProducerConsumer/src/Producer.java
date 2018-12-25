class Producer implements Runnable{
	private String name;
	private Person person;
	
	public Producer(String name, Person person){
		this.name = name;
		this.person = person;
	}
	
	public void run(){
		while(true){
			try{
				person.produce();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
}
