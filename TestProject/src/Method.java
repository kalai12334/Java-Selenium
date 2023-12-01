import java.security.DomainCombiner;

public class Method {

 static String Nameof(String fullName, String middleName, String lastName) {
	 
	String mynameis=fullName+middleName+lastName;
		return   mynameis;
	}
	


	public static void main(String[] args) {
	String	answer=Nameof("klai","subbu", "vani");
		System.out.println( answer);
	}
}



