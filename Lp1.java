/*
 * Logical programme on post unary operator. 
 * output
 * progrrame started
 * value of i is :3
 * value of j is :7
 * progrrame ended
 */
public class Lp1 
{
	public static void main(String[] args)
	{
		System.out.println("progrrame started");
		int i = 0;
		int j = 0;
		
		j = i++ + i + i++ + i++ + i;
		
		System.out.println("value of i is :" +i);
		System.out.println("value of j is :" +j);
		System.out.println("progrrame ended");
	}

}
