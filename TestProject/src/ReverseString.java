import java.util.Scanner;

public class ReverseString{
	public static void main(String[] args) {
			
	Scanner sc =new Scanner(System.in);
	System.out.println("Enterusername:");
	String str=sc.nextLine();
    StringBuilder st=new StringBuilder(str);
    st.reverse();
    System.out.println(st);
    
    
     String name= "Ente##use|rname";
     String[] str1=name.split(" ");
      for(String a :str1) {
    	  System.out.println(a);
      }
	}
}