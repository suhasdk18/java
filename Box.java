package chandana;

public class Box 
{
 double width;
 double height;
 double depth;
 
 public Box() 
 {
	width=1.0;
	height=1.0;
	depth=1.0;
 }
 public Box(double width,double height,double depth)
 {
	 this.width=width;
	 this.height=height;
	 this.depth=depth;
 }
 public double volume() 
 {
    return width*height*depth;
 }
 
	public static void main(String[] args) 
	{
	
Box box1=new Box();
System.out.println("Box1 ");
System.out.println("width: "+box1.width);
System.out.println("height : "+box1.height);
System.out.println("depth: "+box1.depth);
System.out.println("Volume: "+box1.volume());
System.out.println();


Box box2=new Box(2,7,9);
System.out.println("Box2 ");
System.out.println("width: "+box2.width);
System.out.println("height : "+box2.height);
System.out.println("depth: "+box2.depth);
System.out.println("Volume: "+box2.volume());
System.out.println();
	}

}
