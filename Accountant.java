
public class Accountant extends Employee {
  
	String fileName;
	
	
	
	public Accountant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Accountant(String name, int salary, String fileName) {
		super(name,salary);
		this.fileName = fileName;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
	public void worksOnTaxFile()
	{
		System.out.println(name); 
		System.out.println(fileName);	
		System.out.println(salary);
	
		
	}
	@Override
	public String toString() {
		return "Accountant [fileName=" + fileName + "]";
	}
	
}
