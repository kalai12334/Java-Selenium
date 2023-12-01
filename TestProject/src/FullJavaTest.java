
public class FullJavaTest {

	int rollNumber;
	String name;
	
 static	void meow(){
		System.out.println("I am Meow method");
	}
	
	public static  void test() {
		System.out.println("I am test method");
	}
	
	public static void test1(String name, int addr) {
		if(name == "kalai") {
			System.out.println("yes name is correct");
		}else if (addr==201)
		{
			System.out.println(" name is kalai");
		}
		else 
			System.out.println("I am different");
		
	}
	
	public static void main(String[] args) {
		test();
		meow();
		test1("kali", 1);
	}
}
