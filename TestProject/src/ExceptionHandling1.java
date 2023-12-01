
public class ExceptionHandling1 {

	public static void main(String[] args) {
		
		ExceptionHandling1 obj= new ExceptionHandling1 ();
		
		obj.sum();
	}
		
		public void sum()  throws ArithmeticException {
			div();
		}

public void div() throws ArithmeticException  {
			int a=1/0;
		}

		
	}

