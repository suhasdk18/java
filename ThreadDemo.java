package chandana;
class CollegeNameThread extends Thread
{
	public void run()
	{
		while(true)
		{
			System.out.println("Vidyavardhaka College of Engineering");
			try
			{
				Thread.sleep(10000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}


class DepartmentThread extends Thread
{
	public void run()
	{
		while(true)
		{
			System.out.println("ISE");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		CollegeNameThread C=new CollegeNameThread();
		DepartmentThread D=new DepartmentThread();
		C.start();
		D.start();
		
	}

}
