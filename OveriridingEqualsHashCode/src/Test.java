import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Person, Integer> map = new HashMap<Person, Integer>();
		Person p1 = new Person("Fei", 21, 1221);
		Person p2 = new Person("Fei", 21, 1221);
		Employer p3 = new Employer("Fei", 21, 1221, 1);
		Employer p4 = new Employer("Fei", 22, 1221, 1);
		System.out.println(p3.equals(p1));
//		System.out.println(p4.equals(p3));
//		
//		map.put(p1, p1.getAge());
//		System.out.println(map.get(p1));
//		System.out.println(map.get(p2));
	}

}
