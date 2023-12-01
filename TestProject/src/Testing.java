class Testing {
int length;
int breadth;
int height;
  int volume()

   {
	   return length+breadth+height;
   }
   
  public class TestDemo{
	   
	public static void main(String[] args) {
		
		Testing mthod=new Testing();
       
       mthod.length=10;
       mthod.breadth=9;
       mthod.height=9;

       System.out.println(mthod.volume());
	}
  }
  
}


