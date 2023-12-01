
public class SubJavaMethod {
    
String name="kalau";
int a=2;
	
public void display ()
{
	String name ="love";
	System.out.println(name); //(method level)
	System.out.println(this.name); //instant variable (class level)
}
	
	
	public static void main(String[] args) {
		FullJavaShort f1=new FullJavaShort(); // if it is non static method, you need to create object
		f1.test2();
		SubJavaMethod f2= new SubJavaMethod();
		f2.display();
		//Static method you can directly call method by using class name .
	}
}
