package chandana;
import java.util.Scanner;
	class Father
	{
	int Fage;
	Scanner input = new Scanner(System.in);
	Father()
	{
	System.out.println("Enter father's age:");
	Fage=input.nextInt();
	}
	}
	class Son extends Father{
	 int Sage;
	 Scanner input = new Scanner(System.in);
	Son()
	{
	System.out.println("Enter son's age:");
	Sage=input.nextInt();
	}
	}
	class WrongAgeException extends Exception
	{
	 public WrongAgeException(String str) {
	System.out.println(str);
	}
	}

class ExceptionDemo
{
public static void main(String args[]) throws WrongAgeException
{
Son s=new Son();
try {
 if(s.Sage>=s.Fage)
 throw new WrongAgeException("Exception:");
 else
 System.out.println("You have entered a Valid Age");
 } 
catch(WrongAgeException e) {
System.out.println(e + " SON'S AGE >= FATHER'S AGE");
}
}
}