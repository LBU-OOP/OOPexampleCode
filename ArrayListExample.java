import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListExample
{

	public ArrayListExample()
	{
		ArrayList riders = new ArrayList();
		Rider r1 = new Rider("Geraint Thomas", 11, 5.8f);
		Rider r2 = new Rider("Simon Yates", 15, 5.9f);
		Rider r3 = new Rider("Chris Froome", 14, 5.7f);
		riders.add(r1);
		riders.add(r2);
		riders.add(r3);
		Collections.sort( riders, new RiderComparitor());
		for(int i = 0; i<riders.size(); i++)
		{
			Rider r = (Rider) riders.get(i);
			System.out.println("Rider = "+r.name+" has "+r.wattsPerKilo+" watts/kg");
		}
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("***start***");
		ArrayListExample o = new ArrayListExample();
		//o.go();
		System.out.println("**end**");

	}
	
	class Rider
	{
		
		public String name;
		public int wins;
		public float wattsPerKilo;
		
		public Rider(String name, int wins, float wkg)
		{
			this.name = name;
			this.wins = wins;
			this.wattsPerKilo = wkg;
		}
		
	}
	
	class RiderComparitor implements Comparator <Rider>
	{
		public int compare(Rider one, Rider two)
		{
			if (one.wattsPerKilo > two.wattsPerKilo)
				return 1;
			else if (two.wattsPerKilo > one.wattsPerKilo)
				return -1;
			else
				return 0;
		}
		
	}

}
