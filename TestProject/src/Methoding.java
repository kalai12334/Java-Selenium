 class Methoding {

	String fulName;
	String MiddleName;
	String lastName;
	 
	 String Name() {
		
		return fulName+MiddleName+lastName;
	}
	
	 public class Test{
		
	public static void main(String[] args) {
		
	 Methoding mth =new Methoding();
	 mth.fulName="kalai";
	 mth.lastName="vani";
	 mth.MiddleName="subbu";
	 
	String answ=mth.Name();
	System.out.println(answ);
			 
	}

}
}