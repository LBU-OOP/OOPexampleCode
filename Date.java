public class Date 
{
	private int day, month, year; //instance variables
	
	public Date()
	{
		day = 1;
		month = 1;
		year = 2018;
		System.out.println("inside Date()");
	}
	
	public Date(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
		System.out.println("inside Date(int,int,int)");
	}
	
	
	public Date(double week, int month, int year)
	{
		
	}
	
	public void setDay(int day)
	{
		if (day >0 && day <=31)
		{
			this.day = day;
		}
	}
	
	public int getDay()
	{
		return day;
	}
}
