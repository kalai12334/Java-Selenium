
public class StringTest {

public static void main (String[] args) {
	
	String s1="kalai";
	char ch[]= {'k','a','l','a','i'};
	String s1test=new String(s1);
	String s2test=new String(ch);
	String s3test=new String("example");
	
	System.out.println(s1test); 
	System.out.println(s2test); 
	System.out.println(s3test); 
}
}