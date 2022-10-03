import java.util.Scanner;

public class Employee {

	String name;
	int salary;
	


	public Employee() {
		super();
	}
	

	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	void Login()
	{
		Scanner os=new Scanner(System.in);
		Scanner osStr=new Scanner(System.in);
		System.out.println("enter the name:");
		String name=osStr.next();
		System.out.println("enter the salary:");
		int salary=os.nextInt();
		
	}
	
}
