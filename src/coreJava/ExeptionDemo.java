package coreJava;

public class ExeptionDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int b = 7;
		int c=0;

		try {
			int k = b/c;
			System.out.println(k);
//			int arr[] = new int[5];
//			System.out.println(arr[7]);
		}
		
		catch(ArithmeticException et)
		{
			System.out.println("I caught the Arithmetic error/exception");
		}
		
		catch(IndexOutOfBoundsException ets)
		{
			System.out.println("I caught IndexOutOfBound Exception");
		}
		
		catch(Exception e)
		{
			System.out.println("There is the error/exception");
		}
		
		finally
		{	
			System.out.println("delete cookies"); //This block is exectuted irrespective of exception thrown or not
		}
	}

}
