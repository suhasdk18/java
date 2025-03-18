package chandana;
class Book1
{
	private String name;
	private String author;
	private double price;
	private int numOfPages;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setAuthor(String author)
	{
		this.author=author;
	}
	
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public int getNumOfPages()
	{
		return numOfPages;
	}
	
	public void setNumOfPages(int numOfPages)
	{
		this.numOfPages=numOfPages;
	}
	
	public String toString()
	{
		return"Book Details:\n"+
	"Name:"+name+"\n"+
				"Author:"+author+"\n"+
	"Price:"+price+"\n"+
				"Number of Pages:"+numOfPages;
	}
}
public class BookDemo1 {

	public static void main(String[] args) {
		int n=2;
		Book1[] books=new Book1[n];
		
		books[0]=new Book1();
		books[0].setName("Java programming");
		books[0].setAuthor("John Doe");
		books[0].setPrice(29.99);
		books[0].setNumOfPages(400);
		books[1]=new Book1();
		books[1].setName("DAA");
		books[1].setAuthor("Jane smith");
		books[1].setPrice(39.88);
		books[1].setNumOfPages(490);
		System.out.println("Book Details");
		for(int i=0;i<n;i++)
		{
			System.out.println("Book:"+(i+1));
			System.out.println(books[i].getName());
			System.out.println(books[i].getAuthor());
			System.out.println(books[i].getPrice());
			System.out.println(books[i].getNumOfPages());
		}
		System.out.println("Book Details:\n");
		for(int i=0;i<n;i++)
		{
			System.out.println(books[i].toString());
		}
	}

}
