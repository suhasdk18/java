package chandana;
interface Shape
{
	void printArea();
}

class Rectangle implements Shape
{
	private double length;
	private double width;
	
	public Rectangle(double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	
	public void printArea()
	{
		double area=length*width;
		System.out.println("Area of rectangle:"+area);
	}
}

class Triangle implements Shape
{
	private double base ;
	private double height ;
	
	public Triangle(double base,double height)
	{
		this.base=base;
		this.height=height;
	}
	public void printArea()	
	{
		double area=0.5*base*height;
		System.out.println("Area of triangle:"+area);
	}
	
}
class Circle implements Shape
{
	private double radius ;
	public Circle(double radius)	
	{
		this.radius=radius;
	}
	public void printArea()	
	{
		double area=Math.PI*radius*radius;
		System.out.println("Area of Circle:"+area);
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		Rectangle r=new Rectangle(5,10);
		Triangle t=new Triangle(6,8);
		Circle c=new Circle(4);
		
		r.printArea();
		t.printArea();
		c.printArea();
		
		
	}

}
