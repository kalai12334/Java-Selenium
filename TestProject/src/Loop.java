import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		int a=11;
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value:?");
		int b =sc.nextInt();
		System.out.println(b);
		if(a>b)
			System.out.println("a is is greater value");
		else
			System.out.println("b is gretaer value");
	}

}
