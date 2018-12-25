import java.util.Objects;

class Employer extends Person{
	private int id;
	public Employer(String name, int age, int passport, int id){
		super(name, age, passport);
		this.id = id;
	}
	public int getId(){
		return id;
	}
	
	public boolean equals(Object obj){
		if(this == obj) return true;
		if(obj == null) return false;
		if(getClass() == obj.getClass()){
			Employer em = (Employer) obj;
			return getName() == em.getName() && getAge() == em.getAge() && getPass() == em.getPass() && id == em.getId();	
		}
		else return super.equals(obj);
	}
	
	public int hashCode(){
		return Objects.hash(getName(), getAge(), getPass(), id);
	}
	
}
