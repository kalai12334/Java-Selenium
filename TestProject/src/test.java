public class test {
	
	
	static String testName(String name1,String name2, String name3) {
		
		String addingName;
		addingName=name1+name2+name3;
		
		return addingName;
	}
	
	
	public static void main(String[] args) {
		
	String fullname=testName("kalai","vani","S");
		System.out.println(fullname);
	}
	
}