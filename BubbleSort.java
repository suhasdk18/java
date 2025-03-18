package chandana;

public class BubbleSort {

	public static void main(String[] args) {
		String[] stringArray = {"Apple","Orange","Banana","Grape","Pineapple"};
		int n = stringArray.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(stringArray[j].compareTo(stringArray[j+1])>0)
				{
					String temp=stringArray[j];
					stringArray[j]=stringArray[j+1];
					stringArray[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted string array:");
		for(String element : stringArray)
		{
			System.out.println(element);
		}
	}
}
