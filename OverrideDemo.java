package chandana;
 class Employee
 {
	 int empID;
	 String name;
	 String phone;
	 double salary;
	 
	 public Employee(int empID,String name,String phone,double salary)
	 {
		 this.empID=empID;
		 this.name=name;
		 this.phone=phone;
		 this.salary=salary;
	 }
	 public void displayDetails() {
		 System.out.println("Employee ID:"+empID);
		 System.out.println("Name:"+name);
		 System.out.println("Phone:"+phone);
		 System.out.println("Salary: $"+salary);
	 }
 }
 class Tester extends Employee
 {
	 private int projectID;
	 private String projectName;
	 
	 public Tester(int empID,String name,String phone,double salary,int projectID,String projectName)
	 {
		 super(empID,name,phone,salary);
		 this.projectID=projectID;
		 this.projectName=projectName;
	 }
	 public void displayDetails() {
		 super.displayDetails();
		 System.out.println("Project ID:"+projectID);
		 System.out.println("Project Nmae:"+projectName);
		 System.out.println("--------------------------------");
		 
	 }
 }
 class Developer extends Employee
 {
	 private String projectName;
	 public Developer(int empID,String name,String phone,double salary,String projectName)
	 {
		 super(empID,name,phone,salary);
		 this.projectName=projectName;
	 }
	 
	 public void displayDetails()
	 {
		 super.displayDetails();
			 System.out.println("Project Nmae:"+projectName);
			 System.out.println("--------------------------------");
		 }
	 }
 
public class OverrideDemo {

	public static void main(String[] args) {
		Tester tester1=new Tester(1,"alice","1234567899",6000,101,"P-A");
		Tester tester2=new Tester(2,"klice","1236567999",9000,102,"P-B");
        Developer developer1=new Developer(3,"Charlie","4785248968",8000,"P-C");
        Developer developer2=new Developer(4,"Chandu","4785948368",3000,"P-D");
        System.out.println("tester1 Details: ");
        tester1.displayDetails();
        System.out.println("tester2 Details: ");
        tester2.displayDetails();
        System.out.println("Developer1 Details: ");
        developer1.displayDetails();
        System.out.println("Developer 2 Details: ");
        developer2.displayDetails();
        
	}
}
