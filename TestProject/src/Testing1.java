
public class Testing1 {
 
	int a=90;
	 float f=a;

 static int add(int x, int y) {
 return x+y;
	
}
 
static  int add(int x, int y, int z) {
  int s=x+y+z;
	return s;
}

 public static void main(String[] args) {
	int y=add(8, 8);
	int test=add(8,8, 7);
	System.out.println(y);
	System.out.println(test); 
	int a=90;
	float f =a;
	 int y1=(int)f;
	System.out.println(f);
	System.out.println(y1);
	
	 
}
}