public class ArrayExample 

{

	public static void main(String[] args) 
	{
		int[] scores; //type is integer array
		scores = new int[5]; //create array with 10 elements 0--9
		
		int element = 1; //variable to "index" the array
		System.out.println("Scores are:");
		
		while(element < scores.length) //loop for each element starting at zero (the property "scores.length" is the length of the array)
		{
			scores[element] = 10 * element;
			System.out.println("scores["+element+"] = "+scores[element]);
			element ++;
		}
		
		System.out.println("\n\nPrices are:");
		float[] prices = new float[10];
		
		for(element = 0; element < prices.length; element++)
		{
			prices[element] = 10 * element;
			System.out.println("prices["+element+"] = "+prices[element]);
		}
		
		System.out.println("***FINISHED***");
	}

}

