package chandana;

public class AddNumber {

	public int add(int num1,int num2) {
		return num1+num2;
		
	}
	
	public double add(double num1,double num2) {
		return num1+num2;
		
	}
	
	public int add(int num1,int num2,int num3) {
		return num1+num2+num3;
		
	}
	
	public static void main(String[] args)
	{
		AddNumber a=new AddNumber();
		int sum1=a.add(2, 4);
		System.out.println("Sum of 2 and 4:"+sum1);
		
		double sum2=a.add(5, 4);
		System.out.println("Sum of 5 and 4:"+sum2);
		
		int sum3=a.add(2, 4,6);
		System.out.println("Sum of 2 and 4 and 6:"+sum3);
		
	}
	
}
