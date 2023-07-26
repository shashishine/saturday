package Comparable;
import java.util.Arrays;

public class mainclass implements Comparable{
	int id;
	String name;
	int salary;
	public mainclass(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int compareTo(Object o) {
		mainclass q = (mainclass)o;
		return this.salary-q.salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
	class mainclass12{
		public static void main(String[] args) {
			mainclass e1 = new mainclass (1,"sheela",250000);
			mainclass e2 = new mainclass (2,"mala",450000);
			mainclass e3 = new mainclass (3,"priya",550000);
			mainclass[]arr={e1,e2,e3};
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
		}
	}

