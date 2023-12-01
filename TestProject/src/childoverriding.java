
public class childoverriding extends Masteroverriding{

	void add ()
	{
		System.out.println("I am adding from child class");
	}
	
	 static int add (int x, int y) {
		 int z=x+y;
		return z;
	 }
	public static void main(String[] args) {
		
		childoverriding ch1=new childoverriding();
		childoverriding ch2=new childoverriding(2,4);
		ch1.add();
		ch2.add(2,4);
		
	}

}
