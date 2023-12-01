
public class Methodoverloading {

	private static final String FirstNameandLastName = null;


	static String name()
	{
		System.out.println("empty name");
		String noname = "Empty name";
		return noname;
	}
	
	static String name(String FirstName)
	{
		System.out.println("first name");
		return FirstName;
	}
	
	
	static String name(String FirstName,String LastName)
	{
		System.out.println("first  and last name");
		return FirstName+LastName;
	}
	
	
	public static void main(String[] args) {
            System.out.println(name());
            System.out.println(name("kalai"));
            System.out.println(name("kalai","vani"));
	}

}
