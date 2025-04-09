public class ConversionExample 
{

	public static void main(String[] args) 
	{
		ConversionExample obj = new ConversionExample();
		obj.go();

	}
	
	public  ConversionExample()
	{
		System.out.println("in constructor");
		
		int num1;
		float num2;
		double num3;
		char c;
		
		num1 = 10;
		num2 = num1;  //widening conversion
		num1 = (int) num2; //narrowing conversion, it doesn't round
		
		num2 = 0.0000001f;
		num3 = 0.0000001;
		num2 = (float) num3;
		num3 = num2;
		
		c = '0';
		num1 = c;
		System.out.println("unicode ="+num1);
		//c = (char) num1;
		
		
		
		
		
	}
	
	public void go()
	{
		System.out.println("in go");
	}

}
