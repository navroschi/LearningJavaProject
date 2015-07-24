public class PassPrimitiveByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=3;
		
		// invoke passMethod() with 
        // x as argument
		passMethod(x);
		
		// print x to see if its 
        // value has changed
		System.out.println("Value of x is: " + x);
	}
		
		// change parameter in passMethod()
		public static void passMethod(int p){
			p = 10;
			System.out.println("Value of x is when running method is: " + p);
		} 
}

