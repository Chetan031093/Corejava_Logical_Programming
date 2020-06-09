/*
 * Logical programme on pre and post unary operator. 
 * progrrame started
 * value of i is :6
 * value of j is :23
 * progrrame ended
 */
public class Lp2 
{
	public static void main(String[] args)
	{
		System.out.println("progrrame started");
		int i = 0;
		int j = 0;
		
		j = i++ + ++i + i++ + i++ + ++i + i++ + i;
		
		System.out.println("value of i is :" +i);
		System.out.println("value of j is :" +j);
		System.out.println("progrrame ended");
	}

}
