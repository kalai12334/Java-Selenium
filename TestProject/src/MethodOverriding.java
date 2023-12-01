
public class MethodOverriding extends ParentMethodriding{

	
	 static void writeTest() {
		System.out.println("I am child test now");
	}
	
	public static void main(String[] args) {
		MethodOverriding m1=new MethodOverriding();
	     m1.writeTest();

	}

}
