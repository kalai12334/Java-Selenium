public class Constructor1{
	
	int length;
	int breadth;
	String name;
	int rollno;
		int circlesize1;
	Constructor1(){
	 length=1;
		breadth=2;
	}
	
	Constructor1(String s, int n){
		name =s;
		rollno=n;
	}
	
	public static void main(String[] args) {
		Constructor1 c1=new Constructor1 ();
		Constructor1 c2=new Constructor1 ("kalai",12);
		System.out.println(c1.length);
		System.out.println(c1.breadth);
		System.out.println(c2.name);
		System.out.println(c2.rollno);
		
	}
	
}