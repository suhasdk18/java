package chandana;

public class Customer {
private int custID;
private String name;
private int age;
private String phone;
private String place;

public Customer(int custID,String name,int age,String phone,String place)
{
	this.custID=custID;
	this.name=name;
	this.age=age;
	this.phone=phone;
	this.place=place;

}
	public static void main(String[] args) {
		Customer c= new Customer(1,"chandu",20,"9045688987","mandya");
		System.out.println("Customer details 1:");
		System.out.println("CustId:"+c.custID +"  "+"Name:"+c.name+"  " +"Age:"+c.age+"  "+"Phoneno:"+c.phone+"  "+"Place:"+c.place);
		Customer cc= new Customer(2,"inchu",21,"9045685987","mandya");
		System.out.println("Customer details 2:");
		System.out.println("CustId:"+cc.custID+"  " +"Name:"+cc.name+"  " +"Age:"+cc.age+"  "+"Phoneno:"+cc.phone+"  "+"Place:"+cc.place);
		Customer ccc= new Customer(3,"inchu",22,"9045675987","mandya");
		System.out.println("Customer details 3:");
		System.out.println("CustId:"+ccc.custID+"  " +"Name:"+ccc.name+"  " +"Age:"+ccc.age+"  "+"Phoneno:"+ccc.phone+"  "+"Place:"+ccc.place);
	}

}
