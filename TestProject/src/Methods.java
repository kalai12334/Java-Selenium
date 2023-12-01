
public class Methods {

	static String NameOf(String firstName,String middleName,String lastName)
{
	String fullName=firstName+middleName+lastName;
	
	return fullName;
	
}
	public static void main(String[] args) {
		
		String mynameis=NameOf("Kalai","Vani","Subbu");
		System.out.println(mynameis);
	}

}