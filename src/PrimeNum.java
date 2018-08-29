import java.util.ArrayList;

public class PrimeNum {

	ArrayList <Integer> primesList = new ArrayList<Integer>();
	
	public void finall(int end)
	{
		primesList.add(2); 
		
		for(int i = 2; i <= end; i++)
		{
			boolean add = true; 
			
			for(int j = 0; j <= primesList.size() - 1; j++)
			{
				if(primesList.get(j) > Math.sqrt(i))
				{
					break;
				}
				
				if(i % primesList.get(j) == 0)
				{
					add = false; 
					break; 
				}
			}
			if(add == true)
			{
			primesList.add(i);
			}
		}
	}
	
	public void printPrimes()
	{
		for(int i = primesList.size() -1 ; i >= 0; i--)
		{
			System.out.println(primesList.get(i));
		}
	System.out.println("There are " + primesList.size());
	}
	
}
