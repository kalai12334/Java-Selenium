

public class HomePriceifelse {
   
	
  static int laptopSize(int length, int breadth, int height) // method defintion
	{
		int total;
		total= length*breadth*height;
		return total;
		
	}
	
	
	
	public static void main(String[] args) {
		int value=laptopSize(1,2,3); //passing arguments
		System.out.println(value);
	}

	
}
