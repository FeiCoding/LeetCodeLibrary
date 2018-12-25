
class Box<T extends Comparable<T>> implements Comparable<Box<T>> {
	private T item;
	
	public T get(){
		return item;
	}
	
	public int compareTo(Box<T> obj){
		return get().compareTo(obj.get());
	}
}
