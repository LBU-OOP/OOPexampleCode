import java.util.Scanner;

public class ExceptionExample 
{

	public static void main(String[] args) 
	{
		ExceptionExample obj;
		obj = new ExceptionExample();
		obj.go();

	}
	
	public void go()
	{
		Scanner scan = new Scanner(System.in);
		
		String line1, line2;
		int number1, number2;
		
		number1 = -1;
		number2 = -1;
		System.out.println("enter number 1");
		line1 = scan.nextLine();
		System.out.println("enter number 2");
		line2 = scan.nextLine();
		
		try
		{
			number1 = Integer.parseInt(line1);
			
		}catch( java.lang.NumberFormatException e)
		{
			System.out.println("number 1 was not a number "+e);
			//return;
		}
		try
		{
			
			number2 = Integer.parseInt(line2);
		}catch( java.lang.NumberFormatException e)
		{
			System.out.println("number 2 was not a number");
			//return;
		}
		
		if(number1==-1 || number2==-1)
		{
			return;
		}
		
		System.out.println("The number1 x number2 :"+number1*number2);
		
		System.out.println("bye");
		scan.close(); //it gets closed right after this,when the program exits, but it stops the warning
	}

}
