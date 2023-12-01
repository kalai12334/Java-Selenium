
public class Test1 {


public static void printLine() {
	System.out.println(".................");
}
 static String stringTest (String firstname,String lastname)
{
	String fullName=firstname+lastname;
	return fullName;
}


public static void main(String[] args) {
	printLine();
	stringTest("kalai", "vani");
	System.out.println(stringTest("kalai", "vani"));
}

}