import java.util.Scanner;

public class ScannerTest {
	
public static void main(String[] args) {
		
	int number;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a number:");
	number= scanner.nextInt();
	
	if(number>0) {
		System.out.println("number is greater than 0");
	}
	else {
		System.out.println("number is lesser than 0");
	}
}
}
