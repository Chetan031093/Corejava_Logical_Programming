import java.util.Scanner;

public class Contrl_statement
{
	public static void main(String[] args)
	{
		String username = "Java";
		String password = "mava";
		
		System.out.println("progrrame started");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("pls enter any un :");
		System.out.println("pls enter any pwd : ");
		
		
		String word = sc.next();
		String word1 = sc.next();
		
		
		if(username.equals(word) && password.equals(word1))
		{
			System.out.println("welcome to application");
			
			
		}
		else
		{
			System.out.println("sworry !! un and password are nor matching");
		}
	}
}
