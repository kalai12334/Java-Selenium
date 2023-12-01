public class Methodoverloading1 {

	public static int totalLengthofBottle(int L,int B,int H)
	{
		int totallength=L*B*H;
		return totallength;
		
	}
	
	public static int totalLengthofBottle(int L,int B)
	{
		int totallength=L*B;
		return totallength;
		
	}
	
	public static void main(String[] args) {
		int bL=totalLengthofBottle(1,2,3);
		int bLs=totalLengthofBottle(2,3);
		System.out.println(bL);
		System.out.println(bLs);
	}
}
