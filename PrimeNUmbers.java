package chandana;
import java.util.Scanner;
public class PrimeNUmbers 
{

	public static void main(String[] args) 
	{
           Scanner scanner = new Scanner(System.in);
        
           System.out.print("Enter an integer N: ");
            int N = scanner.nextInt();
            System.out.println("Prime numbers up to " + N + ":");
            for (int num = 2; num <= N; num++) {
            boolean isPrime = true;
            for (int i=2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        
        scanner.close();
    }
}
	