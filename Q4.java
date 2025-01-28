
abstract class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	 abstract void display();
}
class Employe extends Person{
	private int EmployeeID;
	private int salary;

	public Employe(String name, int age,int EmployeeID,int salary) {
		super(name, age);
		this.EmployeeID=EmployeeID;
		this.salary=salary;
	}
	public void display() {
		System.out.println("Name:"+getName()+"\nAge:"+getAge()+"\nEmployeeID:"+this.getEmployeeID()+"\nSalary: "+this.getSalary());
	}
	public int getEmployeeID() {
		return EmployeeID;
	}
	public int getSalary() {
		return salary;
	}
}
class Developer extends Employe{
	private String lang;
	private String project;
	public Developer(String name, int age, int EmployeeID, int salary,String language,String project) {
		super(name, age, EmployeeID, salary);
		this.lang=language;
		this.project=project;
	}
	@Override public void display() {
		System.out.println("Name:"+getName()+"\n Age:"+getAge()+"\nEmployeeID:"+this.getEmployeeID()+"\nSalary: ₹"+this.getSalary());
		System.out.println("Languages: "+this.lang+"\nProject: "+this.project);
	}
}
public class Q4 {
	public static void main(String[] args) {
		Person P1= new Developer("Yash",26,25465,80000,"Java","Oracle");
		P1.display();
		
	}
}
