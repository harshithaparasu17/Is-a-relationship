
public class MainRunner {
public static void main(String[] args) {
	
	
	Accountant accountant=new Accountant("Harshitha", 2000, "TaxFile");
	accountant.worksOnTaxFile();
	
	Project faceBook=new Project("FaceBook Advertisents", 15);
	Developer developer=new Developer(faceBook, "Meta", "Ramesh",1500);
	developer.worksOnProject();
	
}
}
